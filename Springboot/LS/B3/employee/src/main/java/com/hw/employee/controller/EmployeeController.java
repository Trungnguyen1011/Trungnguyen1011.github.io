package com.hw.employee.controller;

import javax.validation.Valid;

import com.hw.employee.model.Employee;
import com.hw.employee.model.SearchRequest;
import com.hw.employee.repository.EmployeeDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("list", employeeDao.getAll());
        model.addAttribute("active", "home");
        return "home";
    }

    @GetMapping("/{id}")
    public String employee(@PathVariable("id") int id, Model model) {
        model.addAttribute("employee", employeeDao.get(id).get());
        return "individual";
    }

    @GetMapping("/add")
    public String addEmployee(Model model) {
        model.addAttribute("newEmployee", new Employee());
        model.addAttribute("list", employeeDao.getAll());
        model.addAttribute("formBox", true);
        model.addAttribute("active", "add");
        return "home";
    }

    @PostMapping("/add")
    public String submitedEmployee(@Valid @ModelAttribute(name="newEmployee") Employee newEmployee, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("list", employeeDao.getAll());
            model.addAttribute("formBox", true);
            return "home";
          } else {
            employeeDao.add(newEmployee);
        }
            return addEmployee(model);
    }

    @GetMapping("/{id}/edit")
    public String editing(@PathVariable("id") int id, Model model) {
        model.addAttribute("employee", employeeDao.get(id).get());
        model.addAttribute("formBox", true);
        return "individual";
    }

    @PostMapping("/{id}/edit")
    public String edited(@PathVariable("id") int id, @Valid @ModelAttribute(name="employee") Employee employee, BindingResult result, Model model) {
        if (!result.hasErrors()) {
            employee.setId(id);
            employeeDao.update(employee);
        } else {
            employee.setPhotoName(employeeDao.get(id).get().getPhotoName());
            model.addAttribute("formBox", true);

            return "individual";
        }

        return "redirect:/employee/{id}/edit";
    }

    @GetMapping("/{id}/delete")
    public String deleted(@PathVariable("id") int id, Model model) {
        employeeDao.deleteByID(id);
        return home(model);
    }

    @GetMapping("/search")
    public String search(Model model) {
        model.addAttribute("searchRequest", new SearchRequest());
        model.addAttribute("showSeacrhBar", true);
        model.addAttribute("active", "search");
        return "home";
    }

    @PostMapping("/search")
    public String seacrhResult(SearchRequest searchRequest, BindingResult result, Model model) {

        if (!result.hasErrors()) {
            model.addAttribute("list", employeeDao.searchByKeyword(searchRequest.getKeywords()));

        }
        return search(model);
    }
}

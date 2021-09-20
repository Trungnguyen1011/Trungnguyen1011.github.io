package vn.techmaster.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.techmaster.bookstore.model.Book;
import vn.techmaster.bookstore.model.IntegerRequest;
import vn.techmaster.bookstore.repository.BookDao;

@Controller
@RequestMapping("/book")
public class BookController {
  @Autowired
  private BookDao bookDao;

  @GetMapping
  public String listAll(Model model) {
    model.addAttribute("books", bookDao.getAll());
    return "allbooks";
  }

  @GetMapping("/getbook")
  public String getbook(Model model) {
    model.addAttribute("books", bookDao.getAll());
    model.addAttribute("getRequest", new IntegerRequest());
    return "getbook";
  }

  @PostMapping("/getbook")
  public String getbook(@ModelAttribute IntegerRequest getRequest, BindingResult bindingResult, Model model) {

    if (!bindingResult.hasErrors()) {
      try {
        Book result = bookDao.getBook(getRequest.getId().intValue());
        model.addAttribute("book", result);
      } catch (Exception e) {
        model.addAttribute("getRequest", getRequest);
        return "getbook";
      }

    }
    model.addAttribute("getRequest", getRequest);
    return "getbook";

  }

  @GetMapping("/addbook")
  public String addbook(Model model) {
    model.addAttribute("books", bookDao.getAll());
    model.addAttribute("addingRequest", new Book());
    return "addbook";
  }

  @PostMapping("/addbook")
  public String addbook(@ModelAttribute Book addingRequest, BindingResult bindingResult, Model model) {

    if (!bindingResult.hasErrors()) {
      bookDao.add(addingRequest);
    }

    model.addAttribute("addingRequest", addingRequest);
    model.addAttribute("books", bookDao.getAll());
    return "addbook";
  }

  @GetMapping("/removebook")
  public String removebook(Model model) {
    model.addAttribute("books", bookDao.getAll());
    model.addAttribute("removeRequest", new IntegerRequest());
    return "removebook";
  }

  @PostMapping("/removebook")
  public String removebook(@ModelAttribute IntegerRequest removeRequest, BindingResult bindingResult, Model model) {

    if (!bindingResult.hasErrors()) {
      try {
        bookDao.deleteByID(removeRequest.getId().intValue());
      } catch (Exception e) {
        model.addAttribute("removeRequest", removeRequest);
        model.addAttribute("books", bookDao.getAll());
        return "removebook";
      }

    }

    model.addAttribute("removeRequest", removeRequest);
    model.addAttribute("books", bookDao.getAll());
    return "removebook";
  }

  @GetMapping("/updatebook")
  public String updatebook(Model model) {
    model.addAttribute("books", bookDao.getAll());
    model.addAttribute("updateRequest", new Book());
    return "updatebook";
  }

  @PostMapping("/updatebook")
  public String updatebook(@ModelAttribute Book updateRequest, BindingResult bindingResult, Model model) {

    if (!bindingResult.hasErrors()) {
      try {
        bookDao.update(updateRequest);

      } catch (Exception e) {
        model.addAttribute("updateRequest", updateRequest);
        model.addAttribute("books", bookDao.getAll());
        return "updatebook";
      }

    }

    model.addAttribute("updateRequest", updateRequest);
    model.addAttribute("books", bookDao.getAll());
    return "updatebook";
  }
}

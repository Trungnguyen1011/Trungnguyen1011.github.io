package com.hw.employee.service;

import java.io.IOException;
import java.util.List;

import com.hw.employee.model.Employee;
import com.hw.employee.model.UploadRequest;
import com.hw.employee.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements CustomService<Employee> {

  @Autowired
  EmployeeRepository employeeRepo;

  public void saveFile(UploadRequest file) {
    Employee newEmployee;
    try {
      newEmployee = Employee.builder().firstName(file.getFirstName()).lastName(file.getLastName())
          .emailId(file.getEmailId()).passportNumber(file.getPassportNumber()).photo(file.getPhoto().getBytes())
          .build();
          if(file.getId() != null) {
            newEmployee.setId(file.getId());
          }
      employeeRepo.save(newEmployee);
    } catch (IOException e) {
      e.getMessage();
    }

  }

  public void editFile(UploadRequest file, Long id) {
    file.setId(id);
    saveFile(file);

  }



  @Override
  public List<Employee> getAll() {
   
    return employeeRepo.findAll();
  }

  @Override
  public void deleteFile(Employee t) {
    employeeRepo.delete(t);

  }

  @Override
  public Employee getById(Long id) {
    return employeeRepo.findById(id).get();
  }

  @Override
  public void deleteFileById(Long id) {
    deleteFile(getById(id));

  }

  @Override
  public List<Employee> search(String keyword) {

    return employeeRepo.search(keyword);
  }

}

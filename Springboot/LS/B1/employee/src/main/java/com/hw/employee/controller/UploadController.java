package com.hw.employee.controller;


import com.hw.employee.service.EmployeeService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadController {
  @Autowired
  EmployeeService employeeService;

}
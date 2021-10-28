package com.hw.employee.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.hw.employee.model.PhotoRequest;
import com.hw.employee.repository.EmployeeDao;
import com.hw.employee.service.StorageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadController {
  @Autowired
  StorageService storageService;



  @PostMapping("/upload")
  public ResponseEntity<String> upload(@ModelAttribute @Valid PhotoRequest photoRequest, HttpServletRequest request) {
    if (photoRequest.getFile() == null) {
      return ResponseEntity.ok().body("ex");
		}

    String baseUrl = request.getRequestURL().substring(0, request.getRequestURL().length() - request.getRequestURI().length()) 
    + request.getContextPath();

    String newFileName = storageService.savePhoto(photoRequest);
    return ResponseEntity.ok().body(baseUrl + "/images/" + newFileName);
  } 
}
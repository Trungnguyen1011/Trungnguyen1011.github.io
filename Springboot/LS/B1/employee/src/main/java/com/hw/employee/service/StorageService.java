package com.hw.employee.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageService {
  @Value("employee/src/main/resources/static/images/")
  private String path;

  public void uploadFile(MultipartFile file) {

    String fileName = file.getOriginalFilename();
    try {
      var is = file.getInputStream();
      Files.copy(is, Paths.get(path + fileName), StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
      e.getMessage();
    }
  }
}

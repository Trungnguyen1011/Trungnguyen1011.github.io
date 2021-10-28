package com.hw.employee.service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.transaction.Transactional;

import com.hw.employee.model.Photo;
import com.hw.employee.model.PhotoRequest;
import com.hw.employee.repository.PhotoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageService {
  @Value("employee/src/main/resources/static/images/")
  public String path;
  
  @Autowired
  public PhotoRepository photoRepository;

  public void uploadFile(MultipartFile file) {

    String fileName = file.getOriginalFilename();
    try {
      var is = file.getInputStream();
      Files.copy(is, Paths.get(path + fileName), StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
      e.getMessage();
    }
  }
  @Transactional(rollbackOn = {Exception.class})
  public String savePhoto(PhotoRequest photoRequest) {
    MultipartFile file = photoRequest.getFile();
    
    Photo photo = new Photo(file.getOriginalFilename(), file.getSize(), photoRequest.getDescription());
    photoRepository.save(photo);
    long id = photo.getId();
    String newFileName = id + "_" + file.getOriginalFilename();
    photo.setFileName(newFileName);
    String newFileNameWithPath = path + newFileName;
    try {
      InputStream is = file.getInputStream();      
      Files.copy(is, Paths.get(newFileNameWithPath), StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
     e.getMessage();
    }
    photoRepository.save(photo);
    photoRepository.flush();

    return newFileName;    
  }
}

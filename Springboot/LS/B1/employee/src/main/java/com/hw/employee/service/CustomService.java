package com.hw.employee.service;

import java.util.List;

public interface CustomService<T> {
    List<T> getAll();
    void deleteFile (T t);
    T getById(Long id);
    void deleteFileById (Long id);
    List<T> search (String keyword);

    
}

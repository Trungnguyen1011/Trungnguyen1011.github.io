package com.hw.employee.repository;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.hw.employee.model.Employee;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

@Repository
public class EmployeeDao extends Dao<Employee> {
  public EmployeeDao() {
    this.readCSV("employees.csv");
  }

  @Override
  public void add(Employee t) {
    int id;
    if (collections.isEmpty()) {
      id = 1;
    } else {
      Employee latestOne = collections.get(collections.size() - 1);
      id = latestOne.getId() + 1;
    }
    t.setId(id);
    collections.add(t);

  }

  @Override
  public void delete(Employee t) {
    collections.remove(t);

  }

  @Override
  public void deleteByID(int id) {
    Optional<Employee> toDelete = collections.stream().filter(t -> t.getId() == id).findFirst();

    if (toDelete.isPresent()) {
      delete(toDelete.get());

    }

  }

  @Override
  public Optional<Employee> get(int id) {
    return collections.stream().filter(t -> t.getId() == id).findFirst();
  }

  @Override
  public List<Employee> getAll() {
    return collections;
  }

  @Override
  public void readCSV(String csvFile) {
    try {
      File file = ResourceUtils.getFile("classpath:static/" + csvFile);
      CsvMapper mapper = new CsvMapper();
      CsvSchema schema = CsvSchema.emptySchema().withHeader().withColumnSeparator('|');
      ObjectReader oReader = mapper.readerFor(Employee.class).with(schema);
      Reader reader = new FileReader(file);
      MappingIterator<Employee> map = oReader.readValues(reader);
      while (map.hasNext()) {
        Employee employee = map.next();
        this.add(employee);
      }
    } catch (IOException e) {
      System.out.println(e);
    }

  }

  @Override
  public List<Employee> searchByKeyword(String keyword) {
    String lowerKeyword = keyword.toLowerCase();
    return collections.stream()
        .filter(t -> t.getFullName().toLowerCase().contains(lowerKeyword) || t.getEmailId().toLowerCase().contains(lowerKeyword))
        .collect(Collectors.toList());
  }

  @Override
  public void update(Employee t) {
    Optional<Employee> willBeUpdate = get(t.getId());

    if (willBeUpdate.isPresent()) {
      willBeUpdate.get().setFirstName(t.getFirstName());
      willBeUpdate.get().setLastName(t.getLastName());
      willBeUpdate.get().setEmailId(t.getEmailId());
      willBeUpdate.get().setPassportNumber(t.getPassportNumber());

    }
  }

}

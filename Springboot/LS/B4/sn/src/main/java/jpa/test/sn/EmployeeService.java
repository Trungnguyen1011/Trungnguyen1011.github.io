package jpa.test.sn;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  @Autowired
  EmployeeRepository employeeRepository;

  public Optional<Employee> findById(Long id) {
    return employeeRepository.findById(id);
  }

  public List<Employee> findByName(String keyword) {
    return employeeRepository.findByName(keyword);
  }

  public List<Employee> findByNameAndAge(String keyword, int age) {
    List<Employee> result = employeeRepository.findByName(keyword);
    return result.stream().filter(e -> e.getAge() == age).collect(Collectors.toList());
  }
  public List<Employee> findByEmail(String keyword) {
    
    return employeeRepository.findByEmail(keyword);
  }

public List<Employee> findByAgeRange(int floor, int ceiling) {
    return employeeRepository.findAll().stream().filter(e -> e.getAge() >= floor && e.getAge() <= ceiling).collect(Collectors.toList());
}
}

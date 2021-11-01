package com.hw.employee.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.hw.employee.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>, EmployeeCustomRepo<Employee>{
    @Query(
        value = "SELECT * FROM EMPLOYEE e WHERE e.firstName LIKE %?1% OR e.lastName LIKE %?1% OR e.emailId LIKE %?1%", 
        nativeQuery = true)
public List<Employee> search(String keyword);

}

package jpa.test.sn;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "SELECT * FROM employee e WHERE e.first_name LIKE %?1% OR e.last_name LIKE %?1%", nativeQuery = true)
    List<Employee> findByName(String keyword);
    @Query(value = "SELECT * FROM employee e WHERE e.email LIKE %?1%", nativeQuery = true)
    List<Employee> findByEmail(String keyword);
    
}

package jpa.test.sn;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Sql({ "/employee.sql" })
public class EmployeeTest {
    @Autowired
    EmployeeService employeeService;

    @Test
    public void testFindById() {
        Optional<Employee> employee = employeeService.findById(1L);
        assertThat(employee.isPresent());

    }

    @Test
    public void testFindByName() {
        List<Employee> employee = employeeService.findByName("Trung");
        assertThat(employee.size()).isLessThan(2);
        assertThat(employee.size()).isNotEqualTo(0);
    }

    @Test
    public void testFindByNameAndAge() {
        List<Employee> employee = employeeService.findByNameAndAge("Trang", 20);
        assertThat(employee.size()).isLessThan(2);
        assertThat(employee.size()).isNotEqualTo(0);
    }

    @Test
    public void testFindByEmail() {
        List<Employee> employee = employeeService.findByEmail("ntt");
        assertThat(employee.size()).isEqualTo(2);

    }

    @Test
    public void testFindByAgeRange() {
        List<Employee> employee = employeeService.findByAgeRange(10, 20);
        assertThat(employee.size()).isEqualTo(2);

    }
}

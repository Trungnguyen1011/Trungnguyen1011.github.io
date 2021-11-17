package jpa.test.sn;



import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name",nullable = false)
    private String firstName;
    @Column(name="last_name",nullable = false)
    private String lastName;
    @Column(name="gender",nullable = false)
    private String gender;
    @Column(name="address")
    private String address;
    @Column(name="email",nullable = false)
    private String email;
    @Column(name="salary",nullable = false)
    private Long salary;
    @Column(name="birth_day",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date bDay;
    @Transient
    public int getAge() {
       Date birthday = new Date (getBDay().getTime());
        LocalDate date = birthday.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate present = LocalDate.now(ZoneId.systemDefault());
        return Period.between(date, present).getYears();
    }

    @Transient
    public String getFullName() {
       String fullName = getFirstName() + " " + getLastName();
        return fullName;
    }
}

package com.hw.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String passportNumber;

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }
}

package com.hw.employee.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    @NotBlank(message = "First name cannot be blank")
    private String firstName;
    @NotBlank(message = "Last name cannot be blank")
    private String lastName;
    
    @NotBlank(message = "Email cannot null")
    @Email(message = "Not valid email")
    private String emailId;

    @NotBlank(message = "Passport Number is required")
    private String passportNumber;

    @JsonIgnore
    private MultipartFile photo;
    @JsonIgnore
    private String photoName;

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

}

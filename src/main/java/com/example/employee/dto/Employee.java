package com.example.employee.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private long employeeId;
    private String firstName;
    private String lastName;
    private String designation;
}

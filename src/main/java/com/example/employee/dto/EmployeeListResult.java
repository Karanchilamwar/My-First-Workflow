package com.example.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class EmployeeListResult {

    private List<Employee> employees;
    private int count ;

}

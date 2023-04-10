package com.example.employee.service;

import com.example.employee.dto.Employee;
import com.example.employee.dto.EmployeeListResult;

import java.util.Optional;

public interface IEmployeeService {

    EmployeeListResult getListOfEmployees();

    Optional<Employee> getEmployeeById(long id);
}

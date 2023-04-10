package com.example.employee.api;

import com.example.employee.dto.Employee;
import com.example.employee.dto.EmployeeListResult;
import com.example.employee.service.IEmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/employees")
public class EmployeeApi {

    private final IEmployeeService employeeService;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public EmployeeListResult getAllEmployees()
    {
        return employeeService.getListOfEmployees();
    }

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id)
    {
        log.info("inside the employee");
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        if(employee.isPresent())
        {
            return ResponseEntity.ok().body(employee.get());
        }
        return ResponseEntity.notFound().build();
    }
}

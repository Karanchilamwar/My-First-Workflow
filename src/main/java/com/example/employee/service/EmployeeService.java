package com.example.employee.service;

import com.example.employee.dto.Employee;
import com.example.employee.dto.EmployeeListResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmployeeService implements IEmployeeService {

    private static final List<Employee> employees = List.of(
            new Employee(1,"Spider","Man","CEO"),
            new Employee(2,"Jack","Jill","CTO"),
            new Employee(3,"Micky","Mouse","Architect"),
            new Employee(4,"Tom","Tommy","SCM"),
            new Employee(5,"Jerry","The Cat","PM"),
            new Employee(6,"Pokemaon","The cartoon","PO")
            );

    @Override
    public EmployeeListResult getListOfEmployees()
    {
        return new EmployeeListResult(employees, employees.size());
    }

    @Override
    public Optional<Employee> getEmployeeById(long id)
    {
        return employees.stream().filter(employee -> employee.getEmployeeId()==id)
                .findFirst();
    }
}

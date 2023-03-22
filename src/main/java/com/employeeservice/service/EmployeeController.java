package com.employeeservice.service;

import com.employeeservice.model.Employee;
import com.employeeservice.model.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class EmployeeController {
    @Autowired
    EmployeeDao service;
    @GetMapping("/employees")
    public List<Employee> getAll() {
        return service.getAllEmployees();
    }
}

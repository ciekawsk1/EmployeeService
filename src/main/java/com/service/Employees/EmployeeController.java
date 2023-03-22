package com.service.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class EmployeeController {
    final EmployeeDao service;
    @Autowired
    public EmployeeController(EmployeeDao service) {
        this.service = service;
    }

    @GetMapping("/employees")
    public List<Employee> getAll() {
        return service.getAllEmployees();
    }
}

package com.service.Employees;

import com.service.exception_handler.EmployeeNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @GetMapping("/employees/{empId}")
    public Employee getEmployeeById(@PathVariable int empId) {
        Employee employee = service.getEmployeeById(empId);
        if (null == employee)
            throw new EmployeeNotFound("Employee Not found.");
        return employee;
    }
    @PostMapping("/employees/user")
    public ResponseEntity<Object> saveEmployee(@RequestBody Employee emp) {
        Employee newEmployee = service.saveEmployee(emp);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{empId}")
                .buildAndExpand(newEmployee.getEmployeeId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/employees/delete/{empId}")
    public void deleteEmployee(@PathVariable int empId) {
        Employee emp = service.deleteEmployee(empId);
        if (null == emp)
            throw new EmployeeNotFound("Employee Not found.");
    }
}

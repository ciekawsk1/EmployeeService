package com.employeeservice.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class EmployeeDao {
    static List<Employee> list = new ArrayList<>();

    static {
        list.add(new Employee(1234, "Adam", "adam@email.com"));
        list.add(new Employee(1234, "Wojtek", "wojtek@email.com"));
        list.add(new Employee(1234, "Ewa", "ewa@email.com"));
    }

    public List<Employee> getAllEmployees() {
        return list;
    }
}

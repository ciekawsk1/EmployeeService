package com.service.Employees;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class Employee {
    private int empId;
    @Size(min=3, max =5, message ="Invalid chars for name!!!")
    private String name;
    @Email
    private String email;

    public Employee(int empId, String name, String email) {
        this.empId = empId;
        this.name = name;
        this.email = email;
    }

    public int getEmployeeId() {
        return empId;
    }

    public void setEmployeeId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

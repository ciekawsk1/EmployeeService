package com.service.Employees;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Component
public class EmployeeDao {
    public static List<Employee> list = new ArrayList<>();

    static {
        list.add(new Employee(1235, "Adam", "adam@email.com"));
        list.add(new Employee(1236, "Wojtek", "wojtek@email.com"));
        list.add(new Employee(1237, "Ewa", "ewa@email.com"));
    }

    public List<Employee> getAllEmployees() {
        return list;
    }

    public Employee getEmployeeById(int empId) {
        return list.stream()
                .filter(emp -> emp.getEmployeeId() == empId)
                .findAny()
                .orElse(null);
    }

    public Employee saveEmployee(Employee emp) {
        emp.setEmployeeId(list.size()+1);
        list.add(emp);
        return emp;
    }

    public Employee deleteEmployee(int empId) {
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (empId == emp.getEmployeeId()) {
                iterator.remove();
                return emp;
            }

        }
        return null;
    }
}

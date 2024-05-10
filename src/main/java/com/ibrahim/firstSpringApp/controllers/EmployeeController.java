package com.ibrahim.firstSpringApp.controllers;

import com.ibrahim.firstSpringApp.models.Employee;
import com.ibrahim.firstSpringApp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/employee/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping(value = "/employees/{id}")
    public Employee getEmployee(@PathVariable(value = "id") Long id) {
        return employeeService.getEmployee(id);
    }

    @DeleteMapping(value = "/employees/{id}")
    public void deleteEmployee(@PathVariable(value = "id") Long id) {
        employeeService.deleteEmployee(id);
    }

    @PutMapping(value = "/employees/{id}")
    public Employee updateEmployee(@PathVariable(value = "id") Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }
}

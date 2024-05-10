package com.ibrahim.firstSpringApp.services;

import com.ibrahim.firstSpringApp.models.Employee;
import com.ibrahim.firstSpringApp.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public Employee createEmployee(Employee employee) {
        return  employeeRepo.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee getEmployee(Long id) {
        return employeeRepo.findById(id).orElseThrow();
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Employee getEmp = this.getEmployee(id);
        getEmp.setName(employee.getName());
        getEmp.setAddress(employee.getAddress());
        return employeeRepo.save(getEmp);
    }
}

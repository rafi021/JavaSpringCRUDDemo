package com.ibrahim.firstSpringApp.services;

import com.ibrahim.firstSpringApp.models.Employee;
import com.ibrahim.firstSpringApp.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public Employee createEmployee(Employee employee) {
        return  employeeRepo.save(employee);
    }
}

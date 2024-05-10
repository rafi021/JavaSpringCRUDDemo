package com.ibrahim.firstSpringApp.repositories;

import com.ibrahim.firstSpringApp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}

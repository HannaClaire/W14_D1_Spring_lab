package com.employees.lab.example.employee.lab.repositories;

import com.employees.lab.example.employee.lab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}

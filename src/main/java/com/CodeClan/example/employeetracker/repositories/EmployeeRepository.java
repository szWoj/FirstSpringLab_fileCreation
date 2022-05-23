package com.CodeClan.example.employeetracker.repositories;

import com.CodeClan.example.employeetracker.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

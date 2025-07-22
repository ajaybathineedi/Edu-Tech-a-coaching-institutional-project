package com.example.demo13.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo13.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	  Optional<Employee> findByEmail(String email);
}

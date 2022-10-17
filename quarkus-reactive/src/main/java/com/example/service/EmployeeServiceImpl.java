package com.example.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class EmployeeServiceImpl {

	@Inject
	EmployeeRepository employeeRepository;

	public Uni<List<Employee>> getEmployees() {
		return employeeRepository.getEmployees();
	}

}

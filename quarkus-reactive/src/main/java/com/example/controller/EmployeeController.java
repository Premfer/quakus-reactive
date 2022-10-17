package com.example.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.example.model.Employee;
import com.example.service.EmployeeServiceImpl;

import io.smallrye.mutiny.Uni;

@Path("/employee")
public class EmployeeController {

	@Inject
	EmployeeServiceImpl employeeService;

	@GET
	@Consumes("application/json")
	@Produces("application/json")
	public Uni<List<Employee>> getEmployees() {
		return employeeService.getEmployees();
	}

}

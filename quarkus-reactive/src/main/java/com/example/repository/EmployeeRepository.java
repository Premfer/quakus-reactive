package com.example.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.hibernate.reactive.mutiny.Mutiny.SessionFactory;

import com.example.model.Employee;

import io.quarkus.hibernate.reactive.panache.common.runtime.ReactiveTransactional;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class EmployeeRepository {

	@Inject
	SessionFactory sf;

	// @Transactional
	@ReactiveTransactional
	public Uni<List<Employee>> getEmployees() {
		return sf.withTransaction(
				(s, t) -> s.createNativeQuery("select *  from employee", Employee.class).getResultList());
	}

}

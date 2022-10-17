package com.example.model;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@Cacheable
public class Employee {

	@Id
	@SequenceGenerator(name = "employeeSequence", sequenceName = "employee_sequence_id_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "employee_sequence_id_seq")
	private Long id;

	@Column(name = "unique_id", nullable = true, unique = true)
	private String uniqueid;

	@Column(name = "name", nullable = true, unique = true)
	private String name;

	@Column(name = "active")
	private boolean isActive;

	/**
	 * 
	 */
	public Employee() {
		super();
	}

	/**
	 * @param uniqueid
	 * @param name
	 * @param isActive
	 */
	public Employee(String uniqueid, String name, boolean isActive) {
		super();
		this.uniqueid = uniqueid;
		this.name = name;
		this.isActive = isActive;
	}

	/**
	 * @return the uniqueid
	 */
	public String getUniqueid() {
		return uniqueid;
	}

	/**
	 * @param uniqueid the uniqueid to set
	 */
	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}

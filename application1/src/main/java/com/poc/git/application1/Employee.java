package com.poc.git.application1;

public class Employee {
	private Integer employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private Double salary;
	private String address;
	//change2
	public Employee() {
	}

	public Employee(Integer employeeId, String employeeFirstName, String employeeLastName, Double salary) {
		//change22
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return employeeId + " " + employeeFirstName + " " + employeeLastName + " " + salary;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}

package week1.day5.assignment5.employees;

import java.util.ArrayList;

public class ContractEmployee extends Employee {

	public ContractEmployee(String name, int salary) {
		ArrayList<String> infra = new ArrayList<String>();
		infra.add("Access Card");
		this.setInfra(infra);
		this.setName(name);
		this.setSalary(salary);
	}

	@Override
	public int getCostToCompany() {
		return this.getSalary();
	}
	
	public void display() {
		System.out.println("Name: " + this.getName());
		System.out.println("Salary: " + this.getSalary());
		System.out.println("Cost to Company: " + this.getCostToCompany() + "\n");
	}
}

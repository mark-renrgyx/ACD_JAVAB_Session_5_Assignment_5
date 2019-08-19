package week1.day5.assignment5.employees;

import java.util.ArrayList;

public class PermanentEmployee extends Employee {
	private int retirement = 5000;
	private int healthCare = 12000;

	public PermanentEmployee(String name, int salary) {
		ArrayList<String> infra = new ArrayList<String>();
		infra.add("Laptop");
		infra.add("Cell Phone");
		infra.add("Access Card");
		this.setInfra(infra);
		this.setName(name);
		this.setSalary(salary);
	}

	@Override
	public int getCostToCompany() {
		return this.getSalary() + retirement + healthCare;
	}
	
	public void display() {
		System.out.println("Name: " + this.getName());
		System.out.println("Salary: " + this.getSalary());
		System.out.println("Retirement Cost: " + retirement);
		System.out.println("Health Care Cost: " + healthCare);
		System.out.println("Cost to Company: " + getCostToCompany() + "\n");
	}
}

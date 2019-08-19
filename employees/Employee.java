package week1.day5.assignment5.employees;

import java.util.ArrayList;

public abstract class Employee {
	private String name;
	private ArrayList<String> infra; // company property
	private int salary;
	
//	public Employee(String name, ArrayList<String> infra, int salary) {
//		this.name = name;
//		this.infra = infra;
//		this.salary = salary;
//	}
	
	public abstract int getCostToCompany();
	public abstract void display();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getInfra() {
		return infra;
	}

	public void setInfra(ArrayList<String> infra) {
		this.infra = infra;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

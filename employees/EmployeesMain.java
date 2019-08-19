package week1.day5.assignment5.employees;

public class EmployeesMain {

	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
		
		employees[0] = new ContractEmployee("Bill", 70000);
		employees[1] = new ContractEmployee("Tom", 78000);
		employees[2] = new PermanentEmployee("Bob", 72000);
		employees[3] = new PermanentEmployee("Jane", 80000);
		employees[4] = new PermanentEmployee("Steve", 86000);
		
		for (Employee e : employees) 
			e.display();
		
		employees[1].setSalary(86000);
		employees[3].setSalary(88000);
		
		for (Employee e : employees) 
			e.display();
		
		System.out.println("Infra: " + employees[0].getInfra());
		System.out.println("Infra: " + employees[4].getInfra());
	}
}

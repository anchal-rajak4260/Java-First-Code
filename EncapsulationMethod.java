package sectionBfees;

class Employee{
	
	int empId = 2;
	int basicSal =1000;
	int leaves = 10;
	int incentive = 200;
	
	
	void countSalary() {
		System.out.println(basicSal + incentive);
	}
	
}

public class EncapsulationMethod {
	public static void main(String arg[]) {
		 Employee second = new Employee();
		 System.out.println(second.empId);
		 System.out.println(second.incentive);
		 
	}
  
 
 
}

package sectionBfees;

public class LearnAbstract {
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.accelerate();
		c1.brakes();
		c1.honks();
		
	}	
		
	}
	
	abstract class Vehical{// abstract class
		
		abstract void accelerate();// abstract method and A Method not have there own body 
		
		abstract void brakes();
		
		void honks(){//non- abstract method 
			System.out.println("Vechicle Honks");
			
		}
	
	
    }
	
	class Car extends Vehical{// subclass of a abstract class
		
		
		void accelerate() {
			System.out.println("Car is Accelerate");
		}
		
		void brakes() {
			System.out.println("car brakes are pushed");
			
			
		}
		
	}

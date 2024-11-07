package sectionBfees;

public class LearnInterface {
	
	public static void main(String args[]) {
		Cat obj = new Cat();
		obj.eats();
		obj.walk();
	}

}

interface human{// multiple inheritance are use 
	
	void walk();
	
}

interface Pet{// multiple inheritance are use
	
	void eats();
	
}
class Cat implements Pet, human{
	
	public void eats() {
		System.out.println("Cat is eating something");
		
	}
	
	public void walk() {
		System.out.println("humans waking ");
	}
}
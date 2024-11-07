package sectionBfees;
//abstract class
public class Animal {
    public static void main(String[] args) {
    	
        Dog myDog = new Dog();
        
        myDog.makeSound();
        
        myDog.sleep();
    }
}


abstract class AnimalSee {
   
    public abstract void makeSound();
  
    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends AnimalSee {
    public void makeSound() {
        System.out.println("Wooffff....!");
    }
}



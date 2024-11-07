package sectionBfees;

class Eats {
    void eat() {
        System.out.println("This animal eats.");
    }
}

//single inheritance 
//single inheritance is when a class(child) inherits from one parent class
class Herbivores extends Eats {
    void deer() {
        System.out.println("This Deer is Herbivores.");
    }
}

//multi-level inheritance
//Multilevel inheritance is when a class inherits from a class, 
//which itself is a subclass of another class.
class Carnivores extends Eats {
    void tiger() {
        System.out.println("This Tiger is carnivorus.");
    }

	
}

public class InheritanceFourTypes {

    public static void main(String[] args) {
    	Herbivores herb = new Herbivores();
        herb.eat();
        herb.deer();
        
       Carnivores carn = new Carnivores();
        carn.eat();
        //carn.deer(); 
        carn.tiger();
        
        
       
       
    }
}


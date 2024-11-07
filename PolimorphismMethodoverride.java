package sectionBfees;

class BigCat {
     void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Lion extends BigCat {
    
     void makeSound() {
        System.out.println("Roar!");
    }
}

class Fox extends BigCat {
   
    void makeSound() {
        System.out.println("Aaaaooooo!");
    }
}

public class PolimorphismMethodoverride {
    public static void main(String[] args) {
    	BigCat mylion = new Lion();
    	BigCat myFox = new Fox();

        //polymorphism method calls
        mylion.makeSound();
        myFox.makeSound();
    }
}


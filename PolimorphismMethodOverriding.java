package sectionBfees;


class MathOperations {
    // Overloaded methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
public class PolimorphismMethodOverriding {

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Sum of integers: " + math.add(5, 10));
        System.out.println("Sum of doubles: " + math.add(5.5, 10.5));
    }
}


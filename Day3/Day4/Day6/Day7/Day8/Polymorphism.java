class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    // Method overloading: same method name with different parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10)); // Calls the first add method
        System.out.println(calc.add(5, 10, 15)); // Calls the overloaded add method
    }
}

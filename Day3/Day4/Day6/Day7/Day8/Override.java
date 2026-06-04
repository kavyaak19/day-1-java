
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");

    }
}
class Dog extends Animal {    
       
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
public class Override {
    public static void main(String[] args) {
        Dog D = new Dog();
        D.makeSound(); // Inherited method from Animal class
    }

    
}

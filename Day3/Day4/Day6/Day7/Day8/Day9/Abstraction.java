abstract class vehicle{
    abstract void start();
    public void stop() {
        System.out.println("stopped");
    }
}
class Car extends vehicle{
    public void start() {
        System.out.println("car started");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        vehicle v = new Car();
        v.start(); // Calls the implemented start method in Car class
        v.stop(); // Calls the inherited stop method from vehicle class
    }
    
}

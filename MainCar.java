abstract class Vehicle {  // Abstract class Vehicle
    protected String make;
    protected String model;

    // Constructor to initialize make and model
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Abstract methods
    abstract void startEngine();
    abstract void stopEngine();

    // Non-abstract method
    public void serviceInfo() {
        System.out.println("Service your vehicle regularly to ensure optimal performance.");
    }
}

// Concrete class Car extending Vehicle
class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    @Override
    void startEngine() {
        System.out.println("The engine of " + make + " " + model + " is starting... Vroom!");
    }

    @Override
    void stopEngine() {
        System.out.println("The engine of " + make + " " + model + " is stopping... Shutdown!");
    }
}

// Main class to test the implementation
public class MainCar {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla");
        
        // Calling methods
        myCar.startEngine();
        myCar.stopEngine();
        myCar.serviceInfo();
    }
}

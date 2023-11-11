// Base class
class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println("Starting the vehicle.");
    }

    public void stop() {
        System.out.println("Stopping the vehicle.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass 1
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    // Method overriding
    @Override
    public void start() {
        System.out.println("Starting the car.");
        // Additional car-specific logic if needed
        super.start(); // Using super to call the overridden method in the parent class
    }

    public void drive() {
        System.out.println("Driving the car.");
    }

    // Additional method in the subclass
    public void honk() {
        System.out.println("Honking the car horn.");
    }
}

// Subclass 2
class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String brand, boolean hasSideCar) {
        super(brand);
        this.hasSideCar = hasSideCar;
    }

    // Method overriding
    @Override
    public void start() {
        System.out.println("Starting the motorcycle.");
        // Additional motorcycle-specific logic if needed
        super.start(); // Using super to call the overridden method in the parent class
    }

    public void ride() {
        System.out.println("Riding the motorcycle.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);
        myCar.displayInfo();
        myCar.start();
        myCar.drive();
        myCar.stop();
        myCar.honk();

        System.out.println(); // Adding a newline for better output separation

        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", false);
        myMotorcycle.displayInfo();
        myMotorcycle.start();
        myMotorcycle.ride();
        myMotorcycle.stop();
    }
}

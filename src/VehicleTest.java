

public class VehicleTest {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    class Vehicle {
        String brand;

        Vehicle(String brand) {
            this.brand = brand;
        }

        void startEngine() {
            System.out.println("Generic engine start");
        }
    }
    class Car extends Vehicle {
        int numDoors;

        Car(String brand, int numDoors) {
            super(brand);
            this.numDoors = numDoors;
        }

        @Override
        void startEngine() {
            System.out.println("Car engine start");
        }
        void drive() {
            System.out.println(brand + " car is driving with " + numDoors + " doors.");
        }
    }

    class Motorcycle extends Vehicle {
        boolean hasSidecar;
        Motorcycle(String brand, boolean hasSidecar) {

            super(brand);
            this.hasSidecar = hasSidecar;
        }

        @Override
        void startEngine() {
            System.out.println("Motorcycle engine started");
        }

        void ride() {
            if (hasSidecar) {
                System.out.println(brand + " motorcycle is riding with a sidecar.");
            } else {
                System.out.println(brand + " motorcycle is riding solo.");
            }
        }
    }





}
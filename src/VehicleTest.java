

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
        Car(String brand) {
            super(brand);
        }

        @Override
        void startEngine() {
            System.out.println("Car engine start");
        }
    }





}
package exp5;

// Base class
class Vehicle {
    protected String brand;
    protected String model;
    protected double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}

// Car class extending Vehicle
class Car extends Vehicle {
    protected int seatingCapacity;
    protected String fuelType;

    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
    }
}

// ElectricCar subclass extending Car
class ElectricCar extends Car {
    private int batteryCapacity;
    private double chargingTime;

    public ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh, Charging Time: " + chargingTime + " hours");
    }
}

// Motorcycle class extending Vehicle
class Motorcycle extends Vehicle {
    private int engineCapacity;
    private String type;

    public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc, Type: " + type);
    }
}

// Main class to test the hierarchy
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 30000, 5, "Petrol");
        Vehicle electricCar = new ElectricCar("Tesla", "Model 3", 50000, 5, "Electric", 75, 6.5);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 15000, 1200, "Cruiser");
        
        car.displayDetails();
        System.out.println();
        electricCar.displayDetails();
        System.out.println();
        motorcycle.displayDetails();
    }
}


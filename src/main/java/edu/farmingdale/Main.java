package edu.farmingdale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(4, "Red", 2.0f, "Petrol"); // Creating a Vehicle object

        // Testing Vehicle methods
        System.out.println("Vehicle Information:");
        System.out.println("Number of Wheels: " + vehicle.getNumberOfWheels());
        System.out.println("Color: " + vehicle.getColor());
        System.out.println("Engine Size: " + vehicle.getEngineSize());
        System.out.println("Fuel Type: " + vehicle.getFuelType());
        System.out.println();

        Car car = new Car(4, "Blue", 3.5f, "Diesel", "Toyota"); // Creating a Car object

        // Testing Car methods
        System.out.println("Car Information:");
        car.displayInfo(); // This will display all attributes, including those inherited
        car.honk(); // This will print "Honk, honk!"
    }
}
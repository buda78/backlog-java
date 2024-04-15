import java.util.Scanner;
class Vehicle {
String company;
double price;
public Vehicle(String company, double price) {
this.company = company;
this.price = price;
}
public void displayInfo() {
System.out.println("Company: " + company);
System.out.println("Price: $" + price);
}
}
class LightMotorVehicle extends Vehicle {
double mileage;public LightMotorVehicle(String company, double price, double
mileage) {
super(company, price);
this.mileage = mileage;
}
@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Mileage: " + mileage + " km/l");
}
}
class HeavyMotorVehicle extends Vehicle {
double capacityInTons;
public HeavyMotorVehicle(String company, double price, double
capacityInTons) {
super(company, price);
this.capacityInTons = capacityInTons;
}
@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Capacity in Tons: " + capacityInTons + "
tons");
}
}
public class VehicleDemo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of vehicles: ");
int n = scanner.nextInt();
Vehicle[] vehicles = new Vehicle[n];
for (int i = 0; i < n; i++) {
System.out.print("Enter vehicle type (1 for Light Motor
Vehicle, 2 for Heavy Motor Vehicle): ");
int vehicleType = scanner.nextInt();
scanner.nextLine(); // consume the newline characterSystem.out.print("Enter Company: ");
String company = scanner.nextLine();
System.out.print("Enter Price: $");
double price = scanner.nextDouble();
if (vehicleType == 1) {
System.out.print("Enter Mileage: ");
double mileage = scanner.nextDouble();
vehicles[i] = new LightMotorVehicle(company, price,
mileage);
} else if (vehicleType == 2) {
System.out.print("Enter Capacity in Tons: ");
double capacityInTons = scanner.nextDouble();
vehicles[i] = new HeavyMotorVehicle(company, price,
capacityInTons);
} else {
System.out.println("Invalid vehicle type. Enter 1 or
2.");
i--; // Decrement i to re-enter the current vehicle
details
}
}
// Display vehicle information
System.out.println("\nVehicle Information:");
for (Vehicle vehicle : vehicles) {
vehicle.displayInfo();
System.out.println("---------------------");
}
scanner.close();
}
}

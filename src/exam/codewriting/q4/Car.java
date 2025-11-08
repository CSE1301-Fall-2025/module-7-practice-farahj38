package exam.codewriting.q4;

/*
 * We wish to create a Car class. A Car has-a(n):
 * 
 * Odometer, which tracks how many miles the car has been driven.
 * Fuel efficiency, typically given as miles-per-gallon.
 * Fuel tank, which can hold some amount of fuel, in gallons.
 * Current amount of fuel.
 */

public class Car {

	// Declare your instance variables here:
	private double miles;
	private double fuelEfficiency;
	private double fuelTank;
	private double currentFuel;
	// Write the constructor for the Car class:
	// (For full credit the constructor should use only two parameters)
	public Car(double miles, double fuelEfficiency, double fuelTank, double currentFuel) {
		this.miles = miles;
		this.fuelEfficiency = fuelEfficiency;
		this.fuelTank = fuelTank;
		this.currentFuel = currentFuel;
	}
	/**
	* Drives the car at the given speed for the given amount of time or until out of fuel.
	* (Hint: Carefully consider the impact of driving to all instance variables).
	*/
	public void drive ( double milesPerHour , double hours ) {
		double distance = milesPerHour*hours;
		double gasUsed = distance*this.fuelEfficiency;
		if (this.currentFuel >= gasUsed) {
			this.currentFuel = this.currentFuel - gasUsed;
		} else {
			this.currentFuel = 0;
		}
		this.miles = this.miles + distance;
	}
	
	public double getMilesDriven () {
		return miles;
	}
	public double getCurrentFuel() {
		return currentFuel;
	}
	
	/**
	* Adds fuel to the tank as long as it does not exceed the tank�s capacity.
	* @return portion of fuel that couldn�t be added
	*/
	public double addFuel(double gallons) {
		if (this.currentFuel + gallons <= fuelTank) {
			this.currentFuel = this.currentFuel + gallons;
			return this.currentFuel;
		} else {
			this.currentFuel = this.fuelTank;
			return this.currentFuel;
		}
	}
	public static void main(String[] args) {
		Car toyotaPrius = new Car(1000, 30, 10, 2);
		toyotaPrius.drive(60, 2);
		System.out.println(toyotaPrius.getCurrentFuel());
		System.out.println(toyotaPrius.addFuel(10));
	}
	
	
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

public class Ticket {
	private Passenger passenger;
	private Flight flight;
	private double price;
	private int number;
	private static int numberCounter = 1;
	
	public Ticket(Passenger p, Flight flight, double price) {
		this.setPassenger(p);
		this.setFlight(flight);
		this.setPrice(price);
		this.number = numberCounter;
		numberCounter++;
	}
	
	public Passenger getPassenger() {
		return this.passenger;
	}
	
	public void setPassenger(Passenger p) {
		this.passenger = p;
	}
	
	public Flight getFlight() {
		return this.flight;
	}
	
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		System.out.print(this.getPassenger().getName() + ", " + this.getFlight().getOrigin());
		System.out.print(" to " + this.getFlight().getDestination() + ", ");
		System.out.print(this.getFlight().getDepartureTime() + ", " + "original price: $");
		System.out.println(this.getFlight().getOriginalPrice() + ", ticket price: $" + this.getPrice());		
		return "";
	}
}

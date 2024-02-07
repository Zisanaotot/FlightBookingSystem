/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

public class Flight {
	
	private int flightNumber;
	private String origin;
	private String destination;
	private String departureTime;
	private int capacity;
	private int numberOfSeatsLeft;
	private double originalPrice;
	
	public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice) {
		this.setFlightNumber(flightNumber);
		this.setOrigin(origin);
		this.setDestination(destination);
		this.setDepartureTime(departureTime);
		this.setCapacity(capacity);
		this.setOriginalPrice(originalPrice);
		this.setNumberOfSeatsLeft(capacity);
		
		if(origin.equals(destination)) {
			throw new IllegalArgumentException();
		}
	}
	
	public String getOrigin(){
		return this.origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public int getFlightNumber() {
		return this.flightNumber;
	}
	
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public String getDestination() {
		return this.destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getDepartureTime() {
		return this.departureTime;
	}
	
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int getNumberOfSeatsLeft() {
		return this.numberOfSeatsLeft;
	}
	
	public void setNumberOfSeatsLeft(int num) {
		this.numberOfSeatsLeft = num;
	}
	
	public double getOriginalPrice() {
		return this.originalPrice;
	}
	
	public void setOriginalPrice(double price) {
		this.originalPrice = price;
	}
	
	public boolean bookASeat() {
		if (this.getNumberOfSeatsLeft() > 0) {
			this.setNumberOfSeatsLeft((this.getNumberOfSeatsLeft() - 1));
			return true;
		}
		else return false;
	}
	
	@Override
	public String toString() {
		System.out.print("Flight " + this.getFlightNumber() + ", " + this.getOrigin() + " to ");
		System.out.println(this.getDestination() + ", " + this.getDepartureTime() + ", original price: $" + this.getOriginalPrice());
		return "";
	}
	
}
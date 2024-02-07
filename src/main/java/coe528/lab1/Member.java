/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

public class Member extends Passenger {
	
	public Member(String name, int age, int years) {
		super(name, age);
		this.yearsOfMembership = years;
	}
	
	private int yearsOfMembership;
	
	public double applyDiscount(double price) {
		if (this.getYearsOfMembership() > 5) {
			return (price * 0.5);
		}
		else if (this.getYearsOfMembership() <= 5 && this.getYearsOfMembership() > 1) {
			return (0.9 * price);
		}
		else return price;
	}
	
	public int getYearsOfMembership() {
		return this.yearsOfMembership;
	}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

public class NonMember extends Passenger {
	
	public NonMember(String name, int age) {
		super(name, age);
	}
	
	public double applyDiscount(double p) {
		if (this.getAge() > 65) {
			return (0.9 * p);
		}
		else return p;
	}
}
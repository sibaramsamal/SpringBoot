package com.nt.beans;

public class Address {
	private String streetName;
	private String pin;
	private String state;
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Street Name: "+streetName+", Pin: "+pin+", State: "+state;
		
	}
}

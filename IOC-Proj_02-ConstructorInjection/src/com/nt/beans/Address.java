package com.nt.beans;

public class Address {
	private String streetName;
	private String pin;
	private String state;
	public Address(String streetName, String pin, String state) {
		this.streetName = streetName;
		this.pin = pin;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address:\nstreetName=" + streetName + ", pin=" + pin + ", state=" + state;
	}
	
}

package com.nt.bo;

import org.springframework.stereotype.Component;

@Component
public class CustomerBO {
	private String name,address;
	private float amount,time,rate,interest;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
}

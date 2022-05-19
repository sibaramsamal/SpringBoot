package com.nt.beans;

public class Student {
	private int sid;
	private String sName;
	private Address addr;
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sName) {
		this.sName = sName;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public void showData() {
		System.out.println("Id: "+sid+" "+", Name: "+sName+"\nAddress: "+addr);
	}
}

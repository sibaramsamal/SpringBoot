package com.nt.beans;

public class Student {
	private int sid;
	private String sname;
	private Address addr;
	public Student(int sid,String sname,Address addr) {
		this.sid = sid;
		this.sname = sname;
		this.addr = addr;
	}
	public void showData() {
		System.out.println("Id: "+sid+" "+", Name: "+sname+"\n"+addr);
	}
}

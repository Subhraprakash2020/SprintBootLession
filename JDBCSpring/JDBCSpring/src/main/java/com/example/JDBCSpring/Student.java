package com.example.JDBCSpring;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private String sec;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", sec=" + sec + "]";
	}
	
	
	
}

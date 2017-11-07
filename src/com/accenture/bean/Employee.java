package com.accenture.bean;

public class Employee {

	private String name;
	private int empid;
	private CreditCard cc;
	
	public void getCCInfo(){
		System.out.println(cc);
	}
	
	public void getEmpInfo(){
		System.out.println(empid+"\t"+name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setCc(CreditCard cc) {
		this.cc = cc;
	}

	
}

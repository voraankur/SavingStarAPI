package com.savingstar.application.model;

public class Account {
	
	private double available_savings;
	private double lifetime_savings;
	
	public Account() {
		
	}
	
	public Account(double available_savings, double lifetime_savings) {
		super();
		this.available_savings = available_savings;
		this.lifetime_savings = lifetime_savings;
	}
	
	public double getAvailable_savings() {
		return available_savings;
	}
	public void setAvailable_savings(double available_savings) {
		this.available_savings = available_savings;
	}
	public double getLifetime_savings() {
		return lifetime_savings;
	}
	public void setLifetime_savings(double lifetime_savings) {
		this.lifetime_savings = lifetime_savings;
	}

}

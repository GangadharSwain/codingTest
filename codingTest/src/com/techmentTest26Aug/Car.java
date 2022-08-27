package com.techmentTest26Aug;

public class Car {
	
	private int yearModel;
	private String make;
	private int speed;
	
	public Car(int year,String mk) {
		yearModel = year;
		make = mk;
		speed = 0;
	}

		
	int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accellerate() {
		speed = speed+5;
	}

	public void brake() {
		speed = speed-5;
	}


}

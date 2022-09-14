package com.oops.constructor.pojo.sub.programs;

public class Car {
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String Colour;

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model != null) {
			if (model.equalsIgnoreCase("carrera") || model.equalsIgnoreCase("commodro")) {
				this.model = model;
			} else {
				this.model = "Unknown";
			}
		}

	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		Colour = colour;
	}

}

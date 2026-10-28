package com.rays.oop.methodoverriding;

public class Shape {
	
	private String color;
	private int borderWidth;
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getBorderWidth() {
		return borderWidth;
	}
	
	public void setBorderWidth(int borderWidth) {
		this.borderWidth=borderWidth;
	}
	
	public double area() {
		return 0;
	}
}

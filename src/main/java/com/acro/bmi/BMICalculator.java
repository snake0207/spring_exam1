package com.acro.bmi;

import java.util.ArrayList;

public class BMICalculator {
	private double lowWeight;
	private double normal;
	private double overWeight;
	
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	
	public void bmiCalculation(double weight, double height) {
		double h = height * 0.01;
		double r = weight / (h * h);
		
		if (r < lowWeight)
			System.out.println("저체중");
		else if (r >= lowWeight & r < normal)
			System.out.println("정상");
		else if (r > overWeight) {
			System.out.println("과체중");
		}
	}
	
}

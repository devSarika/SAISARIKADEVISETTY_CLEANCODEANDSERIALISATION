package com.epam.week4;

public class ConstructionCost {
	public double costcalculator(int option,double area)
	{
		switch (option) {
		case 1:return 1200*area;
		case 2:return 1500*area;
		case 3:return 1800*area;
		case 4:return 2500*area;
		default:
			return 0;
		}
	}
}

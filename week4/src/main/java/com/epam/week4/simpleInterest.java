package com.epam.week4;

import java.util.Scanner;

public class simpleInterest {
	double principleAmount;
	double time;
	double ROI;
	double simpleIntrest=0;
	Scanner sc=new Scanner(System.in);
	void takingInput()
	{
		System.out.println("Enter number of months:(Time period)");
		time=sc.nextInt();
		System.out.println("Enter principle amount:");
		principleAmount=sc.nextInt();
		System.out.println("Enter Rate of Intrest:");
		ROI=sc.nextInt();		
	}
	public void Simple_Intrest()
	{
		time=time/12;
		simpleIntrest=(principleAmount*time*ROI)/100;
		System.out.println("Simple Intrest:"+simpleIntrest);
	}
}

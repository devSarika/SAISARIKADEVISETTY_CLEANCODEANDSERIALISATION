package com.epam.week4;

import java.util.Scanner;

public class compundInterest {
	double principleAmount;
	double timeperiod;
	double rateOfIntrest;
	double compoundIntrest=0;
	int selectCompoundtype;
	Scanner sc=new Scanner(System.in);
	void takingInput()
	{
		System.out.println("Enter number of months:(Time period)");
		timeperiod=sc.nextInt();
		System.out.println("Enter principle amount:");
		principleAmount=sc.nextInt();
		System.out.println("Enter Rate of Intrest:");
		rateOfIntrest=sc.nextInt();	
		System.out.println("Select an option:1) Annually\n 2)halfyearly \n 3)Quarterly ");
		selectCompoundtype=sc.nextInt();
	}
	public void Compound_Intrest()
	{	
			switch(selectCompoundtype)
			{
			case 1: timeperiod=timeperiod/((timeperiod/12));break;
			case 2: timeperiod=timeperiod/((timeperiod/6));break;
			case 3: timeperiod=timeperiod/((timeperiod/3));break;
			}
			compoundIntrest=(principleAmount*Math.pow(1+((rateOfIntrest)/100),timeperiod))-(principleAmount);
			System.out.println("Compound Intrest:"+compoundIntrest);
	}
}

package com.epam.week4;
import java.util.*;

public class mainCode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Simple intrest & Compound interest Calculator");
		boolean tobecontinued=true;
		do
		{
		System.out.println("1. Compound Intrest\n 2.Simple Intrest ");
		Scanner sc=new Scanner(System.in);
		int Intresttype;
		Intresttype=sc.nextInt();
			switch(Intresttype)
			{
			case 1: compundInterest ci=new compundInterest();
					ci.takingInput();
					ci.Compound_Intrest();
					break;
			case 2: simpleInterest si=new simpleInterest();
					si.takingInput();
					si.Simple_Intrest();
					break;
			default:System.out.println("Enter correct option");
			}
			System.out.println("Do you want to continue?:(true for continue / false for discontinue)");
			tobecontinued=sc.nextBoolean();
			sc.close();
		}while(tobecontinued);
	}
}

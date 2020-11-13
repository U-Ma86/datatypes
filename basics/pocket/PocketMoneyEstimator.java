package com.xworkz.basics.pocket;

public class PocketMoneyEstimator {
private static double totalAmount;
public static void request(double amount,String day) {
	System.out.println("request invoked");
	System.out.println("arg1,amount "+amount);
	System.out.println("arg2,day "+day);
	totalAmount=totalAmount+amount;
	System.out.println("toal amount after request"+totalAmount);
	System.out.println("exit::request");
	
	
}
public static void expenditure(double amount) {
	System.out.println("arg1,amount :"+amount);
	totalAmount=totalAmount-amount;
	System.out.println("total amount after expenditure"+totalAmount);
	System.out.println("exit::expenditure");

	}
}

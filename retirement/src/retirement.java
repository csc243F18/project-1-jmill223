/*
 Name: Jack Millman
 Project: retirement
 Professor: Dr. Demarco
 Course: CSC 243 Fall 2018
 Assignment: 1
 */

import java.util.Scanner;
import static java.lang.Math.round;
import static java.lang.Math.pow;

public class retirement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Asks for the inputs 
		System.out.print("How many years left until retirement: ");
		double years = input.nextDouble();
		System.out.print("How much are you saving annually: ");
		double principle = input.nextDouble();
		
		//If the years is less than or equal to zero ask the user for another value
		if(years <= 0)
		{
		while(years <=0)
		{
		System.out.print("Please enter a number greater than 0 for remaining years: ");
		years = input.nextDouble();
		}
		}
		
		//If the principle is less than or equal to zero ask the user for another value
		if(principle <= 0)
		{
		while(principle <=0)
		{
		System.out.print("Please enter a number greater than 0 for savings: ");
		principle = input.nextDouble();
		}
		}
		
		//Calculates how much you will have at retirement 
		double rate = 0.05;
		
		double interest = principle * ((pow((1 + rate), years) - 1) / rate);
		double rInterest = round(interest * 100.0) / 100.0;
		
		//Prints how much you will have at retirement 
		System.out.println("$" + rInterest + " is what you will have at retirement.");
	}

}

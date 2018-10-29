import java.util.Scanner;
import java.util.InputMismatchException;
import static java.lang.Math.round;
import static java.lang.Math.pow;

public class RetirementTryCatch {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);

double years = 0.00;
double principle = 0.00;

//Asks for the inputs 
System.out.print("How many years left until retirement: ");
try
{
	
	years = input.nextDouble();
}
catch(InputMismatchException e)
{
	System.out.print("You did not enter a number");
}

System.out.print("How much are you saving annually: ");
try
{
	
	principle = input.nextDouble();
}
catch(InputMismatchException e)
{
	System.out.print("You did not enter a number");
}

		calculateResult(years, principle);
		
	}
	
public static void calculateResult(double years, double principle)
{
	Scanner input = new Scanner(System.in);
	
	try
	{
	//If the years is less than or equal to zero ask the user for another value
	if(years <= 0)
	{
	while(years <=0)
	{
	System.out.print("Please enter a number greater than 0 for remaining years: ");
	years = input.nextDouble();
	}
	}
	}
	catch(ArithmeticException e)
	{
		if(years > 120)
		{
		System.out.println("You can't have over 120 years till retirement.");
		}
	}
	try
	{
		//If the principle is less than or equal to zero ask the user for another value
		if(principle <= 0)
		{
		while(principle <=0)
		{
		System.out.print("Please enter a number greater than 0 for savings: ");
		principle = input.nextDouble();
		}
		}
	}
	catch(ArithmeticException e)
	{
		if(principle == 1)
		{
		System.out.println("You must have over 1 dollar in savings.");
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

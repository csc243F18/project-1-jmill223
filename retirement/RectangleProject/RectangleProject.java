import java.util.Scanner;
import static java.lang.Math.sqrt; 
import static java.lang.Math.round;

public class RectangleProject {
	
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the length: ");
	double length = input.nextDouble();
	System.out.print("Enter the width: ");
	double width = input.nextDouble();
	
	double perimeter = (length * 2) + (width * 2);
	double area = length * width;
	double diagonal = sqrt((length * length) + (width * width));
	
	double rPerimeter = round(perimeter * 100.0) / 100.0;
	double rArea = round(area * 100.0) / 100.0;
	double rDiagonal = round(diagonal * 100.0) / 100.0;
	
	double size = area / 100;
	double nSize = (long) size;
	
	if(nSize == 1)
	{
		System.out.println("The perimeter is " + rPerimeter);
		System.out.println("The area is " + rArea);
		System.out.println("The diagonal is " + rDiagonal);
		System.out.println("That is a small rectangle");
	}
	if(nSize == 2)
	{
		System.out.println("The perimeter is " + rPerimeter);
		System.out.println("The area is " + rArea);
		System.out.println("The diagonal is " + rDiagonal);
		System.out.println("That is a medium rectangle");
	}
	if(nSize == 3)
	{
		System.out.println("The perimeter is " + rPerimeter);
		System.out.println("The area is " + rArea);
		System.out.println("The diagonal is " + rDiagonal);
		System.out.println("That is a large rectangle");
	}
	if(nSize == 4)
	{
		System.out.println("The perimeter is " + rPerimeter);
		System.out.println("The area is " + rArea);
		System.out.println("The diagonal is " + rDiagonal);
		System.out.println("That is a Xlarge rectangle");
	}
	if(nSize > 5)
	{
		System.out.println("The perimeter is " + rPerimeter);
		System.out.println("The area is " + rArea);
		System.out.println("The diagonal is " + rDiagonal);
		System.out.println("That is a huge rectangle");
	} 
	
	
	
	
	
	
	
}
	
}

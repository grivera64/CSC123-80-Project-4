//package project4;

import java.util.Scanner;

public class DailySpecials
{
	
	//Days of the week
	public enum Days
	{
		
		Sun,
		Mon,
		Tues,
		Wed,
		Thurs,
		Fri,
		Sat;
		
	}
	
	//driver method
	public static void main(String[] args)
	{
		
		//creating keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		//request from the user the day of the week it is
		System.out.printf("Enter a day\n(Sun, Mon, Tues, Wed, Thurs, Fri, Sat) > ");
		Days choice = Days.valueOf(keyboard.nextLine());
		
		//display accordingly to the day of week they chose
		switch (choice)
		{
		
			case Sun:
			case Sat:
				System.out.printf("Sorry, we're close on %s", Days.Sat);
				System.exit(0);
			default:
				System.out.printf("The special for %s is ", choice);
		
		}
		
		String special;
		
		switch(choice)
		{
		
			case Mon:
				special = "barbecue chicken";
				break;
			case Tues:
				special = "tacos";
				break;
			case Wed:
				special = "pizza";
				break;
			case Thurs:
				special = "sandwich";
				break;
			case Fri:
				special = "spaghetti";
				break;
			default:
				special = null;
		
		}
		
		System.out.printf("%s.\n", special);
		
	}
	
}
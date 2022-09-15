package demo;

import java.util.Scanner;

public class ClassDemo 
{

	public static void main(String[] args) 
	{
		//Examples for how to use
		
		Scanner userinput = new Scanner(System.in);
		
		int age;				//To get an integer from the user |	int age (works) | int Age 2 (doesn't work) --> int Age2 (works)
		double salary;			//To get a decimal from the user (doesn't have to be a decimal as it will automatically convert | 100 -> 100.0
		String name;			//To get a word or phrase from the user
		char firstinitial;		//To get a character from the user
			
		System.out.println("Please enter your full name: ");
		
		name = userinput.nextLine();	//".next" does not work if the input has a space between two words/phrases Ex. Badr Eddin Deeab would not display
		
		System.out.println("The name you've entered is: " + name);
		
		Scanner userage = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		
		age = userage.nextInt();	//Ensure you use the proper "next___" according to your data type
		
		System.out.println("The age you've entered is: " + age);
		
	}

}

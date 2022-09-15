package demo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ClassDemo2 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00");
		
		int x = 5;
		double y = 6.7943349459;
		char m = 'A';
		String name = "Badr";
		
		final double PI = 3.14;
		
		/*
		System.out.println("Enter an integer: ");	//Prompting for an integer
		int intentered = userinput.nextInt();	//Recording an integer
		
		System.out.println("Is the integer you've entered: " + intentered);
		System.out.println("Please answer with Y/N");
		char answer = userinput.next().charAt(0);	//"charAt(0) will extract the first letter from a String / the index of the first letter in a String is valued at "0"
		//ABCDE A=0 B=1 C=2 D=3 E=4
		if(answer == 'Y')
		{
			System.out.println("Great! We will move on.");
		}
		else
		{
			System.out.println("Please restart the application and try again");
		}
		*/
		
		System.out.println(dc.format(y));	//Prints the data type "double" which we have assigned to "y" and rounds it to "0.00" since we have asked it to do that
		
	}

}

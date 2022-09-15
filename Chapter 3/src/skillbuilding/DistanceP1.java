package skillbuilding;

import java.text.DecimalFormat;

public class DistanceP1 
{

	public static void main(String[] args) 
	{
		
		DecimalFormat dc = new DecimalFormat("0.0");
		
		double first, second, third, totaldistance;
		first = 12.2;
		second = 10.6;
		third = 5.8;
		totaldistance = first + second + third;
		
		System.out.println("The total distance of the race in is: " + dc.format(totaldistance) + "km");
	}

}

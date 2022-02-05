package labook;

import java.util.Scanner;

public class P17 {//Area of a Rectangle
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the length of Rectangle:");
			double length = scn.nextDouble();
		System.out.println("Enter the width of a rectangle:");
			double width=scn.nextDouble();
			
		double area=length*width;
			System.out.println("Area of rectangle is:"+area);
		
	}
}

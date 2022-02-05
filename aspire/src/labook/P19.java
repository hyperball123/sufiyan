package labook;

import java.util.Scanner;

public class P19 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the width of a Triangle:");
		double base=scn.nextDouble();
		
		System.out.println("Enter the height of a Triangle:");
		double height=scn.nextDouble();
		
		double area=(base*height)/2;
		System.out.println("Area of a Traingle is: "+area);
	}
}

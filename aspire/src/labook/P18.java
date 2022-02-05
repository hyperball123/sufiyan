package labook;

import java.util.Scanner;

public class P18 {//Area of a Square
	public static void main(String[] args) {
		System.out.println("enter side of square:");
		
		Scanner scn=new Scanner(System.in);
		double side = scn.nextDouble();
		
		double area = side*side;
		System.out.println("Area of a square is: "+area);
	}
}

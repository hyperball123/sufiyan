package labook;

import java.util.Scanner;

public class P20 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	
	System.out.println("Enter the radius: ");
	double radius=scn.nextDouble();
	
	double area=Math.PI * (radius *  radius);
	System.out.println("The area of circle is: " + area);
	
	double circumfrence=Math.PI * 2 * radius;
	System.out.println("The circumference of the circle is:"+circumfrence);
	}
}

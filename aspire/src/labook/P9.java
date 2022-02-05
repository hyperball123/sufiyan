package labook;

import java.util.Scanner;

public class P9 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Plz enter value for n1....");
		double num1=scn.nextInt();
		
		System.out.println("Plz enter value for n2....");
		double num2=scn.nextInt();
		
		System.out.println("Plz enter value for n3....");
		double num3=scn.nextInt();
		
		if(num1 >= num2 && num1>=num3) {
			System.out.println(num1+" num1 is the largest number");
		}else if(num2 >= num1 && num2 >= num3){
			System.out.println(num2+" num2 is the largest number");
		}else
			System.out.println(num3+" num3 is the largest number");
	}
}

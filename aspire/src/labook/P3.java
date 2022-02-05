package labook;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the numbers for multiplication:\nEnter value for i:");
		
		int i = scn.nextInt();
		
		System.out.println("enter the value for j:");
		
		int j=scn.nextInt();
		int mul=i*j;
		
		System.out.println("Product of i * j : "+mul);
	}
}

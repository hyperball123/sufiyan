package labook;

import java.util.Scanner;

public class P13 {
	public static void main(String[] args) {
		int number, sum=0;
		Scanner scn=new Scanner(System.in);
		
		System.out.println("please Enter any integer value below 10: ");
		number = scn.nextInt();
		
		while(number <= 10) {
			sum=sum + number;
			number++;
		}
		System.out.format("Sum of the Numbers from the while Loop is: %d ",sum);
	}
}

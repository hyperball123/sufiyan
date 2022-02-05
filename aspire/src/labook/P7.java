package labook;

import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
		int num ;
		System.out.println("Enter an Integer num:");
		
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Even no.");
		}else {
			System.out.println("Odd no.");
		}
		
	}
}

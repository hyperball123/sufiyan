package labook;

import java.util.Scanner;

public class P25 {//User Inputting Array Elements
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int []array=new int[10];
		int sum = 0;
		System.out.println("Enter the elements:");
		for(int i=0; i<10;i++) {
			array[i]=scn.nextInt();
		}
		for(int num : array) {
			sum = sum+num;
		}
		System.out.println("Sum of array elements is:"+sum);
		scn.close();
	}
}

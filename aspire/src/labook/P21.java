package labook;

import java.util.Scanner;

public class P21 {//Reversing a Number
	public static void main(String[] args) {
		int num=0;
		int reversenum=0;
			
			System.out.println("Input your number and press enter: ");
			Scanner scn=new Scanner(System.in);
		
			num=scn.nextInt();
		
			while(num !=0) {
				reversenum = reversenum * 10;
				reversenum = reversenum + num%10;
				num = num/10;
		}
			System.out.println("reverse of input number is: "+reversenum);
	}
}

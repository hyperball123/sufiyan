package labook;

import java.util.Scanner;

public class P8 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		char ch=scn.next().charAt(0);//for reading char we use scn.next with charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			System.out.println(ch + " is vowel");
		else
			System.out.println(ch + " is consonant");
	}
}

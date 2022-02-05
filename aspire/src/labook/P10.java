package labook;

public class P10 {
public static void main(String[] args) {
	float first=2.50f,second = 4.50f;
	
	System.out.println("--before swap--");
	System.out.println("first number = " + first);
	System.out.println("Second number = " + second);
	
	float temporary=first;
	
	first = second;
	
	second = temporary;
	
	System.out.println("--after swap--");
	System.out.println("first number = " + first);
	System.out.println("Second number = " + second);
}
}

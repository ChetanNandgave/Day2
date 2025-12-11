package calci;
import java.util.Scanner;

class Addition{
	public static void add(int a,int b) {
		System.out.println("Addition="+ (a+b));
		
	}
}

class Substraction{
	public static void sub(int a,int b) {
		System.out.println("Substraction="+(a-b));
	}
}

class Multiply{
	public static void mul(int a,int b) {
		System.out.println("Multiplication="+(a*b));
	}
}

class Division{
	public static void div(int a,int b) {
		System.out.println("Division="+(a/b));
	}
}

public class calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Choice:");
		int choice=sc.nextInt();
		
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		
		
		switch(choice) {
	    case 1:
	        Addition obj=new Addition();
	        obj.add(num1, num2);
	        break;

	    case 2:
	        Substraction obj1=new Substraction();
	        obj1.sub(num1, num2);
	        break;
	        
	    case 3:
	    	Multiply obj2=new Multiply();
	    	obj2.mul(num1, num2);
	    	
	    case 4:
	    	Division obj3=new Division();
	    	obj3.div(num1, num2);
	    default:
	    	System.out.println("Invalid choice");
	        
	}

	}
	

}

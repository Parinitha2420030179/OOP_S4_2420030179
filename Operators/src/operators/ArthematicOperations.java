package operators;

import java.util.Scanner;

public class ArthematicOperations {

	public static void main(String[] args) {
		//  Perform addition, subtraction, multiplication, division, and modulus of two numbers
		System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        System.out.println("Sum of " +a+ " and " +b+ " is " +c);
        System.out.println("Difference of " +a+ " and " +b+ " is " +d);
        System.out.println("Product of " +a+ " and " +b+ " is " +e);
        System.out.println("Quotient of " +a+ " and " +b+ " is " +f);
        System.out.println("Remainder of " +a+ " and " +b+ " is " +g);
        
        
        
    
        
	}

}

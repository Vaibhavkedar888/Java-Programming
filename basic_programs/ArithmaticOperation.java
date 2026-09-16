//Write a  program to enter two numbers and perform all arithmetic operations.
import java.util.*;
class ArithmaticOperation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first Number : ");
		int a=sc.nextInt();
		System.out.print("Enter the second NUmber: ");
		int b=sc.nextInt();
		System.out.println("Addition : "+(a+b));
		System.out.println("Subtraction : "+(a-b));
		System.out.println("Multiplication : "+(a*b));
		System.out.println("Division : "+(a/b));
		System.out.println("Modulus : "+(a%b));
        a++;
		System.out.println("increment of a : "+a);
		b--;
		System.out.println("decrement of b : "+b);

	}
}
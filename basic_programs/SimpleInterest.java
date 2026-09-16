//Write a  program to enter P, T, R and calculate Simple Interest.
import java.util.*;
class SimpleInterest{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("principle : ");
		double p=sc.nextDouble();

		System.out.print("Time : ");
		double t=sc.nextDouble();
		
		System.out.print("Rate : ");
		double r=sc.nextDouble();

		double SI=(p*t*r)/100;
		System.out.println("Simple Interest : "+SI);
		
		
	}
}
//Write a  program to enter the base and height of a triangle and find its area
import java.util.*;
class TriangleArea{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter base : ");
		double b=sc.nextDouble();
		System.out.print("Enter height : ");
		double h=sc.nextDouble();
		double area=0.5*b*h;
		System.out.println("Area of Triangle : "+area);
	}
}
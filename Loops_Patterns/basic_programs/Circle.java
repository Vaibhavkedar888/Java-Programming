//Write a  program to enter the radius of a circle and find its diameter, circumference and area.
//Write a  program to enter the length and breadth of a rectangle and find its area.
import java.util.*;
class Circle{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius : ");
		double r=sc.nextDouble();
		double area=3.14*r*r;
		System.out.println("Circle Area is : "+area);
		double diameter=2*r;
		System.out.println("Circle diameter is : "+diameter);
		double circum=2*3.14*r;
		System.out.println("Circle circumference is: "+circum);
		
	}
}
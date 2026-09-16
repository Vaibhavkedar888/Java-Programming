// Write a  program to calculate the area of an equilateral triangle.
import java.util.*;
class EquilateralArea{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the side : ");
		double side=sc.nextDouble();

		double area=0.433*side*side;
		System.out.println("Area of Equilateral Triangle : "+area);
	}
}
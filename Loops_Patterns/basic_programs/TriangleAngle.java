// Write a  program to enter two angles of a triangle and find the third angle.
import java.util.*;
class TriangleAngle{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Angle: ");
		double first=sc.nextDouble();
		System.out.print("Enter 2nd Angle: ");
		double second=sc.nextDouble();

		double third=180-(first+second);
		System.out.println("Third Angle is "+third+" degrees.");
	}
}
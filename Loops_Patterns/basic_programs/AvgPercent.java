//Write a  program to enter marks of five subjects and calculate total, average and percentage.
import java.util.*;
class AvgPercent{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Marks of Subjects \n \tPhysics: ");
		double phy=sc.nextDouble();

		System.out.print("\tChemistry: ");
		double che=sc.nextDouble();
		
		System.out.print("\tMathematics : ");
		double math=sc.nextDouble();
		
		System.out.print("\tEnglish : ");
		double eng=sc.nextDouble();
		
		System.out.print("\tBiology: ");
		double bio=sc.nextDouble();

		double total=phy+che+math+eng+bio;
		double avg=total/5;
		double percent=(total/500)*100;
		System.out.println("Total Marks       : "+total+" Avarage      : "+avg+" Percentage       : "+percent+" %");
	}
}
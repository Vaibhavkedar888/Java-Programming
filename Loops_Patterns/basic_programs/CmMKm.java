// Write a  program to enter length in centimetres and convert it into meter and kilometer.
import java.util.*;
class CmMKm{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter centimeter : ");
		double cm=sc.nextDouble();
		double meter=cm/100;
		System.out.println(cm+" cm"+"="+meter+" Meter.");
		double kilometer=cm/100000;
		System.out.println(cm+" cm"+"="+kilometer+" KiloMeter.");
	}
}
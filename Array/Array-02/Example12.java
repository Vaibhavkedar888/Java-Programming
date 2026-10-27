/*
Array Case 12: Shift Last to First (Without Third Variable)
 
Write a program to move the last element of the array to the first position (shift right by one) without using a third variable.
 
Example Input:
Array = [10, 20, 30, 40, 50]
 
Expected Output:
Before Shift: [10, 20, 30, 40, 50]
After Shift:  [50, 10, 20, 30, 40]
*/
import java.util.Scanner;
public class Example12{
	public static void displayArray(int A[]){
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void shiftLastFirst(int A[]){
		System.out.print("shift Array : ");
		for(int i=A.length-1;i>0;i--){
			A[i]=A[i]+A[i-1];
			A[i-1]=A[i]-A[i-1];
			A[i]=A[i]-A[i-1];
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size of Array : ");
		int size=sc.nextInt();
		int num[]=new int[size];
		
	    for(int i=0;i<num.length;i++){
	    	System.out.print("Enter the Array element: ");
	    	num[i]=sc.nextInt();
	    }
	    displayArray(num);
	    shiftLastFirst(num);
	    displayArray(num);
	}
}
/*
Array Case 13: Reverse Array (Without Third Variable)
Write a program to reverse all elements of an array without using a third variable.
Example Input:
Array = [5, 10, 15, 20, 25]
 
Expected Output:
Before Reverse: [5, 10, 15, 20, 25]
After Reverse:  [25, 20, 15, 10, 5]
*/
import java.util.Scanner;
public class Example13{
	public static void displayArray(int A[]){
		System.out.print("\nArray : ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void reverseArray(int A[]){
		for(int i=0;i<A.length/2;i++){
			A[i]=A[i]+A[A.length-1-i];
			A[A.length-1-i]=A[i]-A[A.length-1-i];
			A[i]=A[i]-A[A.length-1-i];
		}
		System.out.print("\nReverse Array : ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
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
	    reverseArray(num);
	}
}
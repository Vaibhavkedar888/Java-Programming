/*
 Array Case 10: Swap First and Last Element (Without Third Variable)
 Write a program to swap the first element and the last element of an array without using a third (temporary) variable.
 Example Input:
Array = [7, 14, 21, 28, 35]
 Expected Output:
Before Swap: [7, 14, 21, 28, 35]
After Swap:  [35, 14, 21, 28, 7]
*/
import java.util.Scanner;
public class Example10{
	public static void displayArray(int A[]){
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
	}
	public static void swapFirstLast(int A[]){
		A[0]=A[0]+A[A.length-1];
		A[A.length-1]=A[0]-A[A.length-1];
		A[0]=A[0]-A[A.length-1];
		System.out.println();
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
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
	    swapFirstLast(num);
	}
}
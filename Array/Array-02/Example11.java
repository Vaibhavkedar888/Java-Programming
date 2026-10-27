/*
Array Case 11: Shift First to Last (Without Third Variable)
 
Write a program to move the first element of the array to the last position (shift left by one) without using a third variable.
 
Example Input:
Array = [1, 2, 3, 4, 5]
 
Expected Output:
Before Shift: [1, 2, 3, 4, 5]
After Shift:  [2, 3, 4, 5, 1]
*/
import java.util.Scanner; 
public class Example11{
	public static void displayArray(int A[]){
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void shiftFirstLast(int A[]){
		System.out.print("shift Array : ");
		for(int i=0;i<A.length-1;i++){
			A[i]=A[i]+A[i+1];
			A[i+1]=A[i]-A[i+1];
			A[i]=A[i]-A[i+1];
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
	    shiftFirstLast(num);
	    displayArray(num);
	}
}
/*
Array Case 14: Maximum Element
 
Write a program to find the maximum element in an array.
 
Example Input:
Array = [12, 45, 67, 23, 89, 34]
 
Expected Output:
Maximum Element = 89
*/
import java.util.Scanner;
public class Example14{
	public static void displayArray(int A[]){
		System.out.print("\nArray : ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void maxElementArray(int A[]){
		int max=0;
		for(int i=0;i<A.length;i++){
		   if (A[i] > max) {
            max = A[i];
        }
		}

		System.out.print("\nmax element : "+max);
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
	    maxElementArray(num);
	}
}
/*
Array Case 17: Find Triplet with Given Sum
Write a program to find all triplets of three elements in an array whose sum is equal to a given number.
 
Example Input:
Array = [3, 6, 9, 12, 15]
Target Sum = 30
 
Expected Output:
Triplets with sum 30:
(3, 12, 15)
(6, 9, 15)
*/
import java.util.Scanner;
import java.util.Random;
public class Example18{
	public static void displayArray(int A[]){
		System.out.print("\nArray : ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void inputArray(int A[]){
		Random random=new Random();
		for(int i=0;i<A.length;i++){
			A[i]=random.nextInt(50);
		}
	}
	public static void input(int A[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array: ");
		for(int i=0;i<A.length;i++){
			A[i]=sc.nextInt();
		}
	}
	public static void sumOfTriplet(int A[],int sum){
		System.out.println("Triplet : ");
		for(int i=0;i<A.length-2;i++){
			for(int j=i+1;j<A.length-1;j++){
				for(int k=j+1;k<A.length;k++){
					if(A[i]+A[j]+A[k]==sum){
					  System.out.println(A[i]+" + "+A[j]+" + "+A[k]+" = "+sum);
				    }
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size of Array : ");
		int size=sc.nextInt();
		int num[]=new int[size];
		System.out.print("\nEnter the sum : ");
		int sum=sc.nextInt();
		/*
	    for(int i=0;i<num.length;i++){
	    	System.out.print("Enter the Array element: ");
	    	num[i]=sc.nextInt();
	    }*/
	    input(num);
	    displayArray(num);
	    sumOfTriplet(num,sum);
	    
	}
}
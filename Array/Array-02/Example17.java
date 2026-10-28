/*
Array Case 16: Find Pair with Given Sum
 
Write a program to find all pairs of two elements in an array whose sum is equal to a given number.
 
Example Input:
Array = [4, 8, 12, 16]
Target Sum = 20
 
Expected Output:
Pairs with sum 20:
(4, 16)
(8, 12)
*/
import java.util.Scanner;
import java.util.Random;
public class Example17{
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
	public static void sumOfPairs(int A[],int sum){
		System.out.print("\npairs : ");
		for(int i=0;i<A.length-1;i++){
			for(int j=i+1;j<A.length;j++){
				if(A[i]+A[j]==sum){
					System.out.println(A[i]+" + "+A[j]+" = "+sum);
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
	    //inputArray(num);
	    input(num);
	    displayArray(num);
	    sumOfPairs(num,sum);
	    
	}
}
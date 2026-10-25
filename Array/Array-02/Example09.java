/*
Array Case 9: Swap First and Last Element
Write a program to swap the first element and the last element of an array.
 Example Input:
Array = [10, 20, 30, 40, 50]
Expected Output:
Before Swap: [10, 20, 30, 40, 50]
After Swap:  [50, 20, 30, 40, 10]
*/
import java.util.Scanner;
class Example09{
	static void displayArray(int A[]){
		System.out.print("\tBefore Swap : ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ,");
		}
	}
	static void SwapFirstLast(int A[]){
		int temp=A[0];
		A[0]=A[A.length-1];
		A[A.length-1]=temp;
		System.out.print("\n\tAfter  Swap : ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size=sc.nextInt();
		int num[]=new int[size];
        for(int i=0;i<num.length;i++){
        	System.out.print("Enter Array element : ");
        	num[i]=sc.nextInt();
        }
        displayArray(num);
        SwapFirstLast(num);
	}
}
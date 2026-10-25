/*
Array Case 4: Sum of Odd Elements 
From a given array, calculate the sum of all odd elements only.

Example Input:
Array = [11, 22, 33, 44, 55]
 
Expected Output:
Odd elements = 11, 33, 55
Sum = 99
*/
import java.util.Scanner;
class Example04{
	static void displayArray(int A[]){
		System.out.print("\tArray                   : ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ,");
		}
	}
	static void OddArrayElement(int A[]){
		int sum=0;
		System.out.print("\n\tOdd Elements            : ");
		for(int i=0;i<A.length;i++){
			if(A[i] % 2 != 0)
			System.out.print(A[i]+" ,");
		}
	}
	static void sumOfOddArrayElement(int A[]){
		int sum=0;
		for(int i=0;i<A.length;i++){
			if(A[i] % 2 != 0)
			sum=sum+A[i];
		}
		System.out.print("\n\tSum of Odd Array Element: "+sum+"\n");
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
        OddArrayElement(num);
        sumOfOddArrayElement(num);
	}
}
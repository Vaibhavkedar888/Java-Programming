/*
Array Case 3: Average of Array Elements
Find the average value of all elements in an array.
Example Input:
 Array = [2, 4, 6, 8, 10]

Expected Output:
Average = 6.0
*/
import java.util.Scanner;
class Example03{
	static void displayArray(int A[]){
		System.out.print("\tArray  : { ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ,");
		}
		System.out.print(" }");
	}
	static void avgOfArrayElement(int A[]){
		int sum=0;
		for(int i=0;i<A.length;i++){
			sum=sum+A[i];
		}
		System.out.print("\n\tAvarage of Array Element : "+(sum*1.0)/A.length+"\n");
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
        avgOfArrayElement(num);
	}
}
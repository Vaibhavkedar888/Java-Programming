/* 
Array Case 2: Sum of Array Elements
Find the sum of all elements in an array.
Example Input:
Array = [5, 8, 12, 6]
Expected Output:
Sum = 31
*/
import java.util.Scanner;
class Example02{
	static void displayArray(int A[]){
		System.out.print("\tArray  : { ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ,");
		}
		System.out.print(" }");
	}
	static void sumOfArrayElement(int A[]){
		int sum=0;
		for(int i=0;i<A.length;i++){
			sum=sum+A[i];
		}
		System.out.print("\n\tSum of Array Element : "+sum+"\n");
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
        sumOfArrayElement(num);
	}
}
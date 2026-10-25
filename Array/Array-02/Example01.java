/*
Array Case 1: Forward and Backward Display
 Create an array of integers, store elements in it, and display the elements:
- In forward order (from first to last)
- In backward order (from last to first)
 Example Input:
Array = [10, 20, 30, 40, 50]
 Expected Output:
Forward: 10 20 30 40 50
Backward: 50 40 30 20 10
*/
import java.util.Scanner;
class Example01{
	static void ForwardArray(int A[]){
		System.out.print("\tForward Array  : { ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ,");
		}
		System.out.print(" }");
	}
	static void BackwardArray(int A[]){
		System.out.print("\n\tBackward Array : { ");
		for(int i=A.length-1;i>=0;i--){
			System.out.print(A[i]+" ,");
		}
		System.out.print(" }\n");
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
        ForwardArray(num);
        BackwardArray(num);
	}
}
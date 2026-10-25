/*
Array Case 8: Shift Last Element to First
WAP to shift last element to first from array.
 Example Input:
input: {10,20,30,40,50}
Output:{50,10,20,30,40}
*/
import java.util.Scanner;
class Example08{
	static void displayArray(int A[]){ 
		System.out.print("\tInput : ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ,");
		}
	}
	static void shiftLastElementFirst(int A[]){
		System.out.print("\n\tOutput: ");
		int temp=A[A.length-1];
		for(int i=A.length-1;i>0;i--){
			A[i]=A[i-1];
		}
		A[0]=temp;
	    for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ,");
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
        shiftLastElementFirst(num);
	}
}
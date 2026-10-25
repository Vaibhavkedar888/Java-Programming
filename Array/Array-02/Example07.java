/*
Array Case 7: Shift First Element to Last
 
WAP to shift first element to last from array
 
Example Input:
input: {10,20,30,40,50}
output:{20,30,40,50,10}
*/
import java.util.Scanner;
class Example07{
	static void displayArray(int A[]){
		System.out.print("\tInput : ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ,");
		}
	}
	static void shiftFirstElementLast(int A[]){
		System.out.print("\n\tOutput: ");
		int temp=A[0];
		for(int i=0;i<A.length-1;i++){
			A[i]=A[i+1];
		}
		A[A.length-1]=temp;
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
        shiftFirstElementLast(num);
	}
}
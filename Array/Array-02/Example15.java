/* 
Array Case 15: Second Maximum Element
 
Write a program to find the second largest element in an array.
 
Example Input:
Array = [15, 72, 48, 96, 33, 81]
 
Expected Output:
Second Maximum Element = 81
*/
import java.util.Scanner;
public class Example15{
	public static void displayArray(int A[]){
		System.out.print("\nArray : ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void secMaxElementArray(int A[]){
		int max=0;
		int secMax=0;
		for(int i=0;i<A.length;i++){
		    if (A[i] > max) {
                secMax = max;
                max = A[i];
            }
            else if(secMax <A[i]&& A[i]<max){
            	secMax=A[i];
            }
		}


		System.out.print("\n second max element : "+secMax);
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
	    secMaxElementArray(num);
	}
}
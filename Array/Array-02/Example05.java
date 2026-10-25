/*
Array Case 5: Average of Odd and Even Elements
 
From a given array, separately calculate:
- Average of odd elements
- Average of even elements
 
Example Input:
Array = [5, 10, 15, 20, 25]
 
Expected Output:
Odd elements = 5, 15, 25 â†’ Average = 15.0
Even elements = 10, 20 â†’ Average = 15.0
*/
import java.util.Scanner;
class Example05{
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
	static void EvenArrayElement(int A[]){
		int sum=0;
		System.out.print("\n\tEven Elements            : ");
		for(int i=0;i<A.length;i++){
			if(A[i] % 2 == 0)
			System.out.print(A[i]+" ,");
		}
	}
	static void avgOddArrayElement(int A[]){
		int sum=0;
		int count=0;
		for(int i=0;i<A.length;i++){
			if(A[i] % 2 != 0)
			{
				sum=sum+A[i];
				count++;
			}
		}
		double res=(sum*1.0)/count;
		System.out.print("\n\tAvarage Odd Elements    : "+res);
	}
	static void avgEvenArrayElement(int A[]){
		int sum=0;
		int count=0;
		for(int i=0;i<A.length;i++){
			if(A[i] % 2 == 0)
			{
				sum=sum+A[i];
				count++;
			}
		}
		double res=(sum*1.0)/count;
	    System.out.print("\n\tAvarage Even Elements   : "+res);
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
        avgOddArrayElement(num);
        EvenArrayElement(num);
        avgEvenArrayElement(num);
        
	}
}
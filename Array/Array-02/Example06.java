/*
Array Case 6: Elements Greater than Average
Find the average of the array, and then display all elements that are greater than this average.
 
Example Input:
Array = [3, 7, 9, 2, 6]
 
Step 1: Average = (3+7+9+2+6)/5 = 27/5 = 5.4
Step 2: Elements greater than 5.4 â†’ 7, 9, 6
 
Expected Output:
Average = 5.4
Elements greater than average = 7 9 6
*/
import java.util.Scanner;
class Example06{
	static void displayArray(int A[]){
		System.out.print("\tArray                   : ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ,");
		}
	}
	static void ElementGreaterThanavg(int A[]){
		int sum=0;
		for(int i=0;i<A.length;i++){
				sum=sum+A[i];
		}
		double res=(sum*1.0)/A.length;
		System.out.println("\n\tAvarage : "+res);
		System.out.print("\tElement Greater Than Avg : ");
		for(int i=0;i<A.length;i++){
			if(A[i]>res){
				System.out.print(A[i]+" ");
			}
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
        ElementGreaterThanavg(num);
	}
}
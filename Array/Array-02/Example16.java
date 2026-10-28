/* 
Find the max element in random element Array 
*/
import java.util.Scanner;
import java.util.Random;
public class Example16{
	public static void displayArray(int A[]){
		System.out.print("\nArray : ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void inputArray(int A[]){
		Random random=new Random();
		for(int i=0;i<A.length;i++){
			A[i]=random.nextInt(200000);
		}
	}
	public static void maxElement(int A[]){
		if(A==null){
			System.err.println("invalid Array");
			System.exit(1);
		}
		if(A.length==1){
			System.out.println(A[0]);
		}
		System.out.print("\nMax Element : ");
		int max=Integer.MIN_VALUE;
		for(int i=0;i<A.length;i++){
			if(A[i]>max){
				max=A[i];
			}
		}
		System.out.println(max);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size of Array : ");
		int size=sc.nextInt();
		int num[]=new int[size];
		/*
	    for(int i=0;i<num.length;i++){
	    	System.out.print("Enter the Array element: ");
	    	num[i]=sc.nextInt();
	    }*/
	    inputArray(num);
	    displayArray(num);
	    maxElement(num);
	    
	}
}
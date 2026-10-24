import java.util.Scanner;
class Example04 {

	public static void display(int []A){
		for(int i=0;i<A.length;i++){
			 System.out.println(i  +" = "+A[i]);
		}
	}
	public static void main(String[] args) {	
		Scanner scanner=new Scanner(System.in);	
		int size;
		System.out.println("Enter Size of An Array ");
		size=scanner.nextInt();
		int numbers[]=new int[size];

		for(int i=0;i<numbers.length;i++){
			System.out.println("Enter Number ....");
			 numbers[i]=scanner.nextInt();
		}
		display(numbers);  // numbers ----> int[]
		                   // int x   x  --> int
	}	
}
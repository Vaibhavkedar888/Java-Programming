import java.util.Scanner;
class Example05 {

	public static void display(int []A){
			// print Array
		for(int i=0;i<A.length;i++){
			 System.out.println(i  +" : "+A[i]);
		}
	}
	public static void inputArray(int A[]){
		Scanner scanner=new Scanner(System.in);	
		for(int i=0;i<A.length;i++){
			System.out.println("Enter Number: ");
			 A[i]=scanner.nextInt();
		}
	}	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
		int size;
		System.out.println("Enter Size of An Array: ");
		size=scanner.nextInt();
		int numbers[]=new int[size];
		inputArray(numbers);
		display(numbers);  	
	}
}
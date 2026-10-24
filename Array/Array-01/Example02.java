import java.util.Scanner;
class Example02{

	static void display(int A[]){
		for(int i=0;i<A.length;i++){
			System.out.println(i+" : "+A[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=sc.nextInt();
		int number[]=new int[size];
		for(int i=0;i<number.length;i++){
			number[i]=sc.nextInt();
		}
		display(number);
	}
}
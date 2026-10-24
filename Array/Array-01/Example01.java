import java.util.Scanner;
class Example01{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size : ");
		int size=sc.nextInt();
		int number[]=new int[size];
		 for(int i=0;i<number.length;i++){
		 	System.out.print("enter array element : ");
		    number[i]=sc.nextInt();
		 }
		 for(int i=0;i<number.length;i++){
		 	System.out.println(i+" : "+number[i]);
		 }
	}
}
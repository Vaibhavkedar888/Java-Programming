import java.util.Scanner;
public class Example01{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size =sc.nextInt();
        int number[]=new int[size];
		for(int i=0;i<number.length;i++){
			number[i]=sc.nextInt();
		}
		for(int i=0;i<number.length;i++){
			System.out.println(i+" : "+number[i]);
		}
	}
}
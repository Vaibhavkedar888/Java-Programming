/*
15
14 13
12 11 10
9  8  7  6
5  4  3  2  1
*/
import java.util.Scanner;
class Example02{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int count=15;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.printf("%-2d ",count);
				count--;
			}
			System.out.println();
		}
	}
}
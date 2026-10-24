/*
11
12  7   
13  8   4
14  9   5  2
15  10  6  3   1
*/
import java.util.Scanner;
class Example07{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int cnt=11;
		for(int i=n;i>=1;i--){
			int c=cnt;
			for(int j=n;j>=i;j--){
				System.out.printf("%-2d ",c);
				c=c-j;
			}
			cnt++;
			System.out.println();
		}
	}
}
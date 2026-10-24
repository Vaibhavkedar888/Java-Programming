/*
1 
3   2
6   5  4
10  9  8  7
15 14  13 12 11
*/
import java.util.Scanner;
class Example03{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++){
			int c=count;
			for(int j=1;j<=i;j++){
				System.out.printf("%-2d ",c);
				c--;
			}
			System.out.println();
			count=count+i+1;
		}
	}
}
/*
5   
9     4
12    8     3
14	  11    7    2
15    13    10   6   1
*/
import java.util.Scanner;
class Example09{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int cnt=5;
		for(int i=n;i>=1;i--){
			int c=cnt;
			for(int j=i;j<=n;j++){
				System.out.printf("%-2d ",c);
				c=c-j-1;
			}
			cnt=cnt+i-1;
			System.out.println();
		}
	}
}
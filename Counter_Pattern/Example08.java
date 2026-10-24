/*
1
6    2    
10   7    3 
13   11   8    4
15   14   12   9   5
*/
import java.util.Scanner;
class Example08{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int cnt=1;
		for(int i=n;i>=1;i--){
			int c=cnt;
			for(int j=i;j<=n;j++){
				System.out.printf("%-2d ",c);
				c=c-j;
			}
			cnt=cnt+i;
			System.out.println();
		}
	}
}
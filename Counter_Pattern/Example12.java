/*
5
4  9  
3  8   12
2  7   11   14
1  6   10   13   15
*/
import java.util.Scanner;
class Example12{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int cnt=5;
		for(int i=n;i>=1;i--){
			int c=cnt;
			for(int j=n;j>=i;j--){
				System.out.printf("%-2d ",c);
				c=c+j;
			}
			cnt--;
			System.out.println();
		}
	}
}
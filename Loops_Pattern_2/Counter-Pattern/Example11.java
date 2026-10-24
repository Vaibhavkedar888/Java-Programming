/*
15   
10   14
6     9    13
3     5     8    12
1     2     4     7    11
*/
import java.util.Scanner;
class Example11{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n : ");
		int n=sc.nextInt();
		int i,j,cnt=15;
		for(i=n;i>=1;i--){
			int c=cnt;
			for(j=i;j<=n;j++){
				System.out.printf("%-2d ",c);
				c=c+j;
			}
			cnt=cnt-i;
			System.out.println();
		}
	}
}
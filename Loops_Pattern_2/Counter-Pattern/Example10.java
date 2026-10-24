/*
11
7    12
4     8   13
2     5    9   14
1     3    6   10   15
*/
import java.util.Scanner;
class Example10{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n : ");
		int n=sc.nextInt();
		int i,j,cnt=11;
		for(i=n;i>=1;i--){
			int c=cnt;
			for(j=i;j<=n;j++){
				System.out.printf("%-2d ",c);
				c=c+j+1;
			}
			cnt=cnt-i+1;
			System.out.println();
		}

	}
}
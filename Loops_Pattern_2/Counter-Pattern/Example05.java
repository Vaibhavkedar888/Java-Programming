/*
1
2  6
3  7  10
4  8  11 13
5  9  12 14 15
*/
import java.util.*;
class Example05{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		int cnt=1;
		int i,j;
		for(i=n;i>=1;i--){
			int c=cnt;
			for(j=n;j>=i;j--){
				System.out.printf("%-2d ",c);
				c=c+j-1;
			}
			cnt++;
			System.out.println();
		}
	}
}
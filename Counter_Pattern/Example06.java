/* 
15
14  10
13   9   6
12   8   5  3
11   7   4  2  1
*/
import java.util.Scanner;
class Example06{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int cnt=15;
		for(int i=n;i>=1;i--){
			int c=cnt;
			for(int j=n;j>=i;j--){
				System.out.printf("%-2d ",c);
				c=c-(j-1);
			}
			cnt--;
			System.out.println();
		}
	}
}
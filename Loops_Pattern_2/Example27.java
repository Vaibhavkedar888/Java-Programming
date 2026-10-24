import java.util.Scanner;
class Example27{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){
			for(int j=n;j>i;j--){
				System.out.print("  ");
			}
			for(int k=i;k>=1;k--){
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
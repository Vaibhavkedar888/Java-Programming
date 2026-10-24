import java.util.Scanner;
class Example22{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i-1;j++){
				System.out.print("  ");
			}
			for(int k=i;k<=n;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
import java.util.Scanner;
class Example21{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i-1;j++){
				System.out.print("  ");
			}
			for(int k=i;k<=n;k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
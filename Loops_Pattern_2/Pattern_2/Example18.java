import java.util.Scanner;
class Example18{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
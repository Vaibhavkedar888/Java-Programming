import java.util.Scanner;
class Example19{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("  ");
			}
			for(int k=i;k>=1;k--){
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
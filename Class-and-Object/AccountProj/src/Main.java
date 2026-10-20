import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\tBank Name       : ");
		String bankname=sc.next();
		System.out.print("\tAccount Number  : ");
		int accno=sc.nextInt();
		System.out.print("\tAccount Type    : ");
		String acctype=sc.next();
		System.out.print("\tAccount Balance : ");
		double accbal=sc.nextDouble();
		System.out.print("\tBranch          : ");
		String branch=sc.next();

		Account a=new  Account();
		a.setBankName(bankname);
		a.setAccno(accno);
		a.setaccType(acctype);
		a.setaccBal(accbal);
		a.setBranch(branch);

		a.showInfo();
	}
}
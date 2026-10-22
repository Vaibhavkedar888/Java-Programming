import java.util.Scanner;
public class App{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\tCountry Name       : ");
		String name=sc.next();
		System.out.print("\tCountry Capital    : ");
		String capital=sc.next();
		System.out.print("\tCountry Population : ");
		int popul=sc.nextInt();

		Country c=new Country();
		c.setName(name);
		c.setCapital(capital);
		c.setPopul(popul);
		c.show();
	}
}
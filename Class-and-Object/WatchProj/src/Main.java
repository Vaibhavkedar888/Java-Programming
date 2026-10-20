import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter brand      : ");
		String brand=sc.next();
		System.out.print("Enter Watch Type : ");
		String WatchType=sc.next();
		System.out.print("Enter Price      : ");
		double price=sc.nextDouble();

		Watch w=new Watch();
		w.setBrand(brand);
		w.setWatchType(WatchType);
		w.setPrice(price);

		w.showInfo();
	}
}
import java.util.Scanner;
public class App{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\tBrand      : ");
		String brand=sc.next();
		System.out.print("\tcamera     : ");
		int camera=sc.nextInt();
		System.out.print("\tBattery    : ");
		int battery=sc.nextInt();
		System.out.print("\tPrice      : ");
		double price=sc.nextDouble();

		Mobile m=new Mobile();
		m.setBrand(brand);
		m.setPrice(price);
		m.setCamera(camera);
		m.setBattery(battery);

		m.show();
	}
}
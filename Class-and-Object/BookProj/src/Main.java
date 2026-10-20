import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\tBook Name  : ");
		String BookName=sc.next();
		System.out.print("\tBook Type  : ");
		String Type=sc.next();
		System.out.print("\tBook Price : ");
		double Price=sc.nextDouble();
		System.out.print("\tBook Pages : ");
		int pages=sc.nextInt();

		Book b=new  Book();
		b.setBookName(BookName);
		b.setType(Type);
		b.setPrice(Price);
		b.setPages(pages);
		b.showInfo();
	}
}
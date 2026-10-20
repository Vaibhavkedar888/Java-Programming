import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Room no: ");
		int roomNo=sc.nextInt();
		System.out.print("Enter Room Type: ");
		String roomType=sc.next();
		System.out.print("Enter Room Price: ");
		double roomPrice=sc.nextDouble();
		System.out.print("Enter Room Available (Y or N) : ");
		char isAvailable=sc.next().charAt(0);

		Room r=new Room();
		r.setRoomNo(roomNo);
		r.setRoomType(roomType);
		r.setRoomPrice(roomPrice);
		r.setIsAvailable(isAvailable);

		r.showInfo();

	}
}
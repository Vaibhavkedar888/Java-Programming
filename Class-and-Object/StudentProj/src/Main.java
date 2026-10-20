import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Id    : ");
		int id=sc.nextInt();
		System.out.print("Enter Name  : ");
		String name=sc.next();
		System.out.print("Enter Marks : ");
		double mark=sc.nextDouble();
		System.out.print("Enter Grade : ");
		char grade=sc.next().charAt(0);

		Student s=new Student();
		s.setId(id);
		s.setName(name);
		s.setMark(mark);
		s.setGrade(grade);

		s.showInfo();

	}
}
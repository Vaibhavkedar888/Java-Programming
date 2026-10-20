import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=sc.next();
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        System.out.println("Enter city: ");
        String city=sc.next();
        System.out.println("Enter mobile no: ");
        int mobileno=sc.nextInt();
        
        p.setName(name);
        p.setAge(age);
        p.setCity(city);
        p.setMobileno(mobileno);
        p.showInfo();
    }
}

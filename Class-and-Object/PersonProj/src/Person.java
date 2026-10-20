
public class Person {
    String name;
    int age;
    String city;
    int mobileno;

    void showInfo() {
        System.out.println("-------------------");
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
        System.out.println(mobileno);
       
        System.out.printf("%-2s %-2d %-2s %-2s\n",name,age,city,mobileno);
    }
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    String getCity() {
        return city;
    }
    int getMobileno() {
        return mobileno;
    }
    void setName(String pname) {
        name = pname;
    }
    void setAge(int page) {
        age = page;
    }
    void setCity(String pcity) {
        city = pcity;
    }
    void setMobileno(int pmobileno) {
        mobileno = pmobileno;
    }
}

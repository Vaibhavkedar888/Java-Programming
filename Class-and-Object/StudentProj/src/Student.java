public class Student{
	int id;
	String name;
	double mark;
	char grade;

	void showInfo(){
		System.out.println("\n--------------------------------------------");
		System.out.println("              Student Information      ");
		System.out.println("--------------------------------------------");
		System.out.println("\tID     : "+id);
		System.out.println("\tName   : "+name);
		System.out.println("\tMarks  : "+mark);
		System.out.println("\tgrade  : "+grade);
		System.out.println("--------------------------------------------");
		System.out.printf("\t%d\t%s\t%5.2f\t%c\n",id,name,mark,grade);
		System.out.println("--------------------------------------------\n");
	}

	int getId(){ return id; }
	String getName(){ return name; }
	double getMark(){ return mark; }
	char getGrade(){ return grade; }

	void setId(int sid){
		id=sid;
	}

	void setName(String sname){
		name=sname;
	}
	void setMark(double smark){
		mark=smark;
	}
	void setGrade(char sgrade){
		grade=sgrade;
	}

}
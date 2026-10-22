public class Country{
	String name;
	int popul;
	String capital;

	void show(){
		System.out.println("\n              Country Information ");
		System.out.println("-----------------------------------------");
		System.out.println("\tCountry Name       : "+name);
		System.out.println("\tCountry Capital    : "+capital);
		System.out.println("\tCountry Population : "+popul);
		System.out.println("-----------------------------------------");
		System.out.printf("\t%s\t\t%d\n\n",name,popul);	
	}
    String getName(){ return name; }
    String getCapital(){ return capital; }
    int getPopul(){ return popul; }

    void setName(String nname){
    	name=nname;
    }
    void setCapital(String ncapital){
    	capital=ncapital;
    }
    void setPopul(int npopul){
    	popul=npopul;
    }

}
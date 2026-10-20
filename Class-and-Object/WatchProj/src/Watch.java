public class Watch{
	String brand;
	String WatchType;
	double price;

	void showInfo(){
		System.out.print("------------------------------------------------------\n");
		System.out.print("              Watch Information                     \n");
		System.out.print("------------------------------------------------------\n");
		System.out.println("\tBrand       : "+brand);
		System.out.println("\tWatch Type  : "+WatchType);
		System.out.println("\tPrice       : "+price);
		System.out.print("------------------------------------------------------\n");
		System.out.printf("\t%s\t%s\t%5.2f\n",brand,WatchType,price);
		System.out.print("------------------------------------------------------\n");
	}
    String getBrand(){ return brand; }
    String getWatchType(){ return WatchType; }
    double getPrice(){ return price; }

    void setBrand(String wbrand){
    	brand=wbrand;
    }
    void setWatchType(String wWatchType){
    	WatchType=wWatchType;
    }
    void setPrice(double wprice){
    	price=wprice;
    }
}
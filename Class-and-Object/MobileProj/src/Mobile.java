public class Mobile{
	String brand;
	double price;
	int camera;
	int battery;

	void show(){
		System.out.println("\n              Mobile Information ");
		System.out.println("-----------------------------------------");
		System.out.println("\tBrand   : "+brand);
		System.out.println("\tCamera  : "+camera);
		System.out.println("\tBattery : "+battery);
		System.out.println("\tPrice   : "+price);
		System.out.println("-----------------------------------------");
		System.out.printf("\t%s\t\t$%5.2f\n\n",brand,price);	
	}
	public String getBrand(){ return brand; }
	public double getPrice(){ return price; }
	public int getCamera(){ return camera; }
	public int getBattery(){ return battery; }

	public void setBrand(String nbrand){ brand=nbrand; }
	public void setPrice(double nprice){ price=nprice; }
	public void setCamera(int ncamera){ camera=ncamera; }
	public void setBattery(int nbattery){ battery=nbattery; }
}
public  class Book{
	String BookName;
	String Type;
	double Price;
	int pages;

	void showInfo(){
		System.out.println("\n              Book Information ");
		System.out.println("-----------------------------------------");
		System.out.println("\tBook Name  : "+BookName);
		System.out.println("\tBook Type  : "+Type);
		System.out.println("\tBook Price : "+Price);
		System.out.println("\tBook Pages : "+pages);
		System.out.println("-----------------------------------------");
		System.out.printf("\t%s\t\t$%5.2f\n\n",BookName,Price);	
	}
    String getBookName(){ return BookName; }
    String getType(){ return Type; }
    double getPrice(){ return Price; }
    int getPages(){ return pages; }

    void setBookName(String nBookName){
    	BookName=nBookName;
    }
    void setType(String nType){
    	Type=nType;
    }
    void setPrice(double nPrice){
    	Price=nPrice;
    }
    void setPages(int npages){
    	pages=npages;
    }

}
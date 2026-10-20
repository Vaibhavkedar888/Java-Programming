public class Room{
	int roomNo;
	String roomType;
	double roomPrice;
	char isAvailable;

	void showInfo() {
		
        System.out.println("\n\n---------------------------------------------------------");
        System.out.println("                   Room  Information                   ");
        System.out.println("---------------------------------------------------------");
        System.out.println("\tRoom No   : "+roomNo);
        System.out.println("\tRoom Type : "+roomType);
        System.out.println("\tRoom Price: "+roomPrice);
        System.out.println("\tAvilable  : "+isAvailable);
        System.out.println("---------------------------------------------------------");
        System.out.printf("\t%d\t%s\t%5.2f\t\t%c\n",roomNo,roomType,roomPrice,isAvailable);
        System.out.println("---------------------------------------------------------");
    }

    int getRoomNo(){ return roomNo; }
    String getRoomType(){ return roomType; }
    double getRoomPrice(){ return roomPrice; }
    char getIsAvailable(){ return isAvailable; }

    void setRoomNo(int pRoomNo) {
        roomNo = pRoomNo;
    }
    void setRoomType(String pRoomType){
    	roomType=pRoomType;
    }
    void setRoomPrice(double pRoomPrice){
    	roomPrice=pRoomPrice;
    }
    void setIsAvailable(char pIsAvailable){
    	isAvailable=pIsAvailable;
    }
}
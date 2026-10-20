public class Account{
	String bankname;
	String acctype;
	int accno;
	double accbal;
	String branch;

	void showInfo(){
		System.out.println("\n              Account Information ");
		System.out.println("-----------------------------------------");
		System.out.println("\tBank Name       : "+bankname);
		System.out.println("\tAccount Number  : "+accno);
		System.out.println("\tAccount Type    : "+acctype);
		System.out.println("\tAccount Balance : "+accbal);
		System.out.println("\tBranch          : "+branch);
		System.out.println("-----------------------------------------");
		System.out.printf("\t%d\t\t$%5.2f\n\n",accno,accbal);	
	}
    String getBankName(){ return bankname; }
    String getaccType(){ return acctype; }
    double getaccBal(){ return accbal; }
    int getAccno(){ return accno; }
    String getBranch(){ return branch; }

    void setBankName(String nbankname){
    	bankname=nbankname;
    }
    void setaccType(String nacctype){
    	acctype=nacctype;
    }
    void setaccBal(double naccbal){
    	accbal=naccbal;
    }
    void setAccno(int naccno){
    	accno=naccno;
    }
    void setBranch(String nbranch){
    	branch=nbranch;
    }
}
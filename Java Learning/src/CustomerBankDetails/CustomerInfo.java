package CustomerBankDetails;

public class CustomerInfo {

	String name;
	int ID;
	double mnum;
	double climit;
	double ccredit;
	public CustomerInfo(String name, int ID, double mnum, double climit, double ccredit)
	{
		this.name=name;
		this.ID=ID;
		this.mnum=mnum;
		this.climit=climit;
		this.ccredit=ccredit;
	}
	public void showNameAndID()
	{
		System.out.printf("Customer name,mobile number, climit, ccredit and ID is"+name,+mnum,+climit,+ccredit,+ID);		
	} 
	
}

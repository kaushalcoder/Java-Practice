package CustomerBankDetails;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer("kaushal", 900);
		c1.deposit(10000);
		c1.showBalance();
		c1.calInterest(1000, 10.5, 12);
		
	}

}

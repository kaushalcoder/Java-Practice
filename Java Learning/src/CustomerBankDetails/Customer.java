package CustomerBankDetails;

public class Customer {
	
	String name;
	double bal;
	
	public Customer(String name, double bal) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.bal=bal;
	}
	
	public void deposit(int amount)
	{
		bal=bal+amount;
	}
	public void showBalance()
	{
		System.out.println("Current bal is"+bal);
	}
	public void calInterest(int p, double r, double t)
	{
		double interest = (p*r*t)/100;
		System.out.println("Interest is "+interest);
	}

}

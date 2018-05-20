package bankAccountApp;

public class Checkings extends Account {
	
	private int debitCardNumber;
	private int pin;
	

	public Checkings(String name,String sSN,double initDeposit)
	{
		super(name,sSN,initDeposit);
		accountNumber="2"+ accountNumber;
		//System.out.println("AccountNumber: "+accountNumber);
		//System.out.println("New Checking Account Created");
		
		setDebitCardNumber();
	}
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate=(double) (getBaseRate()*0.15);
		
	}

	private void setDebitCardNumber()
	{
		debitCardNumber=(int) (Math.random()*Math.pow(10, 13));
		pin=(int) (Math.random()*Math.pow(10, 4));
		
	}
	public void showInfo()
	{
		super.showInfo();
		System.out.println("AccountType:Checking");
		System.out.println("Checking Account Features: "+
		"\nDebitCardNumber: "+debitCardNumber+
		"\npin: "+pin+
		"\nBaseInterest Rate: "+rate);
		
	}
}

	

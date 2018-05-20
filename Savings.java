package bankAccountApp;

public class Savings extends Account{
	
	private int safetyBoxId;
	private int accessCode;
	
	public Savings(String name,String sSN,double initDeposit)
	{
		super(name,sSN,initDeposit);
		accountNumber="1"+ accountNumber;
		//System.out.println("AccountNumber: "+accountNumber);
		//System.out.println("New Savings Account Created");
	setSafetyBoxId();
		
	}
	
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate=(double) (getBaseRate()-0.25);
	}
	private void setSafetyBoxId()
	{
		safetyBoxId=(int) (Math.random()*Math.pow(10, 3));
		accessCode=(int) (Math.random()*Math.pow(10, 4));
	}
	
	public void showInfo()
	{
		super.showInfo();
		System.out.println("AccountType:Savings");
		System.out.println("SafetyBox Features: "+
		"\nSafetyBoxId: "+safetyBoxId+
		"\nAccessCode: "+accessCode+
		"\nBaseInterestRate: "+rate);
		
		
	}
	
}

	
	

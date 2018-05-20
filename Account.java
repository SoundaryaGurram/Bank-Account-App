package bankAccountApp;

public abstract class Account implements IBaseRate
{
	private String name;
	private String ssnNumber;
	private double balance;
	
	protected String accountNumber;
	static int id=10000;
	protected double rate;
	
	public Account(String name,String sSN,double initDeposit)
	{
		this.name=name;
		this.ssnNumber=sSN;
		balance=initDeposit;
	    this.accountNumber=setAccountNumber();
	    setRate();
		
	}
	public void calculateCompound()
	{
		double interest=balance*(rate/100);
		printBalance();
		balance=balance+interest;
		printBalance();
		
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("You have deposited the amount of "+amount);
		System.out.println("Balance: "+balance);
	}
	
	public void withdraw(double amount)
	{
		balance=balance-amount;
		System.out.println("You have withdrwan the amount of"+amount);
		System.out.println("Balance: "+balance);
	}
	
	public void transfer(String WhereTo,double amount)
	{
		balance=balance-amount;
		System.out.println("Your amount of "+amount+"is transferred to"+WhereTo);
		System.out.println("Balance: "+balance);
	}
	
	
    public abstract void setRate();
	private String setAccountNumber()
	{ 
		id++;
		String lastTwoDigitsOfSsn=ssnNumber.substring(ssnNumber.length()-2, ssnNumber.length());
		int rand=(int) (Math.random()*Math.pow(10, 3));
		return lastTwoDigitsOfSsn+id+rand;
		
	}
	public void printBalance()
	{
		System.out.println("Balance: "+balance);
	}
	public void showInfo()
	{
		System.out.println("Name: "+name+
				"\nAccountNumber: "+accountNumber+
				"\nBalance: "+balance);
				
				
	
				
	}
}

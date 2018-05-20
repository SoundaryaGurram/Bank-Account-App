package bankAccountApp;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Account a=new Account();
		Checkings ch=new Checkings("Soundarya Gurram","123456789",400.00);
		 Savings sv=new Savings("Divya Yerram","678226268",600.00);
		sv.calculateCompound();
		 ch.showInfo();
		 
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	
		 sv.showInfo();
	}

}

package bankAccountApp;

public interface IBaseRate {

	default double getBaseRate()
	{
		return 4.5;
	}
	
}

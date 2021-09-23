package Demo1;

import org.testng.annotations.Test;

public class ContactTest 
{
	@Test(groups="RegressionSuite")
	public void CreateContactTest()
	{
		System.out.println("execute CreateContactTest");
	}
	
	@Test(groups="SmokeSuite")
	public void UpdateContactTest()
	{
		System.out.println("execute UpdateContactTest");
	}
	
	@Test(groups="RegressionSuite")
	public void DeleteContactTest()
	{
		System.out.println("execute DeleteContactTest");
	}
	
	
}

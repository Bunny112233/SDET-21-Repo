package Demo2;

import org.testng.annotations.Test;

public class OrgTest 
{

	@Test(groups="RegressionSuite")
	public void CreateOrgTest()
	{
		String url = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		System.out.println(url);
		System.out.println(BROWSER);
		System.out.println("execute CreateOrgTest");
	}
	
	@Test(groups="SmokeSuite")
	public void UpdateOrgTest()
	{
		System.out.println("execute UpdateOrgTest");
	}
	
	@Test(groups="RegressionSuite")
	public void DeleteOrgTest()
	{
		System.out.println("execute DeleteOrgTest");
	}
	
	@Test(groups="SmokeSuite")
	public void SearchOrgTest()
	{
		System.out.println("execute SearchOrgTest");
	}
	
}

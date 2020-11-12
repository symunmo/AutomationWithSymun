package controller;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import controller.WebDriverManager;

public class BaseClass extends WebDriverManager{
	Utility utility;
	@BeforeSuite
	public void beforeSuite(){
		utility = new Utility();
	}
	@Parameters({"Browser","HeadLess"})
	@BeforeTest
	public void BeforeTest(@Optional (Constants.platform_chrome) String Browser,
			@Optional (Constants.headLess) String HeadLess) {
		Utility utility = new Utility();
		utility.loadPropertyFile(
				Constants.projectPath+"/src/main/java/controller/test.properties");
		System.out.println(utility.getProperty("name"));
		setWebDriver(Browser);
		openBrowser(HeadLess);
	}
	
	@AfterTest
	public void AfterTest() {
		closeBrowser();
	}
	
	public void loadProperyFile(String name) {
		if(name.equalsIgnoreCase("setup"))
		
		utility.loadPropertyFile(
				Constants.projectPath+"/src/main/java/controller/test.properties");
		System.out.println(utility.getProperty("name"));
	}
}

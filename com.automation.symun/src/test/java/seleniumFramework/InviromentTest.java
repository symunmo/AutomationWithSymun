package seleniumFramework;
import org.testng.annotations.Test;

import controller.BaseClass;
import controller.Constants;

public class InviromentTest extends BaseClass{
	
	@Test
	public void goToGoogle() {
		goTo(Constants.google_url);
	}
	
}

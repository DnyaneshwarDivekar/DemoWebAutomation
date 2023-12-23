package sample_tests;

import org.testng.annotations.Test;

import base.TestBase;
import pages.TextboxPage;

public class Test1 extends TestBase {
	
	
	@Test
	
	public void test1() {
		
		TextboxPage textboxPage = new TextboxPage(driver);
		
		textboxPage.navigateToTextboxPage();
		
	}

}

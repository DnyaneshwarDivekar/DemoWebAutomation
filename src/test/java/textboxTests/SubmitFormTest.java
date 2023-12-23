package textboxTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;
import pages.TextboxPage;

public class SubmitFormTest extends TestBase {
	
	
	@Test
	
	public void SubmitForm_TC() {
		
		TextboxPage textboxPage = new TextboxPage(driver);
	    
		textboxPage.navigateToTextboxPage();
		textboxPage.enterFullName("DD User");
		textboxPage.enterEmail("dd@gmail.com");
		textboxPage.enterCurrentAddress("India");
		textboxPage.enterPermanentAddress("Delhi");
		textboxPage.clickOnSubmitButton();
		
		String alertText = textboxPage.getAlertText();
		
		boolean flag = false;
				
        if (alertText.contains("Submitted Form")) {
        	
         flag = true;
        } else {
        	
         flag = false;
        }
        
        Assert.assertEquals(flag,true);
	
	}

}

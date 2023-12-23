package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextboxPage extends BasePage {

    @FindBy(xpath = "//*[@id='userName']")
    private WebElement full_name;
    
    @FindBy (xpath ="//*[@id='userEmail']")
    private WebElement email;
    
    @FindBy (xpath ="//*[@id='currentAddress']")
    private WebElement currentAddress;
    
    @FindBy (xpath ="//*[@id='permanentAddress']")
    private WebElement permanentAddress;
    
    @FindBy (xpath ="//*[@id='textBoxForm']/button")
    private WebElement submitButton;
    
    public TextboxPage(WebDriver driver) {
        super(driver);
    }
    
    public void navigateToTextboxPage() {
    	
    	driver.get("https://dd-demo-tau.vercel.app/");
    }
    
    public void enterFullName(String name) {
    	
    	enterTextIntoTextbox(full_name, name);
    	
    }
    
  public void enterEmail(String emailTxt) {
    	
    	enterTextIntoTextbox(email, emailTxt);
    	
    }
    
    
  public void enterCurrentAddress(String txt) {
  	
  	enterTextIntoTextbox(currentAddress, txt);
  	
  }
    
  public void enterPermanentAddress(String txt) {
	  	
	  	enterTextIntoTextbox(permanentAddress, txt);
	  	
	  } 
  
  
  public void clickOnSubmitButton() {
	  
	  clickOnButton(submitButton);
  }
  
  public String getAlertText() {
	  
	  String text = driver.switchTo().alert().getText();
	  
	  return text;
  }
    
    
    public void enterTextIntoTextbox(WebElement element, String txt) {
    	
    	element.sendKeys(txt);
    }

    public void clickOnButton(WebElement element) {
    	
    	element.click();
    }
   
}
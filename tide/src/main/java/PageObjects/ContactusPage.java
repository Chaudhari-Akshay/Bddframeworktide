package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPage {
	public WebDriver driver;

	public ContactusPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Contact Us")	
	WebElement con;

	public void clkContactUs() {
		
		con.click();
	}
	
	@FindBy(xpath="//*[@id=\"j_id0:j_id1:j_id2:idForm:j_id36:j_id37:opMainId:4:navButton\"]/a/img")	
	WebElement call;

	public void clkCall() {
		
		call.click();
	}
	
	@FindBy(linkText = "1-800-879-8433")	
	WebElement t;

	public String getNumber() {
		
		return t.getText();
	}
	
			@FindBy(xpath="//button[@class=\'sticker_close\']")	
	WebElement close;

	public void closes() {
		
		close.click();
	}
}

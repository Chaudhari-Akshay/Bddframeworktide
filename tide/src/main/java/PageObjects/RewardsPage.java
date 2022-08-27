package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RewardsPage {
	public WebDriver driver;

	public RewardsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText ="Coupons and Rewards")	
	WebElement acr;

	public void clkCouponsandRewads() {
		
		acr.click();
	}
	
			@FindBy(xpath ="//div[@class=\'container\']")	
	WebElement gettext;

	public String getrewardtext() {
		
		return gettext.getText();
	}
	
	@FindBy(linkText ="Save Now")	
	WebElement sn;

	public void clksavenow() {
		
		sn.click();
	}
}

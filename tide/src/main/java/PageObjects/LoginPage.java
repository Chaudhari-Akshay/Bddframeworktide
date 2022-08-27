package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public  LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='lilo3746-close-link lilo3746-close-icon']")
	WebElement dis;
	public void dismiss() {
		if(dis.isEnabled()) {
		dis.click();
	}
	}
			@FindBy(linkText  ="Register")	
	WebElement reg;;

	public void clkregister() {
		reg.click();
	}
	
	@FindBy(linkText ="Sign up now")
	
	WebElement sun;
	
	public void clkSignupNow() {
		sun.click();
	}
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement btn;
	public void Loginbtn() {
		btn.click();
	}
	
	@FindBy(id="login-email")
	WebElement email;
	public WebElement enterEmail() {
		return email;
	}
	@FindBy(id="login-password")
	WebElement pass;
	public WebElement enterPassword() {
		return pass;
	}
	
	@FindBy(xpath="//input[@value='LOG IN']")
	WebElement lbtn;
	public void Loginbtn2() {
		lbtn.click();
	}
	
	
}

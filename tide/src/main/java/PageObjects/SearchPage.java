package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='search']")	
	WebElement src;

	public WebElement searchbox() {
		
		return src;
	}
	@FindBy(xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div/div/button[1]")
	WebElement btn;
	public void clkproducts() {
		btn.click();
	}

	@FindBy(xpath="//a[@href='/en-us/shop/type/powder/tide-clean-breeze-powder']")
	WebElement  fp;

	public void FirstProduct() {
		fp.click();
	}

	@FindBy(tagName = "h1")
	WebElement nm;
	public String getName() {
		return nm.getText();
	}
}

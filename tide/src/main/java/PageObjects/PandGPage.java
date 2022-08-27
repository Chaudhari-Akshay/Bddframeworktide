package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PandGPage {
	public WebDriver driver;

	public PandGPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt=\'P&G Everyday icon\']")
	WebElement png;

	public void clkPandGIcon() {

		png.click();

	}
}

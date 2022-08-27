package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class washclothsPAge {

	public WebDriver driver;

	public washclothsPAge(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "How to Wash Clothes")
	WebElement hw;

	public void clkHowtoWashCloths() {

		hw.click();

	}

	@FindBy(xpath = "(//a[@href='/en-us/how-to-wash-clothes/how-to-do-laundry'])[2]")

	WebElement lm;;

	public void clklaundry() {

		lm.click();

	}

	@FindBy(xpath = "//div[@class='col-12 col-lg-7']")
	WebElement gt;

	public String gettext() {

		return gt.getText();

	}

}

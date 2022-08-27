package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoutubePAge {
	public WebDriver driver;

	public YoutubePAge(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt=\'YouTube icon\']")
	WebElement yt;

	public void clkYputubeicon() {

		yt.click();

	}
	

	@FindBy(xpath = "(//div[@id='container'])[4]")
	WebElement ytt;

	public String getChannelname() {

		return ytt.getText();

	}
}

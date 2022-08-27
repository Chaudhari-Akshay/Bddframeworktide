package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TidecleanersPage {
	public WebDriver driver;

	public TidecleanersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Our Commitment")
	WebElement hw;

	public void clkourcommitments() {

		Actions a = new Actions(driver);
		a.moveToElement(hw).build().perform();

	}

	@FindBy(xpath = "//a[@href='/en-us/our-commitment/tide-cleaners-laundry-service']")
	WebElement tc;

	public void clktideCleaners() {
		tc.click();

	}

	@FindBy(xpath = "//span[@aria-label='Link to Price & Locations section']")
	WebElement pl;

	public void clkPriceandlocations() {
		pl.click();

	}

	@FindBy(linkText = "Check the map for the list of all Tide Cleaners laundry services near you")
	WebElement clk;

	public void clksevicesnesryou() {
		clk.click();

	}
}

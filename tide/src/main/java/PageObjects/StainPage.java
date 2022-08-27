package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StainPage {
	public WebDriver driver;

	public  StainPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Shop Products")
	WebElement sp;
	public void clkshopproducts() {
		Actions a =new Actions(driver);
		a.moveToElement(sp).build().perform();
	
	}
	
	@FindBy(xpath = "(//span[@itemprop='name'])[4]")
	WebElement sr;
	public void clkstainremover() {
		sr.click();
	}
	
	@FindBy(xpath = "(//a[@class='plp-filter-btn '])[2]")
	WebElement deepc;
	public void clkdeepclean() {
	deepc.click();
	}
	@FindBy(xpath = "//img[@src='https://images.ctfassets.net/ajjw8wywicb3/2nO0FHSLvl1RNw5iwLFhN1/1c45eff9683b8f8f93abf62e76352f53/TIDE_Ink_Final_370x320.jpg?fm=png']")
	WebElement ar;
	public void clkarticle() {
	ar.click();
	}
	
			@FindBy(xpath = "//div[@class=\'col-12 col-lg-9 article-intro-content\']")
	WebElement art;
	public String getArticletext() {
return art.getText();
	}
}

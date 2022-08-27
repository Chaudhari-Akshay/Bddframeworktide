package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ByneedPage {
	public WebDriver driver;

	public ByneedPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@src='https://images.ctfassets.net/ajjw8wywicb3/5GlqLWyt9mcOCveyiBpsVU/5df8726e568acd0fbd8f4965e19c57fc/browse_by_need.png?fm=jpg&fl=progressive\']")	
	WebElement byn;

	public void clkByNeed() {
		
		byn.click();
	}
	@FindBy(xpath = "//img[@src='https://images.ctfassets.net/ajjw8wywicb3/2KeLYfFe05jqdmu4MToCGs/74e8023eb0c2f5b769b874f2230e4c3c/Tide_HE_Liquid_Plus_Febreze_1200x1200_3.png?fm=jpg&fl=progressive']")	
	WebElement fs;

	public void clkScent() {
		
		fs.click();
	}
	
	
	@FindBy(xpath = "//img[@src='https://images.ctfassets.net/ajjw8wywicb3/3FhPPIHM4zvLRgWgTDbci0/ee023d1a2bd04a3ca004067e4090b95d/Tide_PODS_Spring_Renewal_listing_520x520_most_trusted.png?fm=png']")	
	WebElement fp;

	public void clkFirstproduct() {
		
		fp.click();
	}
	@FindBy(xpath="//button[@class=\'sticker_close\']")	
WebElement close;

public void closes() {
	
	close.click();
}
	

@FindBy(tagName = "h1")	
WebElement getfist;

public String gettextfirstp() {
	
	return getfist.getText();
}
	
}

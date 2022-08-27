package StepDefinations;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import PageObjects.LoginPage;
import PageObjects.TidecleanersPage;
import Utilities.Base;
import Utilities.screenshots;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class TC008 extends Base {
LoginPage lp;
TidecleanersPage tc;

	@Given("Go to Url {string}")
	public void go_to_url(String url) throws IOException, InterruptedException {
		driver=Initializer();
		  log.info("Driver Initialized");
		  driver.get(url);
		  log.info("Navigated to "+url);
		  lp=new LoginPage(driver);
		  Thread.sleep(5000);
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  lp.dismiss();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  tc=new TidecleanersPage(driver); 
	}

	@Given("hover on Our commitment and click on tide cleaners")
	public void hover_on_our_commitment_and_click_on_tide_cleaners() {
	   tc.clkourcommitments();
	   log.info("Clicked on Our commitments");
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   tc.clktideCleaners();
	   log.info("Clicked on Tide cleaners");
	}

	@When("click on Price and location")
	public void click_on_price_and_location() {
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   tc.clkPriceandlocations();
	   log.info("Clicked on Price and Locations");
	}

	@When("click on services near you")
	public void click_on_services_near_you() throws InterruptedException {
		Thread.sleep(5000);
		tc.clksevicesnesryou();
		log.info("clicked on Services near you");
	}

	@When("get newly open page title")
	public void get_newly_open_page_title() throws IOException {
		Set<String>window=driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		log.info("Opened the page : "+driver.getTitle());
		//screenshots.getScreenshot(driver, "TideCleaner");
//		driver.quit();
//		log.info("driver Closed");
	}

	
	
}

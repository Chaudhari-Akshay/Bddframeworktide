package StepDefinations;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import PageObjects.LoginPage;
import PageObjects.SearchPage;
import Utilities.Base;
import Utilities.screenshots;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class TC002 extends Base{
	SearchPage sp;
	LoginPage lp;
	
	@Given("Open the URL {string}")
	public void open_the_url(String url) throws IOException, InterruptedException {
		  driver=Initializer();
		  log.info("Driver Initialized");
		  driver.get(url);
		  log.info("Navigated to "+url);
		  lp=new LoginPage(driver);
		  Thread.sleep(5000);
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  lp.dismiss();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);  
		  sp=new SearchPage(driver);
	}

	@When("Search for {string}")
	public void search_for(String item) {
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);  
	    sp.searchbox().sendKeys(item,Keys.ENTER);
	    log.info("Searched for "+item);
	}

	@When("click on First Product")
	public void click_on_first_product() throws InterruptedException {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)", "");
		 Thread.sleep(5000);
		sp.clkproducts();
		log.info("Click on Products");
		Thread.sleep(5000);
		sp.FirstProduct();
		log.info("Clicked on First Product");
	   
	}

	@Then("Click Get Product name")
	public void click_get_product_name() throws IOException {
		sp.getName();
		log.info("Product Name : "+sp.getName());
	//	screenshots.getScreenshot(driver, "Search");
		//driver.quit();
		  // log.info("Driver Closed");
	}

	

	

}


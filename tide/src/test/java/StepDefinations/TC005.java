package StepDefinations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import PageObjects.ByneedPage;
import PageObjects.LoginPage;
import Utilities.Base;
import Utilities.screenshots;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class TC005 extends Base {
LoginPage lp;
ByneedPage bn;
	
	@Given("navigate to : {string}")
	public void navigate_to(String url) throws IOException, InterruptedException {
		 driver=Initializer();
		  log.info("Driver Initialized");
		  driver.get(url);
		  log.info("Navigated to "+url);
		  lp=new LoginPage(driver);
		  Thread.sleep(5000);
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  lp.dismiss();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  bn=new ByneedPage(driver);
		  
	}

	@Given("click on Browse By need")
	public void click_on_browse_by_need() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1500)", "");
		 Thread.sleep(5000);
		 bn.clkByNeed();
		 log.info("Clicked on Browse By need");
		 
	}

	@When("select the freshness or scent option")
	public void select_the_freshness_or_scent_option() {
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 bn.clkScent();
		 log.info("Clicked on Freshness/scent");
	}

	@When("get the product name")
	public void get_the_product_name() throws InterruptedException, IOException {
		//bn.closes();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		 Thread.sleep(5000);
		 bn.clkFirstproduct();
		 log.info("Clicked on first product");
		 Thread.sleep(5000);
		 log.info("The First Product is :"+bn.gettextfirstp());
	//	 screenshots.getScreenshot(driver, "BYneed");
//		 driver.quit();
//		 log.info("Driver Closed");
	   
	}

	
	
}

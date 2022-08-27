package StepDefinations;

import java.awt.Window;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import PageObjects.ContactusPage;
import PageObjects.LoginPage;
import Utilities.Base;
import Utilities.screenshots;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class TC004 extends Base{
	LoginPage lp;
	ContactusPage cp;
	@Given("open {string}")
	public void open(String url) throws IOException, InterruptedException {
		 driver=Initializer();
		  log.info("Driver Initialized");
		  driver.get(url);
		  log.info("Navigated to "+url);
		  lp=new LoginPage(driver);
		  Thread.sleep(5000);
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  lp.dismiss();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 
		  cp=new ContactusPage(driver);
	}

	@Given("Click on Contact us")
	public void click_on_contact_us() {
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    cp.clkContactUs();
	    log.info("Clicked on contact us");
	}

	@When("click on call")
	public void click_on_call() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 Thread.sleep(5000);
	  
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)", "");
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 cp.closes();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.switchTo().frame(0);
		 Thread.sleep(5000);
		 cp.clkCall();
		    log.info("Clicked on Call");
	}

	@When("get number for contact")
	public void get_number_for_contact() throws InterruptedException, IOException {
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 Thread.sleep(5000);
		    log.info("The Number is :"+cp.getNumber());
		//    screenshots.getScreenshot(driver, "ContactUs");
//		    driver.quit();
//		    log.info("Driver Closed");
	}
	
}

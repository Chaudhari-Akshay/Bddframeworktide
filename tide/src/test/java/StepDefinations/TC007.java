package StepDefinations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import PageObjects.LoginPage;
import PageObjects.washclothsPAge;
import Utilities.Base;
import Utilities.screenshots;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TC007 extends Base {
LoginPage lp;
	washclothsPAge wc;
	

@Given("Go to Website {string}")
public void go_to_website(String url) throws IOException, InterruptedException {
	 driver=Initializer();
	  log.info("Driver Initialized");
	  driver.get(url);
	  log.info("Navigated to "+url);
	  lp=new LoginPage(driver);
	  Thread.sleep(5000);
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  lp.dismiss();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
wc=new washclothsPAge(driver);	  
}

@Given("click on how to wash cloths")
public void click_on_how_to_wash_cloths() {
   wc.clkHowtoWashCloths();
   log.info("clicked on How to Wash Cloths");
   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
}

@When("lern more under how to do laundry")
public void lern_more_under_how_to_do_laundry() throws InterruptedException {
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,300)", "");
	Thread.sleep(5000);
	wc.clklaundry();
	log.info("Clicked on Learn more under Hoe to do Laundry");
    
}

@When("get deatils about how to do laundry")
public void get_deatils_about_how_to_do_laundry() throws InterruptedException, IOException {
    Thread.sleep(5000);
    wc.gettext();
    log.info("The deatails about : "+wc.gettext());
   // screenshots.getScreenshot(driver, "WashCloths");
//    driver.quit();
//    log.info("Driver closed");
}

	
}

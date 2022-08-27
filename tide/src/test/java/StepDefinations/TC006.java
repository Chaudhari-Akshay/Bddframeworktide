package StepDefinations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import PageObjects.LoginPage;
import PageObjects.RewardsPage;
import Utilities.Base;
import Utilities.screenshots;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class TC006 extends Base {
LoginPage lp;
RewardsPage rp;
@Given("Navigate to Url- {string}")
public void navigate_to_url(String url) throws IOException, InterruptedException {
	 driver=Initializer();
	  log.info("Driver Initialized");
	  driver.get(url);
	  log.info("Navigated to "+url);
	  lp=new LoginPage(driver);
	  Thread.sleep(5000);
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  lp.dismiss();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  rp=new RewardsPage(driver);
}

@Given("click on Coupons and reward")
public void click_on_coupons_and_reward() {
 rp.clkCouponsandRewads();
 log.info("Clicked on Coupons and Rewards");
}

@When("get the Details about the coupons and reward")
public void get_the_details_about_the_coupons_and_reward() throws InterruptedException {
   Thread.sleep(5000);
   rp.getrewardtext();
   log.info("Get deatils about the Coupons and Rewards");
}

@When("click on save now")
public void click_on_save_now() throws IOException {
    rp.clksavenow();
    log.info("click on save now button");
  //  screenshots.getScreenshot(driver, "Rewards");
//    driver.quit();
//    log.info("Driver closed");
}



	
	
	
}

package StepDefinations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import PageObjects.LoginPage;
import PageObjects.PandGPage;
import Utilities.Base;
import Utilities.screenshots;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class TC010 extends Base {
LoginPage lp;
PandGPage pg;

	@Given("open the link {string}")
	public void open_the_link(String url) throws IOException, InterruptedException {
		driver=Initializer();
		  log.info("Driver Initialized");
		  driver.get(url);
		  log.info("Navigated to "+url);
		  lp=new LoginPage(driver);
		  Thread.sleep(5000);
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  lp.dismiss();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	@Given("Click on the P&G Everyday Icon")
	public void click_on_the_p_g_everyday_icon() {
	    pg=new PandGPage(driver);
	    pg.clkPandGIcon();
	    log.info("Click on P&G Icon");
	}

	@When("Verify the page title is contain {string}")
	public void verify_the_page_title_is_contain(String string) throws InterruptedException, IOException {
	    Thread.sleep(5000);
		if(driver.getTitle().contains(string)) {
			Assert.assertTrue(true);
			log.info("Icon verified");
		}else {
			Assert.assertTrue(false);
			log.info("Icon Not verified");
		}
		//screenshots.getScreenshot(driver, "Icon");
//		driver.quit();
//		log.info("Driver Closed");
	}
	
}

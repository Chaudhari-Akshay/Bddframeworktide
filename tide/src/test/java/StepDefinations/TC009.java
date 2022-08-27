package StepDefinations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import PageObjects.LoginPage;
import PageObjects.YoutubePAge;
import Utilities.Base;
import Utilities.screenshots;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class TC009 extends Base {
LoginPage lp;
YoutubePAge yt;
	@Given("navigate to: {string}")
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
	}

	@Given("Go to footer")
	public void go_to_footer() throws InterruptedException {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1400)", "");
		 yt=new YoutubePAge(driver);
		 log.info("Navigated to footer");

	}

	@When("click youtube icon under fun ways to connect with US")
	public void click_youtube_icon_under_fun_ways_to_connect_with_us() throws InterruptedException {
	    Thread.sleep(5000);
	    yt.clkYputubeicon();
	    log.info("Clicked on Youtube icon");
	}

	@When("Get the youtube channel name of tide")
	public void get_the_youtube_channel_name_of_tide() throws InterruptedException, IOException {
		Thread.sleep(5000);
		yt.getChannelname();
		log.info("The Youtube channel name of Tide is : "+yt.getChannelname());
		//screenshots.getScreenshot(driver, "Youtube");
//driver.quit();
//log.info("Driver closed");
	}
	
	
	

}

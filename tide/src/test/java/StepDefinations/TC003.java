package StepDefinations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import PageObjects.LoginPage;
import PageObjects.StainPage;
import Utilities.Base;
import Utilities.screenshots;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class TC003 extends Base{
	LoginPage lp;
	StainPage st;
	@Given("navigate to {string}")
	public void navigate_to(String url) throws InterruptedException, IOException {
		 driver=Initializer();
		  log.info("Driver Initialized");
		  driver.get(url);
		  log.info("Navigated to "+url);
		  lp=new LoginPage(driver);
		  Thread.sleep(5000);
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  lp.dismiss();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  st=new StainPage(driver);
		  
	}

	@When("hover on Shop products and click on stain remover")
	public void hover_on_shop_products_and_click_on_stain_remover() {
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    st.clkshopproducts();
	    log.info("Hover on Shop Products");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}

	@When("click on deep clean and click on article")
	public void click_on_deep_clean_and_click_on_article() {
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		st.clkstainremover();
		log.info("Hover on Shop Products");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		st.clkdeepclean();
		log.info("Clicked on Deep clean");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    st.clkarticle();
	    log.info("Clicked on article");
	  
	}

	@Then("get Text of article")
	public void get_text_of_article() throws IOException {
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   st.getArticletext();
	   log.info("Article is : "+st.getArticletext());
	 //  screenshots.getScreenshot(driver, "StainRemover");
//	   driver.quit();
//	   log.info("Driver closed");
	}

	

}

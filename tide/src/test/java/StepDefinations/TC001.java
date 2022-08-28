package StepDefinations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
import Utilities.Base;
import Utilities.screenshots;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001 extends Base {
	
	LoginPage lp;
	@Given("Open the URL: {string}")
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
	  
	}

	@When("Click Register")
	public void click_register() {
	   lp.clkregister();
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   log.info("Clicked on Register");
	}

	@When("Click on Sign up Now")
	public void click_on_sign_up_now() {
	  lp.clkSignupNow();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   log.info("Clicked sign up Now");
	}

	@Then("Click on Log in")
	public void click_on_log_in() {
		Set<String>window=driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		lp.Loginbtn();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		   log.info("Clicked on Log in");
	}

	@Then("Enter {string} in email")
	public void enter_in_email(String string) throws IOException {
		
		FileInputStream file = new FileInputStream(".\\src\\main\\resources\\testdata\\logindata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		String email=sheet.getRow(1).getCell(0).toString();
		lp.enterEmail().sendKeys(email,Keys.ENTER);;
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		   log.info("Email Entered is "+email);
	}

	@Then("Enter {string} in password section")
	public void enter_in_password_section(String string) throws IOException {
		FileInputStream file = new FileInputStream(".\\src\\main\\resources\\testdata\\logindata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		String pass=sheet.getRow(1).getCell(1).toString();
		lp.enterPassword().sendKeys(pass);;
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		   log.info("Password Entered is "+pass);
	}

	@Then("click on login button")
	public void click_on_login_button() throws IOException {
	   lp.Loginbtn2();
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   log.info("Click on Login");

	  
	}
	@AfterStep
	public static void tearDown(Scenario scenario) {
	     
	            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	         
}
@After
public void After() {
	 driver.quit();
	   log.info("Driver Closed");
}
}

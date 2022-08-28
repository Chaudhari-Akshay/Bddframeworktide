package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Base {
	public static   WebDriver driver;
	public static Logger log=LogManager.getLogger();
	public Properties prop ;
	
	public WebDriver Initializer() throws IOException {
		prop=new Properties();
		
		FileInputStream file=new FileInputStream(".\\src\\main\\java\\Utilities\\data.properties");
		prop.load(file);
		
		String browsername=prop.getProperty("browser");
		
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}else if(browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", ".\\Drivers\\edgedriver.exe");
			driver=new EdgeDriver();
			
		}else {
			System.out.println("Set driver properly");
		}
		return driver;
		
		
		
	}	
	

	
}

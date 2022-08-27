package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshots {

	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		
		String datename=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot  ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File finalDestination = new File("."+ "/TestsScreenshots/"+screenshotName+datename+".png");
		FileUtils.copyFile(source, finalDestination);
		String destination = System.getProperty("user.dir") + "/TestsScreenshots/"+screenshotName+datename+".png";
		return destination;
		
	}
}

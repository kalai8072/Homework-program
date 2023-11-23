package org.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PracticeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		  {
			// TODO Auto-generated method stub
			 //System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			ChromeDriver driver = new ChromeDriver(options);

	       

	        // Navigate to the webpage you want to capture
	        driver.get("https://tutorialshut.com/");

	       
	            // Cast WebDriver to TakesScreenshot
	         
	        TakesScreenshot screenshotDriver = (TakesScreenshot) driver;

	            
	        //Step 2 (print screen) JVM
	            File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);
	          //Step 3 - Path setup 
	            
	            String screenshotPath = "D:\\screenshot25.png";

	            // Move the file to the desired location
	            //Step 4 - Move to my path
	            FileUtils.moveFile(screenshotFile, new File(screenshotPath));

	            System.out.println("Screenshot saved to: " + screenshotPath);
	        } 

		

	}

	}



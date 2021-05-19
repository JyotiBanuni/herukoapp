package day3;

import java.awt.AWTException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;



public class File_Upload_download {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\chromedriver_win32\\chromedriver.exe");
		String downloadFilePath = "C:\\Users\\dell\\Documents\\Jyoti";
		Map<String,Object> prefs = new HashMap<String,Object>();
		prefs.put("download.default_directory", downloadFilePath);
		ChromeOptions options = new  ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/upload']")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\dell\\Documents\\Salary.txt");
		driver.findElement(By.id("file-submit")).click();
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/download']")).click();
		driver.findElement(By.linkText("some-file.txt")).click();
		
		
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		
		
		
	
	}
	
	
	
	
		
		
	}



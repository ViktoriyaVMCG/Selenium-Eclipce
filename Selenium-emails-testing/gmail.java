package Test1;

import java.util.Collections;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo {
	public static void main(String[] args) throws InterruptedException{
		//setting driver properties
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        	options.addArguments("start-maximized");
        	options.setExperimentalOption("useAutomationExtension", false);
        	options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        	WebDriver driver =  new ChromeDriver(options); 
        	driver.get("https://accounts.google.com/signin");
        	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys("abc@gmail.com");
        	driver.findElement(By.id("identifierNext")).click();
        	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("password");
        	driver.findElement(By.id("passwordNext")).click();
	}
}

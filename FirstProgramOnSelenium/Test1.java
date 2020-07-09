package Test1;

// A TimeUnit represents time durations at a given unit
import java.util.concurrent.TimeUnit;

// Mechanism used to locate elements within a document.
import org.openqa.selenium.By;
//The main interface to use for testing, which represents an idealised web browser.
import org.openqa.selenium.WebDriver;
//Imports chromedriver
import org.openqa.selenium.chrome.ChromeDriver;

public class try1 {
	public static void main (String[] args) throws InterruptedException{
		// Optional. If not specified, WebDriver searches the PATH for chromedriver.
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximize window to make sure that everyting is visible
		driver.manage().deleteAllCookies();  //Delete all cookies
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/"); //calls yahoo
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("edureka@yahoo.com"); //plases email in the field
		Thread.sleep(10000); // Let the user actually see something!
		driver.findElement(By.xpath("//input[@id='login-signin']")).click(); //Clicks after placing email
		
		
		
		
	}
}

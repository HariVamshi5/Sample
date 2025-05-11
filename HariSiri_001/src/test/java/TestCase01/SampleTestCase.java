package TestCase01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestCase {
	
	WebDriver driver;
  @Test
  public void LoginFunctionality() throws InterruptedException {
	  
	  driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  driver.findElement(By.linkText(" "));
	  driver.findElement(By.partialLinkText(" "));
	  driver.findElement(By.cssSelector(""));
	  driver.findElement(By.xpath(" "));
	   
	  
	  
	  String RequireTitle= driver.getTitle();
	 
	  String CurrentURL= driver.getCurrentUrl();
	  
	  System.out.println(RequireTitle);
	  System.out.println(CurrentURL);
	  
	  
	  
	  

	  
	  
  }
  
  
  
}

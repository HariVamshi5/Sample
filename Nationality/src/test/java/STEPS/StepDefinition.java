package STEPS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition {
	WebDriver driver;
	
	@Given("user Launches Chrome Browser")
	public void user_launches_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
	}
	@Then("navigate to url {string}")
	public void navigate_to_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	    
	}
	@Then("Enter Username and password as")
	public void enter_username_and_password_as(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		String uname= dataTable.cell(0, 0);
		String pwd = dataTable.cell(0, 1);
		
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	      Thread.sleep(2000);
	    
	}
			
	
	@Then("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}
	@Then("Click on Admin")
	public void click_on_admin() {
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Admin']")).click();
	    
	}
	@Then("Click on Nationalities")
	public void click_on_nationalities() {
		
		driver.findElement(By.xpath("//a[text()='Nationalities']")).click();
	   
	}
	@Then("Click on Add Enter Nationality name")
	public void click_on_add_enter_nationality_name(io.cucumber.datatable.DataTable dataTable) {
		
		List<List<String>> Nationality = dataTable.cells();
		
		
		for(int i=0; i<Nationality.size(); i++) {
			String Natname = Nationality.get(i).get(0);
			
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(Natname);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		}
		
	   
	}
	    
	
	

}

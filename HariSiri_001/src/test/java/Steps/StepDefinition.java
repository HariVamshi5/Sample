package Steps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@When("User opens URL {string}")
	public void user_opens_url(String GivenURL) throws InterruptedException {
		
		driver.get(GivenURL);
		Thread.sleep(2000);	
		
	}

	@When("User Enters Usename as {string} and Password as {string}")
	public void user_enters_usename_as_and_password_as(String UName, String PWD) throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys(UName);
		driver.findElement(By.name("password")).sendKeys(PWD);
		Thread.sleep(2000);		
	}

	@Then("Click On LoginButton")
	public void click_on_login_button() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("Navigate to Skills Page")
	public void navigate_to_skills_page() {
		
		driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Qualifications']")).click();
		driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[1]")).click();
		
	}
	
	

	@When("Add Skill Record as {string} and {string}")
	public void add_skill_record_as_and(String SNAME, String SDESCR) {
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SNAME);
		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(SDESCR);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}

	@When("Click on Logout Button")
	public void click_on_logout_button() {
		
		System.out.println("LOgged Out");
		
	}

	@Then("Close the Browser")
	public void close_the_browser() {
		System.out.println("Browser Closed");
		
	}
	
	@When("User Enters Login Credentials")
	public void user_enters_login_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		String UserName= dataTable.cell(0, 0);
		String Password= dataTable.cell(0, 1);
		
		driver.findElement(By.name("username")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		Thread.sleep(2000);
	}
	
	@When("Add Skill Record Using Data Table Without Headers")
	public void add_skill_record_using_data_table_without_headers(io.cucumber.datatable.DataTable dataTable) {
		
		List<List<String>> SkillTable = dataTable.cells();
		//List<List<String>> SkillTable = dataTable.cell(0, 1);
		//List<List<String>> SkillTable = dataTable.cell(1, 0);
		
		for(int i=0;i<SkillTable.size();i++)
		{
			
			
			String SkillName= SkillTable.get(i).get(0); //   (get(i).get(0)=------> cell(0,0)   cell(1,0) 
			String SkillDescr= SkillTable.get(i).get(1); // cell(0, 1) cell(1,1)
			
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SkillName);
			driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(SkillDescr);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
		}
		
				
				
		
		
		
	}

}

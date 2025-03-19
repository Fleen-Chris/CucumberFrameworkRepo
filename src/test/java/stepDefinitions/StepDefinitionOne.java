package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionOne {
	
	WebDriver driver;
	
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page()
	{	
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/");
	}
	
	@When("the user enters the username as {string}")
	public void the_user_enters_the_username_as_demosalesmanager(String uname) 
	{
		 driver.findElement(By.id("username")).sendKeys(uname);
	}
	    
	@When("the user enters the password as {string}")
	public void the_user_enters_the_password_as_crmsfa(String pwrd)
	{
		driver.findElement(By.id("password")).sendKeys(pwrd);
	}
	   
	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	   
	@Then("the user should be redirected to welcome page")
	public void the_user_should_be_redirected_to_welcome_page()
	{
		Assert.assertEquals(driver.getTitle(), "Leaftaps - TestLeaf Automation Platform");
	}
	    
	@Then("the user should view the welcome message")
	public void the_user_should_view_the_welcome_message() 
	{
		String msg = driver.findElement(By.xpath("//h2[contains(text(), 'Welcome')]")).getText();
		Assert.assertTrue(msg.contains("Welcome"), "Welcome message not displayed!");
	}
	        
	@When("the user should not be redirected to welcome page")
	public void the_user_should_not_be_redirected_to_welcome_page()
	{	
		Assert.assertEquals(driver.getTitle(), "Leaftaps - TestLeaf Automation Platform", "Title does not match!");
    }
}
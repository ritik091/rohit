package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;
import org.junit.Assert;

public class web {
	
	
	static WebDriver driver;
	
	
	
	@Given("User launches the DemoWebshop App")
	public void user_launches_the_DemoWebshop_App() {
		
			//Setting the System Property
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Desktop\\New Folder (2)\\chromedriver.exe");
			 driver = new ChromeDriver();
			
			//Navigate to the URL
			driver.get("http://demowebshop.tricentis.com/");
		
		
		
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
			
	}
	@Then("User clicks on SignIn button")
	public void user_clicks_on_SignIn_button() {
	
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		
		
		
		
	
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("User Provides the valid data for all the fields")
	public void user_Provides_the_valid_data_for_all_the_fields() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='gender-male']")).click();
		driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("ritik567");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("bhattrte");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("ritik345@gmail.com");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("ritik@123");
		driver.findElement(By.xpath("//*[@id='ConfirmPassword']")).sendKeys("ritik@123");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@When("User clicks in submit button at the end of the form")
	public void user_clicks_in_submit_button_at_the_end_of_the_form() {
		driver.findElement(By.xpath("//*[@id='register-button']")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("verifies the result of the registration")
	public void verifies_the_result_of_the_registration() {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText().equals("Your registration completed"));
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("Prints the message")
	public void prints_the_message() {
		System.out.println("welcome");
		
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Given("Applications launched by registered user")
	public void applications_launched_by_registered_user() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Desktop\\New Folder (2)\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		//Navigate to the URL
		driver.get("http://demowebshop.tricentis.com/");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("User access the Login Link")
	public void user_access_the_Login_Link() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("Provides the valid data as input")
	public void provides_the_valid_data_as_input() {
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("ritik@gmail.com");
		driver.findElement(By.xpath("//*//*[@id='Password']")).sendKeys("ritik@123");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("verifies the login status")
	public void verifies_the_login_status() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/customer/info']")).getText().contains("ritik@gmail.com"));
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}





}

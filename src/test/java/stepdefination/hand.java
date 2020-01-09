package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
 

public class hand {
	 WebDriver driver;

	@Given("User Launches App")
	public void user_Launches_App() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Desktop\\New Folder (2)\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		//Navigate to the URL
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@Given("User enters username {string}")
	public void user_enters_username(String string) {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("Lalitha");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("User enters password {string}")
	public void user_enters_password(String string) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password123");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Then("User clicks on AllCategories")
	public void user_clicks_on_AllCategories() {
		driver.findElement(By.xpath("//*[@id='menu3']/li[2]/a/span")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("User clicks on Electronics")
	public void user_clicks_on_Electronics() {
		driver.findElement(By.xpath("//*[@id='menu3']/li[2]/ul/li[1]/a/span")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("User clicks on Headphone")
	public void user_clicks_on_Headphone() {
		driver.findElement(By.xpath("//*[@id='submenuul11290']/li[1]/a")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("User clicks on Add to cart")
	public void user_clicks_on_Add_to_cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("User clicks on cart")
	public void user_clicks_on_cart() {
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("User clicks on Remove and close the App")
	public void user_clicks_on_Remove_and_close_the_App() {
		
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}






}

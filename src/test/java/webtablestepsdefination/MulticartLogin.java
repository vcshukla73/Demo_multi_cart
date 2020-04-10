package webtablestepsdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MulticartLogin {
	
	//public WebDriver driver;
	 WebDriver driver;

	
	
	@Given("^Intialize the brower with chrome$")
	
	public void intialize_the_brower_with_chrome() throws InterruptedException  {
		
		helper1 = new Testhelpe1r();
		helper.getdriver();
		
		
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinky\\Desktop\\Vaibhav docs\\chromedriver.exe");
       driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.iscripts.com/multicart/demo/");
        
        Thread.sleep(500);
 
			
	}

	@Given("^user should land on home page of maulticart login page$")
	public void user_should_land_on_home_page_of_maulticart_login_page()  {
		
		driver.findElement(By.xpath("//*[@id=\"dLabellogin\"]/span")).click();
			
		
	}

	@When("^user can enter valid user name and password$")
	public void user_can_enter_valid_user_name_and_password()  {
			
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pass");
		driver.findElement(By.xpath("//*[@id=\"jqLogin\"]")).click();
	   
	}

	@Then("^user can verify sucessfully enter to multicart login page$")
	public void user_can_verify_sucessfully_enter_to_multicart_login_page()  {
	  
		
		System.out.println("User sucessfully login");
		
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	  //WebDriverManager.chromedriver().setup();
//
//	   WebDriver driver = new ChromeDriver();
//			
//	
//	@Given("^Intialize the brower with chrome$")
//	public void intialize_the_brower_with_chrome() throws Throwable {
//
//		driver.get("https://demo.iscripts.com/multicart/demo/");
//
//	
//	}
//
//	@Given("^user should land on home page of maulticart login page$")
//	public void user_should_land_on_home_page_of_maulticart_login_page() throws Throwable {
//	  
//		driver.findElement(By.xpath("//*[@id=\"dLabellogin\"]/span")).click();
//
//	}
//
//	@When("^user can enter valid user name and password$")
//	public void user_can_enter_valid_user_name_and_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("user");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pass");
//		
//		
//	}
//
//	@Then("^user can verify sucessfully enter to multicart login page$")
//	public void user_can_verify_sucessfully_enter_to_multicart_login_page() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"jqLogin\"]")).click();
//
//		
//	}
//
//

}

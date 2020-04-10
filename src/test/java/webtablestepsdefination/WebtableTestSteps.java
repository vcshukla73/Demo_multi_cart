package webtablestepsdefination;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableTestSteps {

	// Global Scope
	WebDriver driver;

	@Given("^I land on webtable page$")
	public void i_land_on_webtable_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
	}

	@Given("^I start add operation$")
	public void i_start_add_operation() {
		driver.findElement(By.xpath("//button[@class='btn btn-link pull-right']")).click();
	}

	@When("^I complete the add user form$")
	public void i_complete_the_add_user_form() {

		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("MR");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Tom");
		driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("mrtom");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Abc123456");
		driver.findElement(By.xpath("//label[text()='Company AAA']")).click();
		Select roleSelection = new Select(driver.findElement(By.xpath("//select[@name='RoleId']")));
		roleSelection.selectByVisibleText("Admin");

		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("212-222-4444");

		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();

	}

	@Then("^I expect to see the user in webtable$")
	public void i_expect_to_see_the_user_in_webtable() {
		
		
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("sale");
		expectedList.add("sale");
		expectedList.add("sale");

		int matchCounter=0;
		
		// Actual List 
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@table-title]//tr"));	
		System.out.println(allRows.size());
		mainLoop:for(int i=0;i<allRows.size();i++) {
			System.out.println(allRows.get(i).getText());
			

			for(int j=0;j<expectedList.size();j++) {
				if(allRows.get(i).getText().contains(expectedList.get(j))) {					
					System.out.println("Matched....");
					matchCounter++;
					if(matchCounter==expectedList.size()) {
						System.out.println("All Expected Item Matched Test Passed.....");
						break mainLoop;
					}
				}
			}
		}
		
		
	}

}

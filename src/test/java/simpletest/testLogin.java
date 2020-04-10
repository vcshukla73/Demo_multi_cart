package simpletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testLogin {

	public static void main(String[] args) {
		
		
		//Given Driver Open Chrome Browser
		
		WebDriverManager.chromedriver().setup();
		

        WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		
		
		//And DriverI Goto NMKT.com Login Page 
		driver.get("https://demo.iscripts.com/multicart/demo/");
		
		
		
		//When Driver Enter a Valid User ID/Password (James William) 
		
		driver.findElement(By.xpath("//*[@id=\"dLabellogin\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pass");
		driver.findElement(By.xpath("//*[@id=\"jqLogin\"]")).click();


		
		
		
		//Then Driver should see profile name as "James WIllima"
		
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'James williams')]")));
		
		
		WebElement textbox=driver.findElement(By.xpath("//span[contains(text(),'James williams')]"));
		System.out.println("Text box " +textbox.getAttribute("value"));
		
		//*[@id="dLabel"]/div/span
		///html[1]/body[1]/div[1]/div[1]/nav[1]/div[3]/div[1]/div[3]/div[1]/button[1]/div[1]/span[1]
		

	}

}

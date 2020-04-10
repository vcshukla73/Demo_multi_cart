package webtablestepsdefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Step_Defination {

	@Given("^Open my chrome browser land multicart home page$")
	public void open_my_chrome_browser_land_multicart_home_page() {
		System.out.println("User Land on Mutlicart Home page");
	}

	
	@When("^I Enter Valid \"(.*?)\" and \"(.*?)\"$")
	public void i_Enter_Valid_and(String arg1, String arg2) throws Throwable {
	   System.out.println(arg1);
	   System.out.println(arg2);
		
	}

	@Then("^veriy user sucessfully login on \"(.*?)\"$")
	public void veriy_user_sucessfully_login_on(String arg1) throws Throwable {
	   System.out.println(arg1);
	}
	
	
	
	
	

}

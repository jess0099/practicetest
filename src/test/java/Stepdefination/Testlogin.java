package Stepdefination;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.testprojectpages;

public class Testlogin {
WebDriver driver;
testprojectpages tpp;
	
	@Given("Set up the browser")
	public void set_up_the_browser() {
	   String path="C:\\Users\\Admin_SRV\\eclipse-workspace\\testpractice1\\Drivers\\chromedriver.exe";
	   System.setProperty("webdriver.chrome.driver",path);
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	}

	@And("enter the URL")
	public void enter_the_url() {
	   driver.get("https://example.testproject.io/web/");
	}

	@When("^enter the (.*) and (.*)$")
	public void  enter_the_username_and_passwword(String username,String password) {
	    tpp=new testprojectpages(driver);
	    tpp.Username(username);
	    tpp.Password(password);
	    
	    
	}

	@And("click on login button")
	public void click_on_login_button() {
		  tpp=new testprojectpages(driver);
		  tpp.Loginbtn();
	   
	}

	@Then("navigate to  Home page")
	public void navigate_to_home_page() {
	   System.out.println("navigate to home page");
	}
}

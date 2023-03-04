package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testprojectpages {
	WebDriver driver;
	By uname=By.xpath("//input[@placeholder='Enter your full name']");
	By pwd=By.xpath("//input[@placeholder='Enter your password']");
	By lbtn=By.id("login");
		
 public testprojectpages(WebDriver driver) {
	 this.driver=driver;
	
 }
 
 public void Username(String username) {
	 driver.findElement(uname).sendKeys(username);
 }
public void Password(String password) {
	driver.findElement(pwd).sendKeys(password);
}
public void Loginbtn() {
	driver.findElement(lbtn).click();
}
}

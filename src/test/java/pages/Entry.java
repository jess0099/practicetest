package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Entry {
	WebDriver driver;

By addrs=By.xpath("//input[@placeholder='Enter your address']");
By eml=By.xpath("//input[@placeholder='Enter your email']");
By phn=By.id("phone");
By svbtn=By.id("save");

public Entry(WebDriver driver) {
	this.driver=driver;
	
}

public void Desh(String Country) {
	WebElement cnt=driver.findElement(By.id("country"));
	
	Select st=new Select(cnt);
	st.selectByVisibleText(Country);
	}
	public void Addrs(String add) {
		driver.findElement(addrs).sendKeys(add);
	}
	public void EML(String email) {
		driver.findElement(eml).sendKeys(email);
	}
	public void teleph(String phoneno) {
		driver.findElement(phn).sendKeys(phoneno);
	}
	public void SAVbtn() throws IOException {
		driver.findElement(svbtn).click();
String srpath="C://Users//Admin_SRV//eclipse-workspace//testpractice1//Screenshot//home.png";
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File(srpath));
	}

}

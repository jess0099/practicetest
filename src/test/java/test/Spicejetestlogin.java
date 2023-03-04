package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Spicejetpage;

public class Spicejetestlogin {
	WebDriver driver;
	Spicejetpage sp;
	
	@BeforeTest
	
	public void setup() {
		ChromeOptions oo=new ChromeOptions();
		
		oo.addArguments("--disable-notifications");
		String path="C:\\Users\\Admin_SRV\\eclipse-workspace\\testpractice1\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver(oo);
		driver.manage().window().maximize();
		
	}
	@Test
	
	public void test() throws InterruptedException {
		driver.get("https://www.spicejet.com/");
		sp=new Spicejetpage(driver);
		sp.roundtripbtn();
		sp.departure();
		sp.departurecity();
		sp.arrival();
		sp.depdate();
		sp.returndate();
		sp.Paxdetails();
		sp.currencytest();
		sp.typeofpax();
		sp.findflight();
	}

}

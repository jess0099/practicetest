package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AirIndiaPages;

public class AirIndiaTest {
	
	WebDriver driver;
	AirIndiaPages aip;
	
	@BeforeTest
	
	public void setup() {
		String dpath="C:\\Users\\Admin_SRV\\eclipse-workspace\\testpractice1\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",dpath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	
	public void test() throws InterruptedException {
		driver.get("https://www.airindia.in/");
		aip=new AirIndiaPages(driver);
		aip.Departure();
		aip.Arrival();
		aip.Deptdate();
		Thread.sleep(2000);
		aip.Arrivdate();
		aip.Paxadult();
		aip.children();
		aip.infanttype();
		aip.ConType();
		Thread.sleep(1000);
		aip.Classtype();
		aip.promtioncode();
		aip.findflight();
		
	}

}

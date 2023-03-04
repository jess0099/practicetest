package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Spicejetpage {
	
	WebDriver driver;
	
	By rtrip=By.xpath("//div[@class='css-1dbjc4n']//div[text()='round trip']");
	By dept=By.xpath("//div[text()='From']");
	By dcity=By.xpath("//div[text()='DEL']");
	By dscity=By.xpath("//div[text()='BOM']");
	By drdate=By.xpath("//div[text()='Departure Date']");
	By dpdate=By.xpath("//div[text()='Return Date']");
	By pax=By.xpath("//div[text()='Passengers']");
	By currency=By.xpath("//div[text()='Currency']");
	By paxtype=By.xpath("//div[text()='Senior Citizen']");
	By srchfligt=By.xpath("//div[text()='Search Flight']");
	
	
	public Spicejetpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void roundtripbtn() {
		driver.findElement(rtrip).click();
	}
	public void departure() throws InterruptedException {
	/*	Actions act=new Actions(driver);
	WebElement dd=	driver.findElement(dept);
	act.doubleClick(dd).perform();*/
	driver.findElement(dept).click();
	Thread.sleep(3000);
	}
	public void departurecity() throws InterruptedException {
		
		driver.findElement(dcity).click();
		Thread.sleep(2000);
	}
	public void arrival() {
		driver.findElement(dscity).click();
		
	}
	public void depdate() {
		Actions aa=new Actions(driver);
		WebElement we=driver.findElement(drdate);
		aa.doubleClick(we).perform();
		
		String Expdeptdate="15-March 2023";
		String eday=Expdeptdate.split("-")[0];
		String emonth=Expdeptdate.split("-")[1];
		
		System.out.println(eday+"+"+emonth);
		String currentdate=  driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz'])[17]//div[@class='css-1dbjc4n r-k8qxaj']//div")).getText();
		System.out.println(currentdate);
		
		/*while(!currentdate.equals(emonth)) {
			driver.findElement(By.xpath("(//div[@data-focusable='true'])[18]")).click();
			currentdate=  driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz'])[17]//div[@class='css-1dbjc4n r-k8qxaj']//div")).getText();
		}
		
	List<WebElement> ll= driver.findElements(By.xpath("(//div[@class='css-1dbjc4n'])[64]//div[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-1loqt21 r-eu3ka r-1otgn73 r-1aockid']"));
		
		for(int i=1;i<ll.size();i++) {
			String cday=ll.get(i).getText();
			
			if(cday.equals(eday)) {
				ll.get(i).click();
				
				break;
			}
		}*/
		
	}
	public void returndate() {
		driver.findElement(dpdate).click();
	}
	
	public void Paxdetails() {
		driver.findElement(pax).click();
		Actions aw=new Actions(driver);
		WebElement wq=driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]"));
	aw.doubleClick(wq).perform();
	/*for(int i=1;i<=3;i++) {
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[2]")).click();
	}*/
	
	}
	
	public void currencytest() throws InterruptedException {
		driver.findElement(currency).click();
		
	List<WebElement>  lw=	driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1mi0q7o r-1yt7n81 r-m611by r-1otgn73']"));
	for(int i=1;i<lw.size();i++) {
	String cc=	lw.get(i).getText();
	if(cc.equals("USD")) {
		lw.get(i).click();
		break;
		
	}
	}
	Thread.sleep(3000);
	}
	public void typeofpax() throws InterruptedException {
		driver.findElement(paxtype).click();
		Thread.sleep(2000);
	}
	public void findflight() {
		driver.findElement(srchfligt).click();
	}
	

}
	
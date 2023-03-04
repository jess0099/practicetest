package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AirIndiaPages {
	WebDriver driver;
	
	By depart=By.xpath("//input[@id='from']");
	By arrival=By.xpath("//input[@placeholder='To']");
	By ddate=By.xpath("(//img[@title='Date Picker'])[1]");
	By avdate=By.xpath("(//img[@class='ui-datepicker-trigger'])[2]");
	By adult=By.name("ddladult1");
	By Child=By.id("ddlchildren1");
	By infnt=By.id("ddlinfants1");
	By constype=By.name("concessionaryType1");
	By Economy=By.xpath("//select[@id='_classType1']");
	By promcode=By.id("pcode1");
	By Searchflight=By.id("btnbooking");
	
	public AirIndiaPages(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Departure() throws InterruptedException {
	WebElement ww=	driver.findElement(depart);
	ww.sendKeys("Del");
	Thread.sleep(1000);
	ww.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	ww.sendKeys(Keys.ENTER);
	
		
	}
	public void Arrival() throws InterruptedException {
	WebElement wt=	driver.findElement(arrival);
	wt.sendKeys("Mum");
	Thread.sleep(1000);
	wt.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	wt.sendKeys(Keys.ENTER);
	
	}
	
	
	public void Deptdate() {
		driver.findElement(ddate).click();
		
		String expdate="24-November-2023";
		String eday=expdate.split("-")[0];
		String emonth=expdate.split("-")[1];
		String eyer=expdate.split("-")[2];
		
		System.out.println(eday+"#"+emonth+"#"+eyer);
		
		    String cmonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month']")).getText();
	String cyer=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-year']")).getText();
	System.out.println(cmonth+"="+cyer);
	while(!cmonth.equals(emonth)||(!cyer.equals(eyer))) {
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		cmonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month']")).getText();
		 cyer=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-year']")).getText();
		
	}
	
	List<WebElement> dl=  driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table//tbody//tr//td"));
	
	for(int i=1;i<dl.size();i++) {
		
	String cday=dl.get(i).getText();
	
	if(cday.equals(eday)) {
		dl.get(i).click();
		break;
	}
	}
	}
	
	public void Arrivdate() {
		driver.findElement(avdate).click();
		
		String exarvdate="15-January-2024";
		String eaday=exarvdate.split("-")[0];
		String eamonth=exarvdate.split("-")[1];
		String eayer=exarvdate.split("-")[2];
		
		System.out.println(eaday+"+"+eamonth+"+"+eayer);
		
		String camonth= driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//span[@class='ui-datepicker-month']")).getText();
	String cayer=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//span[@class='ui-datepicker-year']")).getText();
	
	System.out.println(camonth+"=="+cayer);
	
	while(!camonth.equals(eamonth)||(!eayer.equals(cayer))) {
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//span[text()='Next']")).click();
		camonth= driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//span[@class='ui-datepicker-month']")).getText();
		 cayer=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//span[@class='ui-datepicker-year']")).getText();
		}
	
	List<WebElement> ll=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//table//tbody//td"));
	for(int i=1;i<ll.size();i++) {
		String caday= ll.get(i).getText();
		if(caday.equals(eaday)) {
			ll.get(i).click();
			break;
		}
	}
	}
	
	public void Paxadult() {
		//driver.findElement(adult).click();
		Select sa=new Select(driver.findElement(adult));
		sa.selectByValue("3");
		
		}
	public void children() {
		Select sc=new Select(driver.findElement(Child));
		sc.selectByVisibleText("2");
	}
	public void infanttype() {
		Select si=new Select(driver.findElement(infnt));
		si.selectByIndex(1);
	}
	
	public void ConType() {
		Select st=new Select(driver.findElement(constype));
		st.selectByIndex(3);
	}
	
	public void Classtype() {
		driver.findElement(Economy).click();
		Select sb=new Select(driver.findElement(Economy));
		sb.selectByIndex(1);
	}
	
	public void promtioncode() {
		driver.findElement(promcode).sendKeys("PC0123GTUI568u0");
	}
	
	public void findflight() {
		driver.findElement(Searchflight).click();
	}
	
	

}

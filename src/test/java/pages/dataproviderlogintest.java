package pages;

import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Exeldatap.exldata;
import afu.org.checkerframework.checker.formatter.FormatUtil.ExcessiveOrMissingFormatArgumentException;

public class dataproviderlogintest {
	exldata exd;
	testprojectpages tsp;
	WebDriver driver;
	Entry ee;
	@BeforeTest
	
	public void setup() {
		String dpath="C:\\Users\\Admin_SRV\\eclipse-workspace\\testpractice1\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",dpath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@DataProvider(name="testdata")
	
	public Object[][] dataprov() throws IOException{
		String path="C:\\Users\\Admin_SRV\\eclipse-workspace\\testpractice1\\Datafiles\\loginDataprovider.xlsx";
		String sheetname="Sheet1";
	Object val[][]=	getcelldatastring(path, sheetname);
	
	return val;
	}
	
	
	@Test(dataProvider="testdata")
	
	public void finaldata(String username,String password,String Country,String add,String email,String phoneno) throws InterruptedException, IOException {
	//	System.out.println(username+" | "+password);
		driver.get("https://example.testproject.io/web/");
		tsp=new testprojectpages(driver);
		tsp.Username(username);
		tsp.Password(password);
		tsp.Loginbtn();
		ee=new Entry(driver);
		ee.Desh(Country);
		ee.Addrs(add);
		ee.EML(email);
		ee.teleph(phoneno);
		ee.SAVbtn();
		
		
		
		Thread.sleep(5000);
		
		
		driver.navigate().refresh();
	}
	
	
	
	
	
	
	
public  Object [][] getcelldatastring(String path,String sheetname) throws IOException {
		exd= new exldata(path,sheetname);
		
	int Rownum=	exd.getrownm();
	int Colnum=exd.getcolnm();
	
	               Object data[][]=new Object[Rownum-1][Colnum];
	            try {   
	               for(int i=1;i<Rownum;i++) {
	            	   for(int j=0;j<Colnum;j++) {
	            		   
	            		       data[i-1][j]=  exd.getcellstdata(i,j);
	            	   }
	               }}catch(Exception e) {
	            	 e.getCause();  
	               }
	               
	               return data;
	
		
	}

}

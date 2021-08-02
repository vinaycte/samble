package firstproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Firsthxh {
public	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
@Test
//
public void test() {
	driver.get("http://lightspeed.ur.c.eu-de-2.cloud.sap:2080/?suite=ls&rel=rel&Is508=true&layout=full&sample=/samples/controls/saptable/bigTable.lsx");
	driver.switchTo().frame("LSSampleTree");
	
     driver.findElement(By.xpath("//*[@id='ls.id.28']")).click();
    //driver.switchTo().frame("LSSampleParameter");
     String title =driver.findElement(By.xpath("//*[@id=\"scrollpanel\"]/table/tbody/tr[2]/td[1]/label/a")).getText();
	System.out.println(title);
	System.out.println("Welcome");
}
@AfterMethod
public void teardwn() {
//	driver.quit();
	
	
}
}

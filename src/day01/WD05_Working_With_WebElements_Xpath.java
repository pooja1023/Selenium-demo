package day01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WD05_Working_With_WebElements_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sDriverPath="D:\\Verizon\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",sDriverPath);
WebDriver oWd=new FirefoxDriver();
oWd.manage().deleteAllCookies();
oWd.manage().window().maximize();
oWd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
oWd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
oWd.get("https://www.bing.com");
oWd.findElement(By.id("crs_itemLink_0")).click();
//oWd.findElement(By.xpath("html/body/table/tbody/tr[1]/td/div/div[9]/div[2]/"))---absolute xpath
//------relative xpath //img[@alt='Courier snake Odisha'][@data-bm='27'] with tags and attributes
//---specifying * in relative path indicates any tag eg: //*[@alt='snake']
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
oWd.close();	}

}

package bingdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WD05_Working_With_WebElements_LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sDriverPath = "D:\\Verizon\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", sDriverPath);
		WebDriver oWd = new ChromeDriver();
oWd.manage().deleteAllCookies();
oWd.manage().window().maximize();
oWd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
oWd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
oWd.get("https://www.bing.com");
//oWd.findElement(By.linkText("Images")).click();
oWd.findElement(By.xpath("html/body/table/tbody/tr[1]/td/div/div[5]/div[1]/ul[1]/li[2]")).click();
oWd.findElement(By.id("sb_form_q")).clear();
oWd.findElement(By.id("sb_form_q")).sendKeys("rose");
oWd.findElement(By.id("sb_form_go")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
oWd.close();	}

}

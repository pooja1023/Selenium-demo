package day01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WD05_Working_With_WebElements_Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sDriverPath="D:\\Verizon\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",sDriverPath);
WebDriver oWd=new FirefoxDriver();
oWd.manage().deleteAllCookies();
oWd.manage().window().maximize();
oWd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
oWd.get("https://www.amazon.in/");
oWd.findElement(By.id("twotabsearchtextbox")).clear();
oWd.findElement(By.id("twotabsearchtextbox")).sendKeys("honor 9n");
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
oWd.close();	}

}

package day01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD03_Invoke_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. initialisation
		String sDriverPath = "D:\\Verizon\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", sDriverPath);
		WebDriver oWd = new ChromeDriver();
		oWd.manage().deleteAllCookies();
		oWd.manage().window().maximize();
		oWd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		oWd.get("https://www.amazon.in");
		oWd.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
		oWd.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
		oWd.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("honor 9n");
 oWd.findElement(By.cssSelector("input[type=' + value + ']")).click();
	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3. closing
		oWd.close();
	}

}

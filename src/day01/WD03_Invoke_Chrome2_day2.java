package day01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD03_Invoke_Chrome2_day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. initialisation
		String sDriverPath = "D:\\Verizon\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", sDriverPath);
		WebDriver oWd = new ChromeDriver();
		oWd.manage().deleteAllCookies();
		oWd.manage().window().maximize();
		oWd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		oWd.get("https://www.bing.com");
		oWd.findElement(By.xpath("//a[@id='scpl1']")).click();
		oWd.findElement(By.cssSelector("html > body > #b_header > #sb_form > div > #sb_form_q")).clear();
 oWd.findElement(By.cssSelector("html > body > #b_header > #sb_form > div > #sb_form_q"
)).click();
 oWd.findElement(By.cssSelector("#sb_form_q")).click();
		//oWd.findElement(By.name("field-keywords")).sendKeys("honor 9n");
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

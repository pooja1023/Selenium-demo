package day01;

import java.net.Socket;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WD03_DropDownamazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. initialisation
		String sDriverPath = "D:\\Verizon\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", sDriverPath);
		WebDriver oWd = new ChromeDriver();
		oWd.manage().deleteAllCookies();
		oWd.manage().window().maximize();
		oWd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		oWd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		oWd.get("https://www.google.com/intl/te/gmail/about/");
		Select oLng=new Select(oWd.findElement(By.id("lang-selector")));
		
			System.out.println("Count"+oLng.getOptions().size());
			System.out.println("Default:"+oLng.getAllSelectedOptions().get(0).getText());
			System.out.println(oLng.getOptions().get(2).getText();
			System.out.println("is Multy:"+oLng.isMultiple());
		//oLng.selectByIndex(50);
		//oLng.selectByValue("/intl/hi/gmail/about/");
			oLng.selectByVisibleText("Suomi");
			}
}

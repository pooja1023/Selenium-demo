package day01;

import java.net.Socket;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WD03_DropDown {

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
		oWd.get("https://www.amazon.in/");
		Select oLng=new Select(oWd.findElement(By.id("searchDropdownBox")));
		
			System.out.println("Count"+oLng.getOptions().size());
			System.out.println("Default:"+oLng.getAllSelectedOptions().get(0).getText());
			for(int i=0;i<oLng.getOptions().size();i++)
			System.out.println(oLng.getOptions().get(i).getText());
			System.out.println("is Multy:"+oLng.isMultiple());
		//oLng.selectByIndex(2);
		//oLng.selectByValue("/intl/hi/gmail/about/");
			
			}
}

package day01;

import java.net.Socket;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD03_GetPageDetails {

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
		oWd.get("https://www.amazon.in");
		if(oWd.getTitle().contains("Amazon")==true){
			
		System.out.println("Title:"+oWd.getTitle());
		System.out.println("Url:"+oWd.getCurrentUrl());
		//System.out.println("page source:"+oWd.getPageSource());
		System.out.println("browser id:"+oWd.getWindowHandle());	
		
		
			oWd.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
		oWd.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
		oWd.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("honor 9n");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Title:"+oWd.getTitle());
		System.out.println("Url:"+oWd.getCurrentUrl());
		//System.out.println("page source:"+oWd.getPageSource());
		System.out.println("browser id:"+oWd.getWindowHandle());
		//oWd.findElement(By.cssSelector("#twotabsearchtextbox")).click();
// oWd.findElement(By.cssSelector("input[type=' + value + ']")).click();
		oWd.quit();
	
		//3. closing
	}
		else{
			System.out.println("navigated to invalid page");
		oWd.quit();	
		}
	}

}

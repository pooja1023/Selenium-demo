package day01;

import java.net.Socket;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD03_GetAmazonAttributeDetails2 {

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
		
		System.out.println("Linkname:"+oWd.findElement(By.xpath("//a[@id='nav-your-amazon']")).getText());
		System.out.println("Tagname  of amazon.in:"+oWd.findElement(By.xpath("//a[@id='nav-your-amazon']")).getAttribute("href"));
		System.out.println("Linkname:"+oWd.findElement(By.xpath("//div[@id='nav-xshop']/a[2]")).getText());
		System.out.println("Tagname  of deals:"+oWd.findElement(By.xpath("//div[@id='nav-xshop']/a[2]")).getAttribute("href"));
		System.out.println("CSSValue of amazon logo:"+oWd.findElement(By.xpath("//div[@id='nav-logo']/a[1]/span[1]")).getLocation().getX());
		System.out.println("CSSValue of amazon logo:"+oWd.findElement(By.xpath("//div[@id='nav-logo']/a[1]/span[1]")).getLocation().getY());
			oWd.findElement(By.xpath("//div[@id='nav-logo']/a[1]/span[1]")).click();
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

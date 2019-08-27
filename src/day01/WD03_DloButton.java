package day01;

import java.net.Socket;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD03_DloButton {

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
		oWd.get("http://www.echoecho.com/htmlforms10.htm");
		if(oWd.findElement(By.xpath("//td[@class='table5']/input[1]")).isSelected()==false)
		{
			oWd.findElement(By.xpath("//td[@class='table5']/input[1]")).click();
		}
		else
		{
			System.out.println("Radio button already selected");
		}
			}
}

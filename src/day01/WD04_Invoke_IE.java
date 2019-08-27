package day01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WD04_Invoke_IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sDriverPath = "D:\\Verizon\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", sDriverPath);
		WebDriver oWd = new InternetExplorerDriver();
		oWd.manage().deleteAllCookies();
		oWd.manage().window().maximize();
		oWd.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
oWd.get("https://www.amazon.in/");
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
oWd.close();	}

}

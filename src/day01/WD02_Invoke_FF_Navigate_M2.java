package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WD02_Invoke_FF_Navigate_M2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sDriverPath="D:\\Verizon\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",sDriverPath);
WebDriver oWd=new FirefoxDriver();
oWd.navigate().to("https://www.amazon.in/");
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
oWd.navigate().to("https://www.youtube.com/");
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
oWd.navigate().back();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

oWd.quit();	}

}

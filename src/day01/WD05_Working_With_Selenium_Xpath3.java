package day01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WD05_Working_With_Selenium_Xpath3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sDriverPath = "D:\\Verizon\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", sDriverPath);
		WebDriver oWd = new FirefoxDriver();
		oWd.manage().deleteAllCookies();
		oWd.manage().window().maximize();
		oWd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		oWd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		oWd.get("https://www.seleniumhq.org/download/");
		int iRow, iCell, iTotalRow, iTotalCell;
		iRow = 2;
		iCell = 4;
		String sHead="Table Header:\n\n";
		String sVal="Table content:\n\n";
		// System.out.println(oWd.findElement(By.xpath("//div[@id='mainContent']/table[1]")).getText());
		iTotalCell=oWd.findElements(By.xpath("//div[@id='mainContent']/table[1]/thead/tr/th")).size();
		for(iCell=1;iCell<=iTotalCell;iCell++)
		{
			
			sHead=sHead+oWd.findElement(By.xpath("//div[@id='mainContent']/table[1]/thead/tr/th[" + iCell + "]")).getText();
	sHead=sHead+"\t";
		}
		sHead=sHead+"\n";
							System.out.println(sHead);
		iTotalRow=oWd.findElements(By.xpath("//div[@id='mainContent']/table[1]/tbody/tr")).size();
		for(iRow=1;iRow<=iTotalRow;iRow++)
		{
			iTotalCell=oWd.findElements(By.xpath("//div[@id='mainContent']/table[1]/tbody/tr["+iRow+"]/td")).size();
			for(iCell=1;iCell<=iTotalCell;iCell++)
			{
				
		sVal=sVal+oWd.findElement(By.xpath("//div[@id='mainContent']/table[1]/tbody/tr[" + iRow + "]/td[" + iCell + "]")).getText();
								sVal=sVal+"\t";
			}
								sVal=sVal+"\n";
		}
								System.out.println(sVal);
			
			
		
		// System.out.println(oWd.findElement(By.xpath("//div[@id='mainContent']/table[1]/tbody/tr[1]")).getText());
		//System.out.println(oWd.findElement(By.xpath("//div[@id='mainContent']/table[1]/tbody/tr[3]/td[1]")).getText());
		
		// System.out.println(oWd.findElement(By.xpath("//div[@id='mainContent']/table[1]/tbody/tr[1]/td[1]")).getText());
		// oWd.findElement(By.xpath("html/body/table/tbody/tr[1]/td/div/div[9]/div[2]/"))---absolute
		// xpath
		// ------relative xpath //img[@alt='Courier snake
		// Odisha'][@data-bm='27'] with tags and attributes
		// ---specifying * in relative path indicates any tag eg:
		// //*[@alt='snake']

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oWd.close();
	}

}

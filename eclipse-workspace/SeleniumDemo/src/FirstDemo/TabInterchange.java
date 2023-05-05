package FirstDemo;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabInterchange {

	public static void main(String[] args) throws InterruptedException
	{
				// TODO Auto-generated method stub

		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\prsus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com");
			Thread.sleep(2000);
			driver.switchTo().newWindow(WindowType.TAB);//open a new tab
			//((JavascriptExecutor)driver).executeScript("window.open()");//used to open a new tab in chrome.
			ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.get("https://facebook.com");
			Thread.sleep(2000);
			driver.switchTo().window(tabs.get(0));
			driver.get("https://gmail.com");
			Thread.sleep(2000);
			driver.close();
			Thread.sleep(2000);
			driver.quit();
			
			
			
			

		

			}

		

	}



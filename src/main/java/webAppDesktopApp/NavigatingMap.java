package webAppDesktopApp;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigatingMap {

	
	
	
	 @Test
	    public void test() throws MalformedURLException, InterruptedException {
	        WebDriverManager.chromedriver().setup();
	        WebDriver webdriver = new ChromeDriver();
	        webdriver.get("https://hubqa.hungerrush.com/");
	        
	 }
}

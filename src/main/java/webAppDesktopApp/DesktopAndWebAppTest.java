package webAppDesktopApp;

import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DesktopAndWebAppTest {
	
	public static WindowsDriver windriver=null;
	
	 @Test
	    public void test() throws MalformedURLException, InterruptedException {
	        WebDriverManager.chromedriver().setup();
	        WebDriver webdriver = new ChromeDriver();
	        webdriver.get("https://hubqa.hungerrush.com/");
	        Thread.sleep(5000);
	       // webdriver.findElement(By.id("test")).click();
	        DesiredCapabilities cap= new DesiredCapabilities();
			cap.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
			cap.setCapability("platformName", "Windows");
			cap.setCapability("deviceName", "Windows10");
			
			try {
				windriver=new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			windriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			webdriver.quit();
			windriver.quit();
		}
	 }



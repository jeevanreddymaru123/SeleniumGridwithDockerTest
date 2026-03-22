package docker;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LoginTestChrome {
	
	@Test
	public void LogintoFintessbi() throws MalformedURLException, InterruptedException {
		
		
		ChromeOptions opt = new ChromeOptions();	
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://13.233.9.18:4444"),opt);
		driver.get("https://test.fitnessbi.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jeevan.reddymaru@abcfitness.com");
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Hello123!");
		driver.findElement(By.cssSelector("#mui-1")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}

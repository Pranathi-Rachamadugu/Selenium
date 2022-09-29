package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config.Driver;

public class CyclosImplicitWait extends Driver {

	WebDriver d;
	@Test
	public void cyclos() throws Exception {
		Thread.sleep(3000);
		d.get("https://demo.cyclos.org/ui/login");
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		d.findElement(By.xpath("//span[text()='Submit']")).click();
		
}
}
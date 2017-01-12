package angler.NewProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class NewTest 
{
	WebDriver driver;

	@BeforeTest
	public void beforeTest() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software_Backup\\Selenium\\Chrome_Latest\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void login() 
	{
		driver.get("http://52.24.74.34/staging/"); 
		System.out.println("Page loaded..");
		System.out.println("Page loaded..");
		System.out.println("Page loaded..");
		System.out.println("Page loaded..");
	}

	@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}
}

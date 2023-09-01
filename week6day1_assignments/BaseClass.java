package week6day1_assignments;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day1.ReadExcel;

public class BaseClass {
	
	public ChromeDriver driver;
	public String filename;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url, String username, String password) {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		String[][] readExcel = ReadExcel.readExcel(filename);
		return readExcel;
	}
	
	@BeforeSuite
	public void testData() {
		System.out.println("Before Class Testing Started");
	}
}

package week2.day2.assignments_week2_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']//a[contains(text(),'Create Contact')]")).click();
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@name='firstName']")).sendKeys("Bhuvan");
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@name='lastName']")).sendKeys("V");
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@name='firstNameLocal']")).sendKeys("It's Bhuvan Again");
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@name='lastNameLocal']")).sendKeys("//div[@class='fieldgroup-body']//input[@name='lastNameLocal']");
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@name='departmentName']")).sendKeys("Engineering");
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//textarea[@name='description']")).sendKeys("Description");
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@name='primaryEmail']")).sendKeys("bhuvanvasu@gmail.com");
		WebElement province = driver.findElement(By.xpath("//div[@class='fieldgroup-body']//select[@name='generalStateProvinceGeoId']"));
		Select state = new Select(province);
		Thread.sleep(2000);
		state.selectByVisibleText("New York");
		driver.findElement(By.xpath("//td[@colspan='4']//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//textarea[@name='importantNote']")).sendKeys("Typing important note");
		driver.findElement(By.xpath("//td[@colspan='4']//input[@value='Update']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
	}

}

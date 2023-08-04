package week2.day2.assignments_week2_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundSelect {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement favAutoTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select autoTool = new Select(favAutoTool);
		autoTool.selectByVisibleText("Selenium");
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='USA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='New York']")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[@data-label='Tamil']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='j_idt87:value']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='j_idt87:value_items']//li[2]")).click();

	}

}

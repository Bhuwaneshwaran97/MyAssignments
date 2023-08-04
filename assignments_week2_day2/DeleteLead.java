package week2.day2.assignments_week2_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='left-content-column']//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//a[@class='x-tab-right']//span[contains(text(),'Phone')]")).click();
//		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("34556656");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		WebElement firstrow = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr[1]//td[1]//div//a"));
		String firstRowString = firstrow.getText();
		firstrow.click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen246']//input")).sendKeys(firstRowString);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		WebElement getString = driver.findElement(By.xpath("//div[contains(text(),'No records')]"));
		String stringFound = getString.getText();
		System.out.println(stringFound);
		driver.close();
	}

}

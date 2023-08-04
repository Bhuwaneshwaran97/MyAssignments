package week2.day2.assignments_week2_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.xpath("//div[@id='left-content-column']//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']//input")).sendKeys("Bhuwaneshwaran");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr[1]//td[1]//div//a")).click();
		String expectedTitle = "View Lead | opentaps CRM";
		if (expectedTitle.contains(driver.getTitle())) {
			System.out.println("Title Matched");
		}else {
			System.out.println("Title Not Matched");
		}
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(3000);
		WebElement companyname = driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@name='companyName']"));
		companyname.clear();
		companyname.sendKeys("GL");
		String expectedCompanyName = "GL (10368)";
		driver.findElement(By.xpath("//td[@colspan='4']//input[@value='Update']")).click();
		Thread.sleep(2000);
		WebElement outputCompanyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		if (expectedCompanyName.contains(outputCompanyName.getText())) {
			System.out.println(outputCompanyName.getText() + "Company Name Matched");
		}else {
			System.out.println("Company Name Not Matched");
		}
		driver.close();
	}	
}

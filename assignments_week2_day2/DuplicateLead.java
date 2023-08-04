package week2.day2.assignments_week2_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DuplicateLead {

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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='left-content-column']//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//em[@class='x-tab-left']//span//span[contains(text(),'Email')]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("bhuvanvasu@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr[1]//td[1]//div//a")).click();
		WebElement extractedName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String getextracedName = extractedName.getText();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[text()='Duplicate Lead']")).click();
		String expectedTitle = "Duplicate Lead | opentaps CRM";
		String getexpectedTitle = driver.getTitle();
		Thread.sleep(5000);
		if (getexpectedTitle.contains(expectedTitle)) {
			System.out.println("Duplicate Lead Title Matched");
		}else {
			System.out.println("Not Matched");
		}
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		WebElement outputName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String get_outputName = outputName.getText();
		Thread.sleep(5000);
		if (get_outputName.contains(getextracedName)) {
			System.out.println("Name Matched");
		}else {
			System.out.println("Name Not Matched");
		}
		Thread.sleep(3000);
		driver.close();
	}

}

/*Assignment 1:Create Lead
		  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		  2. Enter UserName and Password Using Id Locator
		  3. Click on Login Button using Class Locator
		  4. Click on CRM/SFA Link
		  5. Click on Leads Button
		  6. Click on Create Lead 
		  7. Enter CompanyName Field Using id Locator
		  8. Enter FirstName Field Using id Locator
		  9. Enter LastName Field Using id Locator
		  10. Enter FirstName(Local) Field Using id Locator
		  11. Enter Department Field Using any Locator of Your Choice
		  12. Enter Description Field Using any Locator of your choice 
		  13. Enter your email in the E-mail address Field using the locator of your choice
		  14. Click on Create Button
          15. Get the Title of Resulting Page. refer the video  using driver.getTitle()*/

package week2.day1.asssignments_week2_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
//		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
//		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
//		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Globallogic");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhuwaneshwaran");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vasu");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bhuvan");
		driver.findElement(By.name("departmentName")).sendKeys("Engineering");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Working as Senior Automation Engineer.");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bhuvanvasu@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}

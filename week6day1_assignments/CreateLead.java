package week6day1_assignments;


import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setValue() {
		filename = "CreateLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void CreateLeadTest(String cname, String fname, String lname) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
}
}







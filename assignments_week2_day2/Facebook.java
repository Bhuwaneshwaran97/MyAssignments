// Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL https://en-gb.facebook.com/
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Click on Create New Account button
// Step 7: Enter the first name
// Step 8: Enter the last name
// Step 9: Enter the mobile number
// Step 10: Enterthe password
// Step 11: Handle all the three drop downs
// Step 12: Select the radio button "Female" ( A normal click will do for this step)

package week2.day2.assignments_week2_day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bhuvan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("V");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8807442664");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Pass@123");
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year_1 = new Select(year);
		year_1.selectByVisibleText("1997");
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month_1 = new Select(month);
		month_1.selectByValue("11");
		WebElement dob = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dob_1 = new Select(dob);
		dob_1.selectByIndex(24);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		System.out.println("Script completed");
		
		

	}

}

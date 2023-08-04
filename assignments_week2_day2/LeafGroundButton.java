package week2.day2.assignments_week2_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
		driver.navigate().back();
		boolean buttonEnabledOrNot = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
		if (buttonEnabledOrNot) {
			System.out.println("Yes, the button is enabled");
		}else {
			System.out.println("No, the button is not enabled");
		}
		Point locationOfSave = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation();
		System.out.println("The Location of Submit Button is "+locationOfSave);
		String colorOfSaveButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("background-color");
		System.out.println("The color is Save Button is "+colorOfSaveButton);
		Dimension sizeOfSbumitButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize();
		System.out.println("The Height and Width of Submit Button is "+sizeOfSbumitButton);
		WebElement successButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
		Actions action = new Actions(driver);
		action.moveToElement(successButton).perform();
		String successButtonColor = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']//span")).getAttribute("style");
		System.out.println("The Color of Success Button is "+successButtonColor);
		WebElement imageButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']//span"));
		imageButton.click();
		Thread.sleep(3000);
		imageButton.click();
		
	}	
	
	
	

}

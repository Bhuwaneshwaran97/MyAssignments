package week4day1_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class buyTheValue {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://buythevalue.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='product-image'])[1]"));
		System.out.println(firstProduct.getLocation());
		Actions firstProductScroll = new Actions(driver);
		firstProductScroll.scrollByAmount(45, 962).perform();
		firstProduct.click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys("605008");
		WebElement checkButton = driver.findElement(By.xpath("//input[@value='Check']"));
		driver.executeScript("arguments[0].click()", checkButton);
		driver.findElement(By.xpath("//button[@id='product-add-to-cart']/span")).click();
		Thread.sleep(5000);
		WebElement viewCart = driver.findElement(By.xpath("//a[text()='View Cart']"));
		driver.executeScript("arguments[0].click()", viewCart);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}

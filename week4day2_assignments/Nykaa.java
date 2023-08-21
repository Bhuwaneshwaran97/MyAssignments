package week4day2_assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement brandElement = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions brands = new Actions(driver);
		brands.moveToElement(brandElement).perform();
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Oreal Paris')]")).click();
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//button[@class=' css-1aucgde']//span")).click();
		} catch (org.openqa.selenium.ElementClickInterceptedException e) {
			WebElement popularity = driver.findElement(By.xpath("//button[@class=' css-1aucgde']//span"));
			driver.executeScript("arguments[0].click()", popularity);
		}
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		WebElement category = driver.findElement(By.xpath("//span[text()='Category']"));
		driver.executeScript("arguments[0].click()", category);
		System.out.println("Category Clicked");
		try {
			driver.findElement(By.xpath("//span[text()='Hair']")).click();
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			driver.findElement(By.xpath("//span[text()='Hair']")).click();
		}
		System.out.println("Hair Clicked");
		try {
			driver.findElement(By.xpath("(//li[@class='css-1do4irw']/div//following-sibling::ul/li/div/span)[1]"))
					.click();
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			driver.findElement(By.xpath("(//li[@class='css-1do4irw']/div//following-sibling::ul/li/div/span)[1]"))
					.click();
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			driver.findElement(By.xpath("(//li[@class='css-1do4irw']/div//following-sibling::ul/li/div/span)[1]"))
					.click();
		}

		System.out.println("Hair Care Clicked");
		try {
			driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]/parent::div/following-sibling::div"))
					.click();
		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]/parent::div/following-sibling::div"))
					.click();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]/parent::div/following-sibling::div"))
					.click();
		}

		System.out.println("Shampoo Clicked");
		try {
			driver.findElement(By.xpath("//span[text()='Concern']")).click();
		} catch (org.openqa.selenium.ElementClickInterceptedException e) {
			WebElement concern = driver.findElement(By.xpath("//span[text()='Concern']"));
			driver.executeScript("arguments[0].click()", concern);
		}
		System.out.println("Concern Clicked");
		driver.findElement(By.xpath("//label[@for='checkbox_Color Protection_10764']/div/span[1]")).click();
		System.out.println("Colour Protection Clicked");
		try {
			driver.findElement(By.xpath("//div[@class='css-wkluxr']/following-sibling::a/div/img")).click();
		} catch (org.openqa.selenium.ElementClickInterceptedException e) {
			WebElement productClick = driver
					.findElement(By.xpath("//div[@class='css-wkluxr']/following-sibling::a/div/img"));
			driver.executeScript("arguments[0].click()", productClick);
		}
		System.out.println("L'Oreal Product Clicked");

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listwindowHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listwindowHandles.get(1));
		try {
			driver.findElement(By.xpath("//span[text()='180ml']")).click();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			driver.findElement(By.xpath("//span[text()='180ml']")).click();
		}

		System.out.println("Clicked 180ml");
		String mrp = driver.findElement(By.xpath("(//div[@class='css-1d0jf8e']/span/following-sibling::span)[1]"))
				.getText();
		System.out.println("The MRP of the Product is " + mrp);
		driver.findElement(By.xpath("//div[@class='css-vp18r8']//span[text()='Add to Bag']")).click();
		driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']/button")).click();
		Thread.sleep(500);
		try {
			driver.switchTo().frame(0);
			String grandTotal = driver.findElement(By.xpath("//div[@class='css-15py5ir e25lf6d2']/span")).getText();
			System.out.println(grandTotal);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			Thread.sleep(3000);
			String grandTotal = driver.findElement(By.xpath("//div[@class='css-15py5ir e25lf6d2']/span")).getText();
			System.out.println("The grand total is " + grandTotal);
		}
		String grandTotal = driver.findElement(By.xpath("//div[@class='css-15py5ir e25lf6d2']/span")).getText();
		System.out.println("The grand total is " + grandTotal);
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		} catch (org.openqa.selenium.ElementClickInterceptedException e) {
			WebElement proceed = driver.findElement(By.xpath("//span[text()='Proceed']"));
			driver.executeScript("arguments[0].click()", proceed);
		}
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> listWindowHandles2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(listWindowHandles2.get(1));
		try {
			driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		}
		catch (org.openqa.selenium.NoSuchElementException e) {
			driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		}
		driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']/img")).click();
		String finalPrice = driver.findElement(By.xpath("//p[contains(text(),'Price Details')]/parent::div/following-sibling::p")).getText();
		System.out.println(finalPrice);
		if (finalPrice.equals(grandTotal)) {
			System.out.println("Both the amount matched");
		}
		else {
			System.out.println("Not Matched");
		}
		driver.quit();
	}	

}

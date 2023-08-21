package week4day2_assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions actionsHandle = new Actions(driver);
		WebElement mensFashions = driver.findElement(By.xpath("(//span[contains(text(),'Fashion')]/parent::a/span)[2]"));
		actionsHandle.moveToElement(mensFashions).perform();
		driver.findElement(By.xpath("(//div[@class='colDataInnerBlk']//p[2]/a/span)[1]")).click();
		List<WebElement> shoes = driver.findElements(By.xpath("//p[@class='product-title']"));
		System.out.println("Count of shoes listed in Snapdeal page is "+shoes.size());
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']/span/following-sibling::div")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		String sortByGetText = driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();
		String sortByGetTextexpe = "Price Low To High";
		if (sortByGetText.contains(sortByGetTextexpe)) {
			System.out.println("Sorted Low to High Successfully");
		}
		else {
			System.out.println("Not Sorted Propelry");
		}
		
		WebElement firstAmount = driver.findElement(By.xpath("(//div[@class='price-text-box']/input)[1]"));
		actionsHandle.scrollToElement(firstAmount).perform();
		firstAmount.clear();
		firstAmount.sendKeys("600", Keys.TAB);
		WebElement secondAmount = driver.findElement(By.xpath("(//div[@class='price-text-box']/input)[2]"));
		secondAmount.clear();
		secondAmount.sendKeys("999");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[@for='Color_s-Navy']/span/following-sibling::a")).click();
		}
		catch (org.openqa.selenium.ElementClickInterceptedException e) {
			Thread.sleep(2000);
			WebElement navy = driver.findElement(By.xpath("//label[@for='Color_s-Navy']/span/following-sibling::a"));
			driver.executeScript("arguments[0].click()", navy);
		}
		catch (org.openqa.selenium.StaleElementReferenceException e) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[@for='Color_s-Navy']/span/following-sibling::a")).click();
		}
		
		String filterExpectedOne = "Rs. 600 - Rs. 875";
		String filterExpectedOneOutput = driver.findElement(By.xpath("(//a[@data-key='Price|Price'])[1]")).getText();
		if (filterExpectedOneOutput.contains(filterExpectedOne)) {
			System.out.println("Filter One Applied is Visible");
		}
		else {
			System.out.println("Filter One Applied is not Visible");
		}
		
		String filterExpectedTwo = "Navy";
		String filterExpectedTwoOutput = driver.findElement(By.xpath("(//a[@data-key='Color_s|Color'])[1]")).getText();
		if (filterExpectedTwoOutput.contains(filterExpectedTwo)) {
			System.out.println("Filter One Applied is Visible");
		}
		else {
			System.out.println("Filter One Applied is not Visible");
		}
		
		WebElement product = driver.findElement(By.xpath("//picture[@class='picture-elem']/img"));
		actionsHandle.moveToElement(product).perform();
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> listWindowHandles1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(listWindowHandles1.get(0));
		String actualPrice = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[1]")).getText();
		System.out.println("The actual price is "+actualPrice);
		String discountedPrice = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[2]")).getText();
		System.out.println("Applicable discount is "+discountedPrice);
//		WebElement imageToScrn = driver.findElement(By.xpath("(//ul[@id='bx-slider-qv-image-panel']/li/img)[1]"));
		Thread.sleep(3000);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File dstn = new File("./snap/snapdeal.png");
		FileUtils.copyFile(screenshotAs, dstn);
		driver.close();

		
	}

}

package week5Marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNowMobile {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev130225.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Bhuvan@123");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		try {
			shadow.findElementByXPath("//div[@aria-label='All']").click();
		}
		catch(org.openqa.selenium.NoSuchElementException e){
			shadow.findElementByXPath("//div[@aria-label='All']").click();
		}
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Service catalog");
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(Keys.ENTER);
		WebElement iFrame = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(iFrame);
		try {
			driver.findElement(By.xpath("(//td[@class='homepage_category_only_description_cell'])[8]/a/span/h2")).click();
		}
		catch (org.openqa.selenium.NoSuchElementException e) {
			driver.findElement(By.xpath("(//td[@class='homepage_category_only_description_cell'])[8]/a/span/h2")).click();
		}
		
		driver.findElement(By.xpath("(//strong[contains(text(),'Apple iPhone 13')])[1]")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='IO:43d5c38a9707011021983d1e6253af8a']")).sendKeys("99");
		WebElement dataDropDown = driver.findElement(By.xpath("//select[@name='IO:33494b069747011021983d1e6253af45']"));
		Select st = new Select(dataDropDown);
		st.selectByIndex(2);
		driver.findElement(By.xpath("//label[@for='IO:abd0057697968d1021983d1e6253afad_e59101b697968d1021983d1e6253af52']")).click();
		driver.findElement(By.xpath("//label[@for='IO:84436a369712cd1021983d1e6253af5c_124466769712cd1021983d1e6253afd2']")).click();
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		String requestNumber = driver.findElement(By.xpath("//dl[@class='dl-horizontal sc-dl-horizontal']/dd[2]/a/b")).getText();
		System.out.println("The Request Number is "+requestNumber);
		File image = driver.getScreenshotAs(OutputType.FILE);
		File dstn = new File("./Snap/mobile.jpg");
		FileUtils.copyFile(image, dstn);
		Thread.sleep(2000);
		driver.close();
		
	}

}

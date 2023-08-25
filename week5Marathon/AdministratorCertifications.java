package week5Marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class AdministratorCertifications {

	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf$1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//button[@title='Learn More']/span[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listwindowHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listwindowHandles.get(1));
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
//		Set<String> windowHandles2 = driver.getWindowHandles();
//		List<String> listwindowHandles2 = new ArrayList<String>(windowHandles2);
//		driver.switchTo().window(listwindowHandles2.get(1));
		shadow.findElementByXPath("//span[contains(text(),'Learning')]").click();
		WebElement trailHead = shadow.findElementByXPath("//span[contains(text(),'Learning on Trailhead')]");
		Actions actions = new Actions(driver);
		actions.moveToElement(trailHead).perform();
		WebElement salesCertification = shadow.findElementByXPath("//a[contains(text(),'Salesforce Certification')]");
		actions.scrollToElement(salesCertification).perform();
		driver.executeScript("arguments[0].click()", salesCertification);
		driver.findElement(By.xpath("(//div[@class='credentials-card ']/div[3])/a[1]")).click();
		String overViewExpected = "broad knowledge";
		String overView = driver.findElement(By.xpath("//div[@class='Fz(18) slds-text-align--center']")).getText();
		if (overView.contains(overViewExpected)) {
			System.out.println("Administrator Overview Page Verified Successfully");
		}
		else {
			System.out.println("Administrator Overview Page Verification Failed");
		}
		List<WebElement> courses = driver.findElements(By.xpath("//div[@class='trailMix-card-body_title']/a"));
		
		for(int i = 0; i<courses.size();i++) {
			System.out.println("The courses availabe are as follows below:"+courses.get(i).getText());
		}
		
		WebElement certScroll = driver.findElement(By.xpath("//div[@class='trailMix-card-body_title']/a[1]"));
		actions.scrollToElement(certScroll).perform();
		File image = driver.getScreenshotAs(OutputType.FILE);
		File dstn = new File("./Snap/cert.jpg");
		FileUtils.copyFile(image, dstn);
		Thread.sleep(2000);
		driver.close();
	}
	
	

}

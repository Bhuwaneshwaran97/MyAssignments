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

public class ArchitectCertifications {

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
		shadow.findElementByXPath("//span[contains(text(),'Learning')]").click();
		WebElement trailHead = shadow.findElementByXPath("//span[contains(text(),'Learning on Trailhead')]");
		Actions actions = new Actions(driver);
		actions.moveToElement(trailHead).perform();
		WebElement salesCertification = shadow.findElementByXPath("//a[contains(text(),'Salesforce Certification')]");
		actions.scrollToElement(salesCertification).perform();
		driver.executeScript("arguments[0].click()", salesCertification);
		driver.findElement(By.xpath("//img[@alt='Salesforce<br/>Architect']")).click();
		String architectSummy = driver
				.findElement(By.xpath("//h1[contains(text(),'Salesforce Architect')]/parent::div/div[1]")).getText();
		System.out.println(architectSummy);
		List<WebElement> architectCertification = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		for(int i =0; i<architectCertification.size();i++) {
			System.out.println("The courses availabe are as follows below:"+architectCertification.get(i).getText());
		}
		
		WebElement archiScroll = driver.findElement(By.xpath("//div[@class='credentials-card_title']/a"));
		actions.scrollToElement(archiScroll).perform();
		File image = driver.getScreenshotAs(OutputType.FILE);
		File dstn = new File("./Snap/archi.jpg");
		FileUtils.copyFile(image, dstn);
		Thread.sleep(2000);
		driver.close();
	}

}

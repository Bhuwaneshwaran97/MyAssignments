package week2.day2.assignments_week2_day2;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundInput {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.xpath("//form[@id='j_idt88']//div//div//input[@id='j_idt88:name']")).sendKeys("Bhuvan");
		driver.findElement(By.xpath("//form[@id='j_idt88']//div//div//input[@id='j_idt88:j_idt91']")).sendKeys(", India");
		boolean isEnabled = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled();
		if(isEnabled) {
			System.out.println("Yes, the element is enabled");
		}else {
			System.out.println("No, the element is disabled");
		}
		
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		String retrievedText = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getText();
		System.out.println(retrievedText);	
		WebElement email = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']"));
		email.sendKeys("bhuvanvasu@gmail.com");
		email.sendKeys(Keys.TAB);
		try {
			WebElement expectedElement = driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']"));
			expectedElement.sendKeys("I'm automating this site");
		}catch (NoSuchElementException e) {
			System.out.println("Not Focused");
		}
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		String expectedError = "Age is mandatory";
		String expectedOutput = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		if (expectedError.contains(expectedOutput)) {
			System.out.println("Error Matched");
		}else {
			System.out.println("Error Not Matched");
		}
		
		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
		String getUserNameFloat = driver.findElement(By.xpath("//label[@id='j_idt106:j_idt113']")).getText();
		String expectedUserNameFloat = "Username";
		if (getUserNameFloat.contains(expectedUserNameFloat)) {
			System.out.println("Location Changed");
		}else {
			System.out.println("Location Not Changed");
		}
		Thread.sleep(1000);
		//Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable
		/*
		 * try {
		 * driver.findElement(By.xpath("//div[@id='j_idt106:auto-complete']//ul")).
		 * sendKeys("Bhuvan"); } catch (ElementNotInteractableException e) {
		 * driver.findElement(By.xpath("//div[@id='j_idt106:auto-complete']//ul")).
		 * sendKeys("Bhuvan"); }
		 */
//		driver.findElement(By.xpath("//div[@id='j_idt106:auto-complete']//ul")).sendKeys("Bhuvan");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']//li[3]")).click();
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")).sendKeys("11/25/1997");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='25']")).click();
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).sendKeys("10");
		driver.findElement(By.xpath("//a[@class='ui-spinner-button ui-spinner-down ui-corner-br ui-button ui-widget ui-state-default ui-button-text-only']")).click();
		Point beforeSliderLocation = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getLocation();
		System.out.println(beforeSliderLocation);
		driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("4");
		Point afterSliderLocation = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getLocation();
		System.out.println(afterSliderLocation);
		if (beforeSliderLocation != afterSliderLocation) {
			System.out.println("Slider moved successfully");
		}else{
			System.out.println("Slider not moved");
		}
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).click();
		Thread.sleep(2000);
		String verifyKeyboard = "Close";
		String outKeyboard = driver.findElement(By.xpath("//button[text()='Close']")).getText();
		if (verifyKeyboard.contains(outKeyboard)) {
			System.out.println("Keyboard is active");
		}else {
			System.out.println("Keyboard not active");
		}
		driver.findElement(By.xpath("//button[text()='b']")).click();
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("Bhuvan");
	}	
}

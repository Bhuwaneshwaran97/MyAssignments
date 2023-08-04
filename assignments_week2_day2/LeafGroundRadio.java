package week2.day2.assignments_week2_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundRadio {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody/tr/td[4]/div")).click();
		String defaultBrowserSelected = driver
				.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody/tr/td[3]//label[text()='Safari']"))
				.getText();
		System.out.println("By default selected browser is " + defaultBrowserSelected);
		WebElement unSelectable = driver.findElement(By.xpath("//div[@id='j_idt87:city2']//div[2]"));
		unSelectable.click();
		unSelectable.click();
		System.out.println("Done");
		WebElement ageUnSelect = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[2]/div/div[2]/span"));
		ageUnSelect.click();
		Thread.sleep(2000);
		ageUnSelect.click();

	}

}

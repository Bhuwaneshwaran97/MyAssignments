package week4day1_assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> inputTextbox = driver.findElements(By.xpath("//input[@class='inputLogin']"));
		inputTextbox.get(0).sendKeys("DemoSalesManager");
		inputTextbox.get(1).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
		driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::a/img)[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindowHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindowHandles.get(1));
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]/tbody/tr[1]/td[1]/div/a")).click();
		driver.switchTo().window(listWindowHandles.get(0));
		driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::a/img)[2]")).click();
		Thread.sleep(3000);
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> listWindowHandles2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(listWindowHandles2.get(1));
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[5]/tbody/tr[1]/td[1]/div/a")).click();
		driver.switchTo().window(listWindowHandles2.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());
		
	}

}

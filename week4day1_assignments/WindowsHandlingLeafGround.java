package week4day1_assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingLeafGround {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindowHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindowHandles.get(1));
		driver.close();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> listWindowHandles2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(listWindowHandles2.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> listWindowHandles3 = new ArrayList<String>(windowHandles3);
		System.out.println("The count of windows opened is " + listWindowHandles3.size());
		Thread.sleep(2000);
		for (int i = 1; i < listWindowHandles3.size(); i++) {
			driver.switchTo().window(listWindowHandles3.get(i));
			driver.close();
			System.out.println("Window Closed Successfully: " + i);
		}
		driver.switchTo().window(listWindowHandles3.get(0));
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> listWindowHandles4 = new ArrayList<String>(windowHandles4);
		for (int i = 1; i < listWindowHandles4.size(); i++) {
			driver.switchTo().window(listWindowHandles4.get(i));
			driver.close();
			System.out.println("Window of Close Windows Closed Successfully: " + i);

		} 	
		driver.switchTo().window(listWindowHandles4.get(0));
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles5 = driver.getWindowHandles();
		List<String> listWindowHandles5 = new ArrayList<String>(windowHandles5);
		String openWithDelay = "Web Table";
		for (int i =0; i<listWindowHandles5.size();i++) {
			driver.switchTo().window(listWindowHandles5.get(i));
			boolean openWithDelayContains = driver.getTitle().contains(openWithDelay);
			if (openWithDelayContains) {
				System.out.println("Open With Delay Window Opened Successfully");
				driver.quit();
			}
		}
		
	}
}

package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Akkalkot");
		Thread.sleep(3000);
		List<WebElement> e2 = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));

		int length1 = e2.size();//How to print the count
		System.out.println(length1);
//How to print all autosuggestion
		for (int i = 0; i < length1; i++) {
			WebElement a1 = e2.get(i);
			String auto = a1.getText();
			System.out.println(auto);
		}
	}

}

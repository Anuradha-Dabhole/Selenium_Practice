package practiceselenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon_Autosuggestion extends Object {

	public static void main(String[] args) throws InterruptedException, IOException {
		Amazon_Autosuggestion a1 = new Amazon_Autosuggestion();
		System.out.println(a1.getClass());
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe");
		Thread.sleep(2000);
		List<WebElement> e2 = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		e2.get(e2.size() - 1).click();
		// How to select particular autosuggestion

		TakesScreenshot t1 = driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		//File destination = new File("C:\\Users\\Dell Latitude 3400\\eclipse-workspace\\Selenium1\\Screenshot\\photo"+ Math.random() + ".png");//give the only screenshot with random number
		File destination = new File("C:\\Users\\Dell Latitude 3400\\eclipse-workspace\\Selenium1\\Screenshot\\photo"+ new Amazon_Autosuggestion().getClass() +".png");//create object of the child class & write method it will give the package name & class name
		FileHandler.copy(source, destination);
	}

}

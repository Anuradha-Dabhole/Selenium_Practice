package practiceselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_program {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
    wait.until(ExpectedConditions.titleIs("Google"));
    		
    driver.findElement(By.name("q")).sendKeys("India",Keys.ENTER);
   //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
}
}

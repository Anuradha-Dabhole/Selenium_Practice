package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_search {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
             driver.get("https://www.amazon.in");
             driver.manage().window().maximize();
             driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe",Keys.ENTER);
             //driver.findElement(By.id("nav-search-submit-button")).click();
             //driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

	}

}

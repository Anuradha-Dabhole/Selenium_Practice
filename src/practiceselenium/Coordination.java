package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordination {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
       // WebElement e1=  driver.findElement(By.id("twotabsearchtextbox"));
        WebElement e1=  driver.findElement(By.linkText("About Amazon"));

Point xy=   e1.getLocation();
    int x=    xy.getX();
      int y=  xy.getY();
      System.out.println(x);
      System.out.println(y);

      
      
           JavascriptExecutor js=      driver;
           js.executeScript("windows.scrollBy(0,500)");
        
        
	}

}

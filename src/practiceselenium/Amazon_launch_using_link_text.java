package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_launch_using_link_text {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        WebElement e1= driver.findElement(By.linkText("Customer Service"));
        e1.click();
	}

}

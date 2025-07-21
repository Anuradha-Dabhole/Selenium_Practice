package practiceselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.*;

public class Amazon_move_control_parent_to_child2 {
    public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
        e1.sendKeys("shoe" + Keys.ENTER);

        Thread.sleep(3000);  // wait for search results

        WebElement e2 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
        String link = e2.getAttribute("href");

        // Open in new tab
        ((JavascriptExecutor) driver).executeScript("window.open(arguments[0]);", link);

        Thread.sleep(3000);  // wait for tab to open

        Set<String> id = driver.getWindowHandles();
        System.out.println("Total windows opened: " + id.size());

        Iterator<String> i1 = id.iterator();
        String parentid = i1.next();
        String childid = i1.next();

        System.out.println("Parent ID: " + parentid);
        System.out.println("Child ID: " + childid);
    }
}

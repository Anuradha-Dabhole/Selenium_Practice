package practiceselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_backward {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        //driver.get("https://www.amazon.in");
        driver.navigate().to("https://www.amazon.in");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
	}

}

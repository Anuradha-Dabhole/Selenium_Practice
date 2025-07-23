package practiceselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ChromeDriver {

	public static void main(String[] args) 
	{
		ChromeDriver conductor=new ChromeDriver();
		conductor.get("https://www.facebook.com");
             String title=conductor.getTitle();
             System.out.println(title);
             
             //conductor.close();
	}

}

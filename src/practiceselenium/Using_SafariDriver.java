package practiceselenium;

import org.openqa.selenium.safari.SafariDriver;

public class Using_SafariDriver {

	public static void main(String[] args) 
	{
		SafariDriver conductor=new SafariDriver();
		conductor.get("https://www.google.com");
             String title=conductor.getTitle();
             System.out.println(title);
	}

}

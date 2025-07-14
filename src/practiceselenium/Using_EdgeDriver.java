package practiceselenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Using_EdgeDriver {

	public static void main(String[] args) 
	{
		EdgeDriver conductor=new EdgeDriver();
		conductor.get("https://www.google.com");
             String title=conductor.getTitle();
             System.out.println(title);
	}

}

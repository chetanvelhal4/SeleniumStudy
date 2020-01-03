package myPackage;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	
	public void mybrowser()
	{
		//Getting URL from USER 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter URL to open:-");
		String name = input.next();
		
		
		// Creating Driver object
		System.setProperty("webdriver.chrome.driver","C:\\tools\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver obj1 = new ChromeDriver();
		obj1.get(name);
		String title = obj1.getTitle();
		System.out.println("Page Title is:-" + title);
		//obj1.get("https://Hindiwikipedia.com");
		//obj1.navigate().back();
		obj1.close();
		
	}
	
}

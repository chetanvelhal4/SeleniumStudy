package myPackage;
import java.util.Scanner;

import org.openqa.selenium.By;
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
		ChromeDriver Driver = new ChromeDriver();
		Driver.get(name);
		String title = Driver.getTitle();
		System.out.println("Page Title is:-" + title);
		Driver.get("https://Hindiwikipedia.com");
		Driver.navigate().back();
		//Driver.findElement(By.id("login-username")).sendKeys("chetanvelhal4@gmail.com");
		//Driver.findElement(By.name("signin")).click();
		Driver.close();
		
	}
	
}

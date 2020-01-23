package myPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoodsSupplier {

	public void GSU()
	{
		System.setProperty("webdriver.chrome.driver","C:\\tools\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver mydriver = new ChromeDriver();
		mydriver.get("https://team5-vanderlande.westeurope.cloudapp.azure.com/stock-broker-mock");
		mydriver.findElementById("username").sendKeys("admin");
		mydriver.findElementById("password").sendKeys("Vanderlande1");
		mydriver.manage().window().maximize();
		mydriver.findElementById("kc-login").click();
	
		
	}
}

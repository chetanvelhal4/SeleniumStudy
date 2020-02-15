package myPackage;

import java.util.UUID;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
		//WebElement buttonname = mydriver.findElementById("btnInboundOrderEvent");
		
		//mydriver.findElementById("btnInboundOrderEvent").click();
		//mydriver.findElementByClassName("vi-button-vertical").click();
		mydriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		mydriver.findElement(By.id("btnInboundOrderEvent")).click();
		UUID uuid1 = UUID.randomUUID();
		
		String randomUUIDString = uuid1.toString();
				
		mydriver.findElement(By.id("txtInboundOrderId")).sendKeys(randomUUIDString);
	
		
		//mydriver.findElementByClassName("vi-button-vertical").c
		//mydriver.findElementByLinkText("Inbound Order Event").
	}
	
	
}

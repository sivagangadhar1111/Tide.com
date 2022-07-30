package com.mindtree.seleniumclass;

import java.time.Duration;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium1 {

	private Object system;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.get("https://tide.com/en-us");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/div/div/div/div[1]/div/a[2]/picture/img")).click();
	
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/div/div/div[2]/div/div[2]/a/div/span")).click();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"searchButton\"]/img")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	

		
	
		
		
			
		    
		
		
	
		
	}
}



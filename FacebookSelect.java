package org.insta;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect {
	public static void main(String[] args) throws Exception {
		

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\JavaProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");

	WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	create.click();
	
	Thread.sleep(1000);
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	month.click();
Select s = new Select(month);
List<WebElement> c = s.getOptions();

int size = c.size();

for (int i = 0; i < size ; i++) {
	WebElement webElement = c.get(i);
	String text = webElement.getText();
	System.out.println(text);
	
}




//
//	for (int i = size-6; i<size-1; i++) {
//		
//		WebElement webElement = c.get(i);
//		String text = webElement.getText();
//		System.out.println(text);
//	}

	


	}
	
	
	
	
	
	}


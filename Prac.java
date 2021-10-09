package org.insta;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {
	


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\JavaProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.tagName("table"));
		WebElement tHead = table.findElement(By.tagName("thead"));
		WebElement rows = tHead.findElement(By.tagName("tr"));
		List<WebElement> Heading = rows.findElements(By.tagName("th"));
		for (int k = 0; k <= Heading.size(); k++) {
			WebElement el = Heading.get(k);
			String t1 = el.getText();
			System.out.println(t1);
			
		}
		
		WebElement tbody = table.findElement(By.tagName("tbody"));
		List<WebElement> rows1 = tbody.findElements(By.tagName("tr"));
		for (int i = 0; i <= rows1.size(); i++) {
			
			 rows1.get(i);
		
			
			
		}
		
		List<WebElement> tdata = tbody.findElements(By.tagName("td"));
		for (int j = 0; j < tdata.size(); j++) {
			WebElement ele3 = tdata.get(j);
			String txt1 = ele3.getText();
			System.out.println(txt1);
		}
	}

}

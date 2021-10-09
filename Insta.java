package org.insta;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Insta {


public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\JavaProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	driver.manage().window().maximize();
	WebElement table = driver.findElement(By.tagName("table"));
	WebElement heading = table.findElement(By.tagName("thead"));
	WebElement rows = heading.findElement(By.tagName("tr"));
	List<WebElement> headingRows = rows.findElements(By.tagName("th"));
	
	for (int k = 0; k <= headingRows.size(); k++) {
		WebElement el = headingRows.get(k);
		String t1 = el.getText();
		System.out.println(t1);
		
	}
	
	WebElement tbody = table.findElement(By.tagName("tbody"));
	List<WebElement> rows1 = tbody.findElements(By.tagName("tr"));
	for (int i = 0; i < rows1.size(); i++) {
		
		 WebElement data1 = rows1.get(i);
	
		
		
	}
	
	List<WebElement> tdata = driver.findElements(By.tagName("td"));
	for (int j = 0; j < tdata.size(); j++) {
		WebElement ele3 = tdata.get(j);
		String txt1 = ele3.getText();
		System.out.println(txt1);
	}
}

}

//	WebElement table = driver.findElement(By.tagName("table"));
//	WebElement thead = table.findElement(By.tagName("thead"));
//	 List<WebElement> row = thead.findElements(By.tagName("th"));
//
//	List<WebElement> column = driver.findElements(By.tagName("td"));
//
//
//	for (int i = 0; i <= row.size(); i++) {
//	
//			WebElement webElement = row.get(i);
//			String text = webElement.getText();
//			System.out.println(text);
//}	
//	
//
//	WebElement tbody = table.findElement(By.tagName("tbody"));
//	List<WebElement> list = tbody.findElements(By.tagName("tr"));
//	int size1=list.size();
//	
//	for (int i = 0; i <= list.size(); i++) {		
//		
//	 list.get(i);
//		}
//	List<WebElement> list1 = tbody.findElements(By.tagName("td"));
//	int size2 = list1.size();
//	for (int i = 0; i <= list1.size(); i++) {
//		
//		WebElement el = list1.get(i);
//		String text1 = el.getText();
//		System.out.println(text1);
//	}}
//}
//	
//	
//	WebElement table = driver.findElement(By.tagName("table"));
//	WebElement tHeading = table.findElement(By.tagName("thead"));
//	WebElement rowHead= tHeading.findElement(By.tagName("tr"));
//	List<WebElement> row = rowHead.findElements(By.tagName("th"));
//	
//	for (int i = 0; i < row.size(); i++) {
//		
//		WebElement element = row.get(i);
//		String text = element.getText();
//		System.out.print(text);
//		
//	}
//	
//	WebElement tbody = table.findElement(By.tagName("tbody"));
//	
//	 List<WebElement> rows = tbody.findElements(By.tagName("tr"));
//
//	 for (int i = 0; i <= rows.size(); i++) {
//		 rows.get(i);
//		 
//		
//	}
//	 List<WebElement> data1 = tbody.findElements(By.tagName("td"));
//		
//	
//	for (int j = 0; j < data1.size(); j++) {
//		WebElement webElement1 = data1.get(j);
//		String text1 = webElement1.getText();
//		System.out.println(text1);
//	}
//	
//	
//	
//	
//}
//	
//	
//	
//	
//}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	
//	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	WebElement table = driver.findElement(By.tagName("table"));
//	
//	WebElement Heading = table.findElement(By.tagName("thead"));
//	
//	List<WebElement> rows = Heading.findElements(By.tagName("tr"));
//	
//	for (int i = 0; i < rows.size(); i++) {
//		WebElement webElement = rows.get(i);
//		String text = webElement.getText();
//		System.out.println(text);
//		
//	}
//	
//	
//	WebElement Body = driver.findElement(By.tagName("tbody"));
//	
//	List<WebElement> eachRow = Body.findElements(By.tagName("tr"));
//	
//	for (int i = 0; i < eachRow.size(); i++) {
//		WebElement webElement = eachRow.get(i);
//		String text = webElement.getText();
//		System.out.println(text);
//	}
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
//	findElement.sendKeys("iphone",Keys.ENTER);
//	WebElement findElement2 = driver.findElement(By.xpath("//span[text()='Apple iPhone 7 (32GB) - Black']"));
//	findElement2.click();
//	String parentWindowHandle = driver.getWindowHandle();
//	Set<String> childWindows = driver.getWindowHandles();
//	
//	for (String string : childWindows) {
//		if (!parentWindowHandle.equals(childWindows)) {
//			
//			driver.switchTo().window(string);
//			
//		}
//		
//	}
//	
//	WebElement findElement3 = driver.findElement(By.id("add-to-cart-button"));
//	
//	findElement3.click();
//	
//	driver.switchTo().window(parentWindowHandle);
//	driver.close();
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
	
	
	
	
	
//	WebElement txtenter = driver.findElement(By.id("twotabsearchtextbox"));
//	txtenter.sendKeys("iphone",Keys.ENTER);
//	WebElement iphone11 = driver.findElement(By.xpath("//span[text()='Apple iPhone 7 (32GB) - Black']"));
//	iphone11.click();
//	
//	// Next Window 
//	// Parent
//	String parentWindow = driver.getWindowHandle();
//	// All Window
//	Set<String> windowHandles = driver.getWindowHandles();
//	for (String e : windowHandles) {
//		if (!parentWindow.equals(windowHandles)) {
//			
//			driver.switchTo().window(e);
//			
//		}
//		
//	}
	
	
//	
//	for (String e : windowHandles) {
//		if (!parentWindow.equals(windowHandles)) {
//			
//			driver.switchTo().window(e);
//		}
//		
//	}
	
//	WebElement iphone111 = driver.findElement(By.id("add-to-cart-button"));
//	iphone111.click();
//	Thread.sleep(5000);
//	
//	driver.switchTo().window(parentWindow);
//	
//	
//	WebElement iphone112 = driver.findElement(By.xpath("//span[text()='Apple iPhone 7 (32GB) - Black']"));
//	iphone112.click();
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	JavascriptExecutor executor = (JavascriptExecutor)driver;
//	WebElement txtUser = driver.findElement(By.id("email"));
//	Object executeScript = executor.executeScript("arguments[0].setAttribute('value','wel')", txtUser);
//	System.out.println(executeScript);
//	WebElement pass = driver.findElement(By.id("pass"));
//	Object executeScript3 = executor.executeScript("arguments[0].setAttribute('value','Hello@123')",pass);
//	System.out.println(executeScript3);
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
//	int size = findElements.size();
//	System.out.println(size);
//	
//	driver.switchTo().frame("a077aa5e");
//	driver.switchTo().defaultContent();
//	WebElement findElement = driver.findElement(By.id("philadelphia-field-email"));
//	findElement.sendKeys("bhaa");
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	WebElement findElement2 = driver.findElement(By.xpath("//iframe[@src='ads.html']"));
//	
//	driver.switchTo().frame(findElement2);
//	
//	WebElement findElement = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
//	findElement.click();
//	WebElement findElement3 = driver.findElement(By.xpath("//iframe[@src='https:/www.youtube.com/embed/_TlK0-5EJ-Y']"));
//	driver.switchTo().frame(findElement3);
//	WebElement findElement4 = driver.findElement(By.xpath("//div[@class='rt-grid-6 rt-omega']"));
//	findElement4.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	WebElement findElement = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
//	
//	findElement.click();
//	driver.switchTo().defaultContent();
//	WebElement findElement2 = driver.findElement(By.id("philadelphia-field-email"));
//	findElement2.sendKeys("Bhavani");
//	
//	driver.manage().window().maximize();
//	WebElement findElement = driver.findElement(By.id("i-icon-profile"));
//	findElement.click();
//	WebElement findElement2 = driver.findElement(By.id("signInLink"));
//	findElement2.click();
//	Thread.sleep(1000);
//	
//	
//	
//	driver.switchTo().frame("mobileNoInp");
//	Thread.sleep(1000);
//	WebElement findElement3 = driver.findElement(By.id("mobileNoInp"));
//	findElement3.click();
//	findElement3.sendKeys("76809385");
//	
	
	
//	WebElement findElement2 = driver.findElement(By.xpath("//a[text()='login']"));
//	findElement2.click();
//	Thread.sleep(5000);
//	driver.switchTo().frame("loginIframe");
//
//	WebElement findElement3 = driver.findElement(By.id("userName"));
//	findElement3.sendKeys("Bhavani");
//	
	
	
//	List<WebElement> findElements = driver.findElements(By.tagName("div"));
//	System.out.println(findElements.size());
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
//	
//	findElements.size();
//	System.out.println(findElements.size());
	
	
	
	
	
//	driver.switchTo().frame("login_page");
//	WebElement findElements = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
//	findElements.sendKeys("bhavani");
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	driver.findElement(By.xpath("//frame[@name='login_page']"));
	
//	WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
//	img.click();
//WebElement findElement = driver.findElement(By.xpath("//iframe[@src='ads.html']"));
//	
//	driver.switchTo().frame(findElement);
//	findElement.getSize()
	
//	List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
//	int size = findElements.size();
//	System.out.println(size);
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	WebElement findElement = driver.findElement(By.xpath("//a[text()='Create New Account']"));
//	findElement.click();
//	Thread.sleep(1000);
//	
//	WebElement findElement2 = driver.findElement(By.xpath("//options[text()='Month']"));
//Dimension size = findElement2.getSize();
//System.out.println(size);
//     String text = findElement2.getText();
//     System.out.println(text);
     
//for (int i = 0; i < args.length; i++) {
	
//}







//Select select = new Select(findElement2);

//List<WebElement> options = select.getOptions();
//
//for (int i =0; i < options.size(); i++) {
//	
//	if(i%2==1) {
//	WebElement webElement = options.get(i);
//	String text = webElement.getText();
//	System.out.println(text);
//}
	












	
//	Select select = new Select(findElement2);
//	
//List<WebElement> options = select.getOptions();
//	int size = options.size();
//	int a = size/2;
//	WebElement webElement = options.get(a);
//	String text = webElement.getText();
//	System.out.println(text);
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	for (int i = 1; i < 6; i++) {
//		WebElement webElement = options.get(i);
//		String string = webElement.getText();
//		System.out.println(string);
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
//	WebElement findElement2 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//	
//	Select select = new Select(findElement2);
//	List<WebElement> options = select.getOptions();
//	
//	for (int i = 0; i < options.size(); i++) {
//		WebElement webElement = options.get(i);
//		
//	    String string = webElement.getAttribute("value");
//		System.out.println(string);
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	
//	
//	WebElement drpDown = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//	Select select =  new Select(drpDown);
//	List<WebElement> options = select.getOptions();
//	
//	for (int i = 0; i < options.size(); i++) {
//		WebElement webElement = options.get(i);
//		
//		String text = webElement.getText();
//		System.out.println(text);
//	}
//	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
//	String text = findElement2.getText();
//	
//	System.out.println(text);
	
	
//	WebElement skills = driver.findElement(By.id("Skills"));
//	Select select = new Select(skills);
//	
//	 List<WebElement> list = select.getOptions();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 for (int i = 0; i < list.size(); i++) {
//		  WebElement webe = list.get(i);
//		String attribute = webe.getAttribute("value");
//		System.out.println(attribute);
//	}
//for (WebElement webElement : list) {
//	String attribute = webElement.getAttribute("value");
//	System.out.println(attribute);
//	
//}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
	//WebElement findElement = driver.findElement(By.id("pass"));
//	findElement.sendKeys("Bhanu");
//	
//	String n = findElement.getAttribute("value");
//	
//	System.out.println(n);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Actions actions= new Actions((WebDriver) findElement);
	//actions.keyDown(Keys.SHIFT).sendKeys("bbb").keyUp(Keys.SHIFT).perform();
	
	
	
	//Robot robot = new Robot();
	//robot.keyPress(KeyEvent.VK_A);
	//robot.keyPress(KeyEvent.VK_B);
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//WebElement proceed = driver.findElement(By.xpath("//input[@value='Sign in']"));
	//Thread.sleep(2000);
	//proceed.click();
	//Thread.sleep(3000);
	//Alert alert = driver.switchTo().alert();
	
	//alert.accept();
	
	//String text = alert.getText();
	//System.out.println(text);
	
	//alert.dismiss();
	
	
	
//	driver.navigate().to("https://www.google.com/");
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.navigate().refresh();
	
	//Robot robot= new Robot();
	//Actions actions =  new Actions(driver);
	//robot.keyPress(KeyEvent.VK_A);
	//robot.keyPress(KeyEvent.VK_B);
	
	//actions.doubleClick().perform();
		
	
	
	//Actions actions = new Actions(driver);
	//WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
	//actions.contextClick(course).perform();
	//Robot robot =  new Robot();
	//robot.keyPress(KeyEvent.VK_DOWN);
	//robot.keyRelease(KeyEvent.VK_DOWN);
	
	
	//Actions actions = new Actions(driver);
	//WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
	
	//actions.moveToElement(course).perform();
	
	//WebElement oracleTrain = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
	//actions.moveToElement(oracleTrain).perform();
	//WebElement plSql = driver.findElement(By.xpath("//span[text()='PLSQL Certification']"));
	//actions.moveToElement(plSql).perform();
	
	
	
	
	
	
	
	
	
	
	
	
	//WebElement s = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	//s.click();
	

	//WebElement d = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
	//Actions actions1 = new Actions(driver);
	//actions1.dragAndDrop(s, d).perform();
	
	
	//WebElement s1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	//s1.click();
	
	//WebElement d1 = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[1]"));
  
	//Actions actions2 = new Actions(driver);
	//actions2.dragAndDrop(s1, d1).perform();
	
	//WebElement s3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	
	//s3.click();
	//WebElement d3 = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[2]"));
	  //Actions actions3= new Actions(driver);
	  //actions3.dragAndDrop(s3, d3).perform();
	  
	  //WebElement s4 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	  //s4.click();
	  
//WebElement d4 = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
	//Actions actions4 = new Actions(driver);
	//actions4.dragAndDrop(s4, d4).perform();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
	//Actions actions =  new Actions(driver);
	//actions.moveToElement(electronics).perform();
	
	
	//WebElement gamming = driver.findElement(By.xpath("//a[text()='Gaming']"));
	//actions.moveToElement(gamming).perform();
	
	

	//WebElement gamingmouse = driver.findElement(By.xpath("//a[text()='Gaming Mouse']"));
	//gamingmouse.click();
	//WebElement oracleCourse = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
	//actions.moveToElement(oracleCourse).perform();

	
	//WebElement oraclePlsql = driver.findElement(By.xpath("//span[text()='PLSQL Certification']"));
	//oraclePlsql.click();
	
	
	
	
	


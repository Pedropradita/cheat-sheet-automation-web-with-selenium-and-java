import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

public class Demo {

	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		System.setProperty("webdriver.gecko.driver","C:\\Users\\lenovo\\Documents\\geckodriver\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();

//		System.setProperty("webdriver.ie.driver","C:\\Users\\lenovo\\Documents\\IEDriverServer\\IEDriverServer.exe");
//		WebDriver driver=new InternetExplorerDriver();
//		
//
//		driver.get("https://www.google.com/");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		
//		driver.navigate().to("https://id.yahoo.com/");
//		driver.navigate().back();
//		driver.close();

//		int a=1;
//		int b=2;
//		int sum=a/b;
//		
//		System.out.println("Total is " + sum);

//		memanggil class global pada file class berbeda
//		global m=new global();
//		
//		System.out.println(m.validateheader());

//		driver.get("https://web.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("email@email.com");
//		driver.findElement(By.id("pass")).sendKeys("pass");
//		driver.findElement(By.className("_9luh")).click();

//		=======================================
//		contoh custom xpath
//		<button type="submit" class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent blue-btn" id="form-submit-btn" data-upgraded=",MaterialButton,MaterialRipple" xpath="1">Generate<span class="mdl-button__ripple-container"><span class="mdl-ripple"></span></span></button> 		

//		xpath = 1. 	//tagname[@attribute="value"]
// 				   	//button[@id="form-submit-btn"]
//				2. 	untuk value yang berisi / contains
// 					//button[contains(@id,'form-submit-')]
//				3.	* untuk membebaskan tagname apa saja yang muncul
//					//*[@id="form-submit-btn"]
//		sibling 4. 	.//*[@id='tablist1-tab1']/following-sibling::li[2]
//					.//*[@id='tablist1-tab1']/parent::td
//				5. 	//*[text()='Generate']
//		parent and child 
//				6. 	//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'] //a[@value='HYD']
//				or 	//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']/a

//		css = 	1.	tagname[attribute="value"]
//				  	button[id="form-submit-btn"]
//			  	2.	tagname#id
//				  	button#form-submit-btn
//			  	3.	#id
//			   	  	#form-submit-btn
//				4. 	. for class
//					.mdl-button__ripple-container
//			  	5. 	* untuk value yang berisi / contains
//					button[id*="form-submit"]
//		parent 	6. 	li[class='ui-menu-item'] a

//		============================

//		driver.get("https://login.salesforce.com/");
//		driver.findElement(By.id("username")).sendKeys("email@email.com");
//		driver.findElement(By.id("password")).sendKeys("pass");
//		driver.findElement(By.id("Login")).click();
//		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

//		dropdown

//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

//		menlist data dropdown
//		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

//		membuat variable dropdown dari list diatas
//		Select dropdown = new Select(staticDropdown);

//		dropdown.selectByIndex(3);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByVisibleText("AED");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByValue("INR");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		
//		==========================================
//		dropdown click loop

//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(2000);

//		looping while untuk klik 5 kali
//		int i=1;
//		
//		while(i<5)		
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}

//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

//		looping for untuk klik 5 kali
//		for(int i=1;i<5;i++)

//		{
//		driver.findElement(By.id("hrefIncAdt")).click();
//		}

//		driver.findElement(By.id("btnclosepaxoption")).click();
//		
//		assert untuk membandingkan hasil gettext dengan expected
//		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

//		================================
//		dynamic dropdown

//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//	    driver.findElement(By.cssSelector("a[value='DEL']")).click();     
//		driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //*[@value='MAA']")).click();
//		or
//		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
//		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

//		=======================
//		Auto suggest dropdown

//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
//		Thread.sleep(2000);
//	
//		membuat list pada dropdown auto suggest
//		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));	
//	
//		mengklik dropdown
//		for (WebElement option : options)
//		{
//			if(option.getText().equalsIgnoreCase("India"))
//			{
//				option.click();
//				break;
//			}
//		}

//		=======================
//		Checkbox

//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

//		validasi untuk checkbox apakah belum dichecklist
//		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

//		validasi untuk checkbox apakah sudah dichecklist
//		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

//		cek jumlah checkbox
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

//		============================
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();

//		validasi untuk checkbox apakah sudah dichecklist
//		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
//		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
//		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();

//		validasi untuk checkbox apakah belum dichecklist
//		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
//		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());

//		cek jumlah checkbox
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

//		=======================
//		Calender date now

//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
//		Thread.sleep(2000);

//		memilih tanggal date now dengan menggunakan class yang ada highlight dan active
//		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();

//		=========================
//		checking attribute to assert

//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		System.out.println(driver.findElement(By.cssSelector("#Div1")).getAttribute("style"));		
//		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();		
//		System.out.println(driver.findElement(By.cssSelector("#Div1")).getAttribute("style"));

//		jika value berisi 1 berarti dropdown pada web enable
//		if(driver.findElement(By.cssSelector("#Div1")).getAttribute("style").contains("1"))
//		{
//		System.out.println("it's enable");

//		validasi jika benar
//		Assert.assertTrue(true);
//		}else {
//		validasi jika salah
//		Assert.assertTrue(false);
//		}

//		====================
//		alert java script

//		membuat variable name
//		String name="Pedro";

//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.findElement(By.id("name")).sendKeys(name);
//		driver.findElement(By.id("alertbtn")).click();
//		
//		mengeprint alert
//		System.out.println(driver.switchTo().alert().getText());

//		klik ok pada alert
//		driver.switchTo().alert().accept();

//		driver.findElement(By.id("name")).sendKeys(name);
//		driver.findElement(By.id("confirmbtn")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		
//		klik cancel pada alert
//		driver.switchTo().alert().dismiss();

//		=======================
//		assigment 2

//		driver.manage().window().maximize();
//		driver.get("https://www.cleartrip.com/");
//		WebElement staticDropdown = driver.findElement(By.xpath("//*[text()='Adults']/following-sibling::select"));
//		Select dropdown = new Select(staticDropdown);
//		dropdown.selectByIndex(3);
//		System.out.println(driver.findElement(By.xpath("//*[text()='Adults']/following-sibling::select")).getText());
//		Assert.assertEquals(dropdown.selectByIndex(3).gettext(), "4");

// 		=======================
//		ecommerce - global id/class 

////		implicit wait untuk global timeout pada semua action
////		implicit jika maksimum 5 detik dan load lebih cepat jadi 3 detik maka tidak akan menunggu sampai 5 detik
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
////		expilicit wait untuk step tertentu
//		WebDriverWait w = new WebDriverWait(driver,10);
//
////		variable untuk item yang dipilih
//		String[] itemsNeeded = { "Cucumber", "Brocolli", "Tomato", "Beans" };
//
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//
////		memanggil kelas loop additems dan memasukkan variable driver & itemsneeded
//		additems(driver, itemsNeeded);
//
//		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
//		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.cssSelector("button.promoBtn")).click();
//		
////		explicit wait
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
//		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
//	}
//
//// 	looping dimasukkan ke kelas agar lebih rapi main classnya
//	public static void additems(WebDriver driver, String[] itemsNeeded) {
//
//		int j = 0;
////		membuat list untuk semua item yg d find
//		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
//
////		looping untuk semua product di web
//		for (int i = 0; i < products.size(); i++) {
//
//// 			split untuk membagi text ketika diget
//			String[] name = products.get(i).getText().split("-");
//
//// 			menghapus spasi pada list name
//			String formatedname = name[0].trim();
//
////			membuat array list untuk itemneeded
//			List<String> itemsNeededlist = Arrays.asList(itemsNeeded);
//
//			if (itemsNeededlist.contains(formatedname)) {
////				menghitung berapa kali click
//				j++;
//
//				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//
//				// jika sudah click sesuai jumlah itemneeded maka break
//				if (j == itemsNeeded.length) {
//					break;
//				}
//			}
//		}

//		==================
//		assigment 3

//		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
//
//		WebDriverWait w = new WebDriverWait(driver, 10);
//		
//		driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
//		
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
//		
//		System.out.println(driver.findElement(By.id("results")).getText());

//		======================
//		fluent wait

//		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
//
//		driver.findElement(By.cssSelector("a[href*='dynamic_loading/1']")).click();
//
//		driver.findElement(By.cssSelector("div[id='start'] button")).click();
//
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
//
//		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//			public WebElement apply(WebDriver driver) {
//
//				if (driver.findElement(By.id("finish")).isDisplayed()) {
//					return driver.findElement(By.id("finish"));
//				} else {
//					return null;
//				}
//			}
//		});
//
//		System.out.println(driver.findElement(By.id("finish")).getText());

//		====================
//		action mouse
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.amazon.com/");
//		
//		move mouse to element
//		Actions a=new Actions(driver);
//		
//		move mouse to element
//		WebElement move = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
//		
//		a.moveToElement(move).build().perform();
//		
////	capslock
//		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
//		
//		
//		=======================
//		new tab browser

//		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/#");
//		driver.findElement(By.cssSelector(".blinkingText")).click();
//		
////		to handle browser tab
//		Set<String> windows= driver.getWindowHandles();
//		Iterator<String> it= windows.iterator();
//		
////		create object tab
//		String parentId = it.next();
//		String childId = it.next();
//		
////		move to tab 2
//		driver.switchTo().window(childId);
//		
//		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
//		
//		driver.findElement(By.cssSelector(".im-para.red")).getText();
//		
////		trim and get text we need
//		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//		
////		move to tab 1
//		driver.switchTo().window(parentId);
//		
//		driver.findElement(By.id("username")).sendKeys(emailId);

//		======================
//		assigntment 4
//
//		driver.get("https://the-internet.herokuapp.com/");
//		driver.findElement(By.cssSelector("a[href*=windows]")).click();
//		driver.findElement(By.cssSelector("a[href*=windows]")).click();
//
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> it = windows.iterator();
//		String parentId = it.next();
//		String childId = it.next();
//
//		driver.switchTo().window(childId);
//		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
//
//		driver.switchTo().window(parentId);
//		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
//		
//		=====================
////		drag and drop
//		
//		driver.get("https://jqueryui.com/droppable/");
//		
////	to find total frame in web
//		System.out.println(driver.findElements(By.tagName("iframe")).size());
//		
////		swith to frame with index
//		driver.switchTo().frame(0);
//		
////		switch to frame
//		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
//		
////		crate actions class
//		Actions a = new Actions(driver);
//		
////		create source variable
//		WebElement source = driver.findElement(By.id("draggable"));
//		
////		create target variable
//		WebElement target = driver.findElement(By.id("droppable"));
//		

//		a.dragAndDrop(source, target).build().perform();
//
////		switch back to default web
//		driver.switchTo().defaultContent();
//		

//		==================
//		assigment 5

//		driver.get("https://the-internet.herokuapp.com");
//		driver.findElement(By.cssSelector("a[href*='nested']")).click();
////		if attribute use name, just write the value - .frame(driver.findElement(By.cssSelector("frame[name='frame-top'])")) > frame('frame-top') 
//		driver.switchTo().frame("frame-top");
//		driver.switchTo().frame("frame-middle");
//		System.out.println(driver.findElement(By.cssSelector("#content")).getText());
//		
//		==================
//		count link in web

//		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//		
//		System.out.println(driver.findElements(By.tagName("a")).size());
//		
////		limit scope from driver
//		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
//		
//		System.out.println(footerdriver.findElements(By.tagName("a")).size());
//		
////		limit scope to specific
//		WebElement coloumfooterdriver=driver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
//		
////		list object link
//		List<WebElement> linkindisc = coloumfooterdriver.findElements(By.tagName("a"));
//		
//		System.out.println(linkindisc.size());
//		
////		looping for click every link
//		for (int i=1;i<linkindisc.size();i++) {
//			
////			object to click and open in new tab
//			String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
//			
//			linkindisc.get(i).sendKeys(clickonlinktab);
//			
//			Thread.sleep(5000);
//		}
////			object for handle tab
//			Set <String> tab=driver.getWindowHandles();
//			Iterator<String> ittab=tab.iterator();
//		
////			looping for get title all tab
//			while(ittab.hasNext()) {
//				
//				driver.switchTo().window(ittab.next());
//				
//				System.out.println(driver.getTitle());						
//			}

//		========================
//		assignment 6

//		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//		
//		driver.findElement(By.id("checkBoxOption2")).click();
//		
//		variable option checklist
//		String opt2 = driver.findElement(By.cssSelector("label[for='benz']")).getText();
//		
//		System.out.println(opt2);
//			
//		variable dropdown
//		List<WebElement> dropdown = driver.findElements(By.cssSelector("select option"));
//		
//		looping for checking if variable option is available
//		for (WebElement option : dropdown)
//			{
//				if(option.getText().equals(opt2))
//				{
//					option.click();
//					break;
//				}
//			}
//		
//		driver.findElement(By.id("name")).sendKeys(opt2);
//		
//		driver.findElement(By.id("alertbtn")).click();
//		
//		variable alert with split to get specific text
//		String alerts = driver.switchTo().alert().getText().split(",")[0].split(" ")[1];
//		
//		System.out.println(alerts);
//		
//		assert for match variable alerts and opt2
//		Assert.assertEquals(alerts, opt2);

//		by mentor

//		driver.get("http://qaclickacademy.com/practice.php");
//
//		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
//
////      variable option checklist
//		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
//
////      variable dropdown
//		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
//
////      variable select dropdown
//		Select s = new Select(dropdown);
//
////      select dropdown with variable opt
//		s.selectByVisibleText(opt);
//
//		driver.findElement(By.name("enter-name")).sendKeys(opt);
//
//		driver.findElement(By.id("alertbtn")).click();
//
//		String text = driver.switchTo().alert().getText();
//
////   	assert for match alert with variable opt
//		if (text.contains(opt))
//
//		{
//
//			System.out.println("Alert message success");
//
//		}
//
//		else
//
//			System.out.println("Something wrong with execution");
//
//	}
// 		System.out.println(driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());

//		=========================
//		Select Calendar

//		driver.get("https://www.path2usa.com/travel-companions");
//		driver.findElement(By.id("travel_date")).click();
//		
////		looping click next for search december
//		while(!driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).getText().contains("December"))
//		{
//			driver.findElement(By.cssSelector(".datepicker-days .next")).click();
//		}
//		
//		
////		Create list object date
//		List<WebElement> dates = driver.findElements(By.className("day"));
//		
////		Create size days
//		int counts = driver.findElements(By.className("day")).size();
//		
////		looping for search date
//		for(int i=0;i<counts;i++)
//		{
//			String text = driver.findElements(By.className("day")).get(i).getText();
//			
//			if(text.equalsIgnoreCase("18"))
//			{
//				driver.findElements(By.className("day")).get(i).click();
//				break;
//			}
//		}

//		=============================
//		java script handle

//		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//		
////		driver change to js handler
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
////		scroll window
//		js.executeScript("window.scrollBy(0,500)");
//		
////		scroll specific table
//		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
//		
////		create list object
//		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
//		
//		int sum = 0;
//		
//		for(int i=0;i <values.size();i++)
//		{
////		change string to int and sum
//		sum = sum + Integer.parseInt(values.get(i).getText());
//		}
//		
//		System.out.println(sum);
//		
//		driver.findElement(By.cssSelector(".totalAmount")).getText();
//		
////		create value from strinto int
//		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
//		
//		Assert.assertEquals(sum, total);

//		=========================
//		Assignment 7

//		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//		
//		System.out.println(driver.findElements(By.cssSelector(".table-display th")).size());
//		
//		System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size());
//		
//		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());
//		
////		============
////		by mentor
//		
//		driver.get("http://qaclickacademy.com/practice.php");
//
////		create variable table
//		WebElement table=driver.findElement(By.id("product"));
//
//		System.out.println(table.findElements(By.tagName("tr")).size());
//
//		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//
////		create list variable row
//		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//
//		System.out.println(secondrow.get(0).getText());
//
//		System.out.println(secondrow.get(1).getText());
//
//		System.out.println(secondrow.get(2).getText());

//		===================
//		assignment 8

//		driver.get("http://qaclickacademy.com/practice.php");

//		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
//
//		Thread.sleep(2000);
//
////		membuat list pada dropdown auto suggest
//		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
//
////		mengklik dropdown
//		for (WebElement option : options) {
//
////			menklik button down pada keyboard
//			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//
//			if (option.getText().contains("Indonesia"))
//
//			{
//
////				getattribute untuk mendapatkan text selain gettext
//				System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
//
//				break;
//			}
//		}
		
//		===================
//		ssl certificates
		
//		//Desired capabilities=
//		//general chrome profile
//		DesiredCapabilities ch=DesiredCapabilities.chrome();
//		//ch.acceptInsecureCerts();
//		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//
//		//Belows to your local browser
//		ChromeOptions c= new ChromeOptions();
//		c.merge(ch);
//		System.setProperty("webdriver.chrome.driver", "");
//		WebDriver driver1=new ChromeDriver(c);
		
		
//		====================
//		screen shot 
		
//		url driver screenshot https://commons.apache.org/proper/commons-io/
		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		driver.get("https://www.google.com/");
//		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(src, new File("C:\\Users\\lenovo\\Documents\\Selenium\\Screenshot\\img.jpg"));
		
//		================
//		check connection url
		
//		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//		
////		list link
//		 List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
//
////		 object soft assert
//	      SoftAssert a = new SoftAssert();
//
//	      for(WebElement link : links)
//	      {
//	          String url = link.getAttribute("href");
//	          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
//	          conn.setRequestMethod("HEAD");
//	          conn.connect();
//	          int respCode = conn.getResponseCode();
//	          System.out.println(respCode);
//
////	          validation response
//	          a.assertTrue(respCode<400, "The link with text "+link.getText()+" is broken with code " +respCode);
//	      }
//
////	      to print assert
//	      a.assertAll();
		
		

		
		
		
		
		
		
		


	}
	

}

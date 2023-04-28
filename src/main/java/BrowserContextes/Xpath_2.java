package BrowserContextes;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Xpath_2 {
	static Page page;
	public static void main(String[] args) {
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  page = context.newPage();
		  page.navigate("https://selectorshub.com/xpath-practice-page/");

		 
//		 page.locator("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")
//		 				.click();

//		 Locator Checkboxes = page.locator("//table[@id='resultTable']//input[@type='checkbox']");
//		 
//		 for(int i =0; i< Checkboxes.count(); i ++) {
//			 Checkboxes.nth(i).click();
//			 
//		 }
		  page.locator("(//table[@id='resultTable']//input[@type='checkbox'])[2]")
			.click();
		  
		  page.locator("(//table[@id='resultTable']//input[@type='checkbox'])[last()]")
			.click();
	}

}

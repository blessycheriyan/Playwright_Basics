package BrowserContextes;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TextSelectors_running {
	public static void main(String[] args) {
	
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  Page page = context.newPage();
		  
		  page.navigate("https://demo.opencart.com/index.php?route=account/login&language=en-gb");

//		  String header = page.locator("h2:has-text('New Customer')").textContent();
		  // div method -another approach
		  String header = page.locator("div.card-body h2:has-text('New Customer')").textContent();
		  System.out.println(header);
		  //another text approach 
//		  String pageheader = page.locator("text = Returning Customer").first().textContent();
		  String pageheader = page.locator("'Returning Customer'").textContent();
		  System.out.println(pageheader);
		  
		  // Button 
		  page.locator("form button:has-text('Login')").click();
		

//	}
//
//			
		

}
}
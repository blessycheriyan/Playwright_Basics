package BrowserContextes;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ShadowDom {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  Page page = context.newPage();
//		  page.navigate("https://books-pwakit.appspot.com/");
//		  page.locator("book-app[apptitle='BOOKS'] #input").fill("Testing Books");
//		  String text = page.locator("book-app[apptitle='BOOKS'] .books-desc").textContent();
//		  System.out.println(text);
		  
		  page.navigate("https://selectorshub.com/shadow-dom-in-iframe/");
		  page.frameLocator("#pact").locator("div#snacktime #tea").fill("Ginger Masala Tea");
		  

	}

}

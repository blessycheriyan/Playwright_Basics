package BrowserContextes;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class RelaiveCss_2 {
	static Page page;

	public static void main(String[] args) {
		 Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  page = context.newPage();
		  page.navigate("http://automationpractice.pl/index.php");
	
		  page.locator("input:near(:text('Newsletter'))").fill("bless@gmail.com");
		  
		  
		  String price = page.locator("span.price.product-price:below(:text('Faded Short Sleeve T-shirts'))")
				.first().innerText().trim();
		  System.out.println(price);
	}

}

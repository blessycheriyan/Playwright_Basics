package BrowserContextes;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Comple_Dynamic_2 {
	static Page page;
	public static void main(String[] args) {
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  page = context.newPage();
		  page.navigate("https://primeng.org/");
		  
		  Locator row = page.locator("table#pr_id_1-table tr");
		  row.locator(":scope", new Locator.LocatorOptions()
				  .setHasText("James Butt"))
		  		   .locator(".p-checkbox-box")
		  		   .click();
		  row.locator(":scope").allInnerTexts().forEach(e -> System.out.println(e));
	}

}

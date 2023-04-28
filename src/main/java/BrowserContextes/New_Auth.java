package BrowserContextes;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class New_Auth {
	static Page page;
	public static void main(String[] args) {
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		  

		  BrowserContext context =  browser.newContext(new Browser.NewContextOptions().setStorageStatePath(Paths.get("applogin.json")));
		  

		  page = context.newPage();
		  page.navigate("http://automationpractice.pl/index.php");
	}

}

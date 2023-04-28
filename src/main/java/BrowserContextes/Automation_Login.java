package BrowserContextes;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Automation_Login {
	static Page page;
	public static void main(String[] args) {
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  page = context.newPage();
		  page.navigate("http://automationpractice.pl/index.php");
		  
		  page.click("a:text('Sign in')");
		  page.fill("#email", "testrigornaveen@gmail.com");
		  page.fill("#passwd", "testrigor123");
		  page.click("#SubmitLogin");
		  
		  context.storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("applogin.json")));
		  
		  
		  
	}

}

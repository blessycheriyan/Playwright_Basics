package BrowserContextes;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class frameshandling {

	public static void main(String[] args) {
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  Page page = context.newPage();
		  page.navigate("http://www.londonfreelance.org/courses/frames/index.html");
		  
//		  String header =  page.frameLocator("frame[name='main']").locator("h2").textContent();
		  String header =  page.frameLocator("//frame[@name='main']").locator("h2").textContent();
		  //Another approach
//		  String header =page.frame("main").locator("h2").textContent();

		  System.out.println(header);
		

	}

}

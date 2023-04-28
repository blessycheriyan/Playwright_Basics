package playwrightsessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class playwrightBasics {

	public static void main(String[] args) {
	
		Playwright playwright = Playwright.create();
//		Browser browser = playwright.chromium().launch();
//		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
//		Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
//		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		 LaunchOptions  lp = new LaunchOptions();
//		 lp.setChannel("chrome");
//		 lp.setChannel("msedge");
		 lp.setChannel("firefox");
		 lp.setHeadless(false);
//		 Browser browser = playwright.chromium().launch(lp);
		 Browser browser = playwright.firefox().launch(lp);
		 Page page = browser.newPage();
         page.navigate("https://www.amazon.in/");
         String title = page.title();
         System.out.println("Page Title is: " + title );
         
         String url = page.url();
         System.out.println("Page Url is: " + url );
         
         browser.close();
         playwright.close();
		
	}

}

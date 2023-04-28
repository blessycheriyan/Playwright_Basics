package BrowserContextes;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Video_Recording {

	public static void main(String[] args) {
		 Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext(
				  new Browser.NewContextOptions().setRecordVideoDir(Paths.get("myvideos/")).setRecordVideoSize(640,480));
		  Page page = context.newPage();
		   page.navigate("http://automationpractice.pl/index.php");
		   page.fill("#search_query_top", "Dress");
		   System.out.print(page.title());
		   
		   
		   BrowserContext context1 = browser.newContext();
		   Page page1 = context1.newPage();
		   page1.navigate("http://google.com");
		  
		   System.out.print(page.title());
		

	}

}

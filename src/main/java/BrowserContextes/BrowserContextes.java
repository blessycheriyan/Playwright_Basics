package BrowserContextes;
import com.microsoft.playwright.*;

public class BrowserContextes {

	public static void main(String[] args) {
		   Playwright playwright = Playwright.create();
		   Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		   BrowserContext context = browser.newContext();
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

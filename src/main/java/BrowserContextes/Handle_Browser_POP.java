package BrowserContextes;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
public class Handle_Browser_POP {
	public static void main(String[] args) {
		 Playwright playwright = Playwright.create();
		   Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		   BrowserContext context = browser.newContext();
//		   Page page = context.newPage();
//		   page.navigate("http://automationpractice.pl/index.php");
//		   
		   Page page2 = context.newPage();
		   page2.navigate("https://www.amazon.in/");
		   Page popuPage = page2.waitForPopup(() ->{
			   page2.click("img[alt='Bluetooth Calling Smartwatch starts at ₹1,999']");
		   });
		   popuPage.waitForLoadState();
		   System.out.println("popup page" + popuPage.title());
		   popuPage.close();
		   System.out.println("After return page" + page2.title());
		   page2.close();
		   
		   
//		   Page popuPage = page2.waitForPopup(() ->{
//			   page2.click("a[target='_blank']");
//		   });
//		   popuPage.waitForLoadState();
//		   page2.navigate("https://www.google.com/");
//		   System.out.println("popup page" + popuPage.title());
//		   popuPage.close();
//		   System.out.println("After return page" + page2.title());
//		   page2.close();

}
}

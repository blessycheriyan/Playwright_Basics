package BrowserContextes;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class SelectingVisible {

	public static void main(String[] args) {
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  Page page = context.newPage();
		  
//		  page.navigate("http://127.0.0.1:5500/Tricks/index.html");
////		  String text = page.locator("button:visible").textContent();
//		  String text = page.locator("button >> visible=true").textContent();
//		  System.out.println(text);
		  
		  page.navigate("https://www.amazon.in/");
//		  List <String> texts = page.locator("a:visible").allInnerTexts();
//		
//		  for (int i =0; i< texts.size(); i++) {
//			  System.out.println(texts.get(i));
//		  }
//		  
//		  int Imagescount = page.locator("xpath=//img >> visible=true").count();
//		  System.out.print(Imagescount);
		  
		  
		  List <String> linklist = page.locator("a:has-text('Amazon')").allInnerTexts();
		  linklist.stream().forEach(e -> System.out.println(e));
	}

}

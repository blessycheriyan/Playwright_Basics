package BrowserContextes;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Xpath_Locator {
	static Page page;
	public static void main(String[] args) {
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  page = context.newPage();
		  page.navigate("https://www.amazon.in/");
	
//		  page.locator("xpath =//input[@id='twotabsearchtextbox']").fill("Apple phone");
		 
		  Locator Total_Amazon_Links = page.locator("//a[contains(text(),'Amazon')]");
		  System.out.println(Total_Amazon_Links.count());
		  List<String> textlist = Total_Amazon_Links.allInnerTexts();
		  for(String e : textlist) {
			  System.out.println(e);
		  }
		  
	
		}

}

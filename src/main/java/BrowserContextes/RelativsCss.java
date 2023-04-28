package BrowserContextes;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class RelativsCss {
	static Page page;

	public static void main(String[] args) {
		 Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  page = context.newPage();
		  page.navigate("https://selectorshub.com/xpath-practice-page/");
		  
//		  page.locator("input[type='checkbox']:left-of(:text('Joe.Root'))").first().click();
		  
//		  selectUser("Joe.Root");
//		  selectUser("Jasmine.Morgan");
//		  
//		  System.out.println(getUser("Joe.Root"));
		  
		  String above = page.locator("a:above(:text('Joe.Root'))").first().textContent();
		  System.out.println(above);
		  
		  String below = page.locator("a:below(:text('Joe.Root'))").first().textContent();
		  System.out.println(below);
		  
		  Locator NearElem = page.locator("td:near(:text('Joe.Root'),400)");
		  
		  List<String> near = NearElem.allInnerTexts();
		  for(String e:near ) {
			  System.out.println(e);
		  }
}	
		  
	public static void selectUser(String Username) {	
		  
		 page.locator("input[type='checkbox']:left-of(:text('"+Username+"'))").first().click();
		  
	}	
	
	public static String getUser(String Username) {	
		  
		 return page.locator("td:right-of(:text('"+Username+"'))").first().textContent();
		  
	}	
	
}


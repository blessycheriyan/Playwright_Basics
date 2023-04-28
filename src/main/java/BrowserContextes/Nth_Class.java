package BrowserContextes;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Nth_Class {
	static Page page;

	public static void main(String[] args) {
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  page = context.newPage();
		  page.navigate("https://www.bigbasket.com/");
	
		  Locator about = page.locator("div.footer-links li a >> nth=0");
		  String about_s =  about.textContent();
		  about.click();
		  System.out.println(about);
		  

		  String last = page.locator("div.footer-links li a >> nth=-1").textContent();
		  System.out.println(last);

	}

}

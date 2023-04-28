package BrowserContextes;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MaximizeBrowser {

	public static void main(String[] args) {
		  Dimension screensizeDimension = Toolkit.getDefaultToolkit().getScreenSize();
		  int width = (int)screensizeDimension.getWidth();
		  int height = (int)screensizeDimension.getHeight();
		  System.out.println(width + ":" +height);
		  
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(780,1080));
		  Page page = context.newPage();
		  page.navigate("https://www.amazon.in/");
	}

}

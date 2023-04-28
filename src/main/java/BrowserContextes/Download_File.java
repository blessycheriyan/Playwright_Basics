package BrowserContextes;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Download_File {

	public static void main(String[] args) {
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  Page page = context.newPage();
		  page.navigate("https://chromedriver.storage.googleapis.com/index.html?path=113.0.5672.24/");
		  
		  Download download =  page.waitForDownload(()->{
			  page.click("a:text('chromedriver_mac64.zip')");
		  });
		  System.out.println(download.failure());
		  System.out.println(download.url());
//		  System.out.println(download.page().title());
		  String path = download.path().toString();
		  System.out.println(path);
		  
		  download.saveAs(Paths.get("Naveen,zip"));
		  System.out.println(download.suggestedFilename());
		  
	}

}

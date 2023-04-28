package BrowserContextes;

import java.nio.charset.StandardCharsets;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.FilePayload;

public class File_Upload_2 {

	public static void main(String[] args) {
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  Page page = context.newPage();
		  page.navigate("https://cgi-lib.berkeley.edu/ex/fup.html");
		  
		  page.setInputFiles("input[name='upfile']", new FilePayload("naveen.txt", 
				  "text/plain", "this is naveen here".getBytes(StandardCharsets.UTF_8))

		  );
		  page.click("input[value ='Press']");
		  

	}

}

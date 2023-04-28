package BrowserContextes;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Dialog;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Handle_Javascript {

	public static void main(String[] args) throws InterruptedException {

		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  Page page = context.newPage();
//		  page.onDialog(dialog ->{
//			  String text = dialog.message();
//			  System.out.println(text);
//			  dialog.accept();
//		  });
		  page.onDialog(dialog ->{
			  String text1 = dialog.message();
			  System.out.println(text1);
			  dialog.accept("Hello Bless !");
		  });
		  
		  
		  page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
		  page.click("//button[text()='Click for JS Alert']");
		  Thread.sleep(3000);
		  
		  String res = page.textContent("#result");
		  System.out.println(res);
		  page.click("//button[text()='Click for JS Confirm']");
		  
		  
		 
		  String res3 = page.textContent("#result");
		  System.out.println(res3);
		  page.click("//button[text()='Click for JS Prompt']");
		  Thread.sleep(3000);
		  
		  String res2 = page.textContent("#result");
		  System.out.println(res2);
		  
		  page.close();
		  browser.close();
		  playwright.close();

	}

}

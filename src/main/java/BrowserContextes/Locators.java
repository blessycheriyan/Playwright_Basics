package BrowserContextes;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Playwright playwright = Playwright.create();
		   Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		   BrowserContext context = browser.newContext();
		   Page page = context.newPage();
//		   page.navigate("http://automationpractice.pl/index.php");
//		   Locator contactus = page.locator("text = Contact us");
//		   contactus.hover();
//		   contactus.click();
		   
		   page.navigate("https://www.orangehrm.com/hris-hr-software-demo/");
		   Locator countryOptions = page.locator("select#Form_getForm_Country option");
		   System.out.print(countryOptions.count());
		   
//		   for (int i = 0; i < countryOptions.count() ; i++) {
//			   String text =countryOptions.nth(i).textContent();
//			   System.out.println(text);
//			 }
//		   
		   // Another Approach ------
		   List<String> optionsTextList = countryOptions.allTextContents();
//		   for (String e: optionsTextList) {
//			   System.out.println(e);
//		   }
		   
		   optionsTextList.forEach(ele ->System.out.println(ele));
			   
	}

}

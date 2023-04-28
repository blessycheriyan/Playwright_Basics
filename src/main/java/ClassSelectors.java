import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ClassSelectors {

	public static void main(String[] args) {
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  Page page = context.newPage();
		  page.navigate("https://academy.naveenautomationlabs.com/");
//		  
//		  page.locator(" a:has-text('Login'),"
//		  		+ "a:has-text('login')").click();
//		  
		 
		  Locator imp_ele = 
				  page.locator(" a:has-text('Login'),"
			  		+ "a:has-text('EXPLORE COURSES')");
		  System.out.println(imp_ele.count());
		  
		  if(imp_ele.count() == 2) {
			  System.out.println("Pass");
		  }
		  else
			  System.out.println("Failed TestCase");
	}

}


//mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen https://academy.naveenautomationlabs.com/"


		
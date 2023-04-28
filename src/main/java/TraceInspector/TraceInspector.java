package TraceInspector;

	import com.microsoft.playwright.*;
	import com.microsoft.playwright.options.*;
	import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;
import java.util.*;


public class TraceInspector {

	  public static void main(String[] args) {
	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      BrowserContext context = browser.newContext();
	      

	   // Start tracing before creating / navigating a page.
	   context.tracing().start(new Tracing.StartOptions()
	     .setScreenshots(true)
	     .setSnapshots(true)
	     .setSources(true));
	      
	      Page page = context.newPage();
	      page.navigate("https://academy.naveenautomationlabs.com/");
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Login")).click();
	      page.frameLocator("#microfe-popup-login").getByText("Sign up").click();
	      page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").click();
	      page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").fill("naveen");
	      page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").click();
	      page.frameLocator("#microfe-popup-login").getByPlaceholder("Email address").click();
	      page.frameLocator("#microfe-popup-login").getByPlaceholder("Email address").fill("naveen@gmial.com");
	      page.frameLocator("#microfe-popup-login").getByPlaceholder("Password").click();
	      page.frameLocator("#microfe-popup-login").getByPlaceholder("Password").fill("123456");
	      page.frameLocator("#microfe-popup-login").getByText("Log in").click();
	   // Stop tracing and export it into a zip archive.
		  context.tracing().stop(new Tracing.StopOptions()
		    .setPath(Paths.get("trace.zip")));
		}

	    }
	  }
	

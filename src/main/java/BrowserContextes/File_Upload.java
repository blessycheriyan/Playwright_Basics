package BrowserContextes;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.FilePayload;

public class File_Upload {

	public static void main(String[] args) throws InterruptedException {
		  Playwright playwright = Playwright.create();
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		  BrowserContext context = browser.newContext();
		  Page page = context.newPage();
		  page.navigate("https://davidwalsh.name/demo/multiple-file-upload.php");
		  // Single file
//		  page.setInputFiles("input#filesToUpload", Paths.get("applogin.json"));
//		  Thread.sleep(4000);
//		  
//		  page.setInputFiles("input#filesToUpload", new Path[0]);
		  //Multiple file 
//		  page.setInputFiles("input#filesToUpload", new Path[]
//				  {
//					  Paths.get("applogin.json"),
//					  Paths.get("app.json")
//				  }
//		  );
		  
		  // run time

		  page.setInputFiles("input#filesToUpload", new FilePayload("naveen.txt", 
				  "text/plain", "this is naveen here".getBytes(StandardCharsets.UTF_8))

		  );
		  
		  
		  
	}

}

package Autotest;



import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class Autotest{
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("https://academy.naveenautomationlabs.com/");
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Login")).click();
      page.frameLocator("#microfe-popup-login").getByText("Sign up").click();
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").click();
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").fill("testingautomation");
      page.frameLocator("#microfe-popup-login").getByText("Next Continue with GoogleAlready have an account? Log inBy continuing, you agree").click();
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").click();
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").click();
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").click(new Locator.ClickOptions()
        .setModifiers(Arrays.asList(KeyboardModifier.CONTROL)));
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").click();
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").click();
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Email address").click();
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Email address").fill("testingautomation@gmail.com");
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Password").click();
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Password").click();
      page.frameLocator("#microfe-popup-login").getByPlaceholder("Password").fill("12345");
    }
  }
}


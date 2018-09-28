package StepDefinitions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
		System.out.println( "Hello World!" );  
	}
	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
	        cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	        cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);   
	}
	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
		 File file = new File("C:\\Users\\bkumar65\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
	        @SuppressWarnings("deprecation")
			WebDriver driver = new InternetExplorerDriver(cap);
	        driver.get("https://www.google.co.in");
	        driver.quit();
	}
}
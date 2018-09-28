package AMIL.tst;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
        cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
        File file = new File("C:\\Users\\bkumar65\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        @SuppressWarnings("deprecation")
		WebDriver driver = new InternetExplorerDriver(cap);
        driver.get("https://www.google.co.in");
      
    }
}

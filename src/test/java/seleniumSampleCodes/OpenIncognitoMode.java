package seleniumSampleCodes;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.session.CapabilityTransform;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenIncognitoMode {

	public static void main(String[] args) {
	
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver(capabilities);
		driver.get("https://chercher.tech/java/incognito-browser-selenium");
	    System.out.println(driver.getTitle());
		
		

	}

}

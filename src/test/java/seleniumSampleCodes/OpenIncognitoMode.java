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
	
		 //setting up capabilities class 
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
		// and then setting up chrome option class 
		ChromeOptions options = new ChromeOptions();
		
		// setting browser property in incognito mode
		options.addArguments("--incognito");
		
		//passing chrome option object into capabilites 
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		// webdriver setup 
		WebDriverManager.chromedriver().setup();
		
		//launching the desired browser in incoginto mode
		WebDriver driver =new ChromeDriver(capabilities);
		driver.get("https://chercher.tech/java/incognito-browser-selenium");
	    System.out.println(driver.getTitle());
		
		

	}

}

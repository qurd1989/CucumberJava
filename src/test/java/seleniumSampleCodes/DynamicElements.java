package seleniumSampleCodes;

import java.awt.List.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DynamicElements {

	public static void main(String[] args) throws SQLException {

	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.worldometers.info/world-population/");
		
	while(true){
		List<WebElement> popList = driver.findElements(By.xpath("//div[@class='maincounter-number']"));
		
	
		for(WebElement e: popList) {
			System.out.println(e.getText());
		}
	}
	
	}
	}



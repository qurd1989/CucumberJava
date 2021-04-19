package seleniumSampleCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class MultipleNumbersInGoogle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver dr = new ChromeDriver();
			
		dr.get("https://www.google.com/");
	
		//open google and get search 
		WebElement element = dr.findElement(By.name("q"));

		//send 5*5*5 =125 on search
		element.sendKeys(Keys.ENTER, "5*5*5",Keys.ENTER);
	

		//get XPath and use text() to get text from Xpath and used Descendant Technicque 
		WebElement element2 =dr.findElement(By.xpath("//*[@class='z7BZJb XSNERd']//*[contains(@id,'cwos')]"));
		//used is statment to validate the numbers
		if(element2.getText().equals("125")) {
			System.out.println("Number is Validated");
		}else {
			System.out.println("Invalid Number");
		}
		
		
		
	}

}

package practice3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart_Test {
	
	@Test
	public void dropDown() {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement drop=driver.findElement(By.xpath("//a[@class=\"_6WOcW9\"]"));
		
		Select select=new Select(drop);
		
		List<WebElement>allOptions=select.getOptions();
		
		System.out.println(allOptions);
		System.out.println(driver.getTitle());
	}

}

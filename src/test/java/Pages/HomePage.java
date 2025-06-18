package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods {

	public HomePage (WebDriver driver)
	{
		HomePage.driver = driver;
	}
	
	public AlcoholTypesPage enteringpage()
	{
	   driver.findElement(By.xpath("//div[text()='Get started']")).click();
	   return new AlcoholTypesPage(driver);
	
	}
}

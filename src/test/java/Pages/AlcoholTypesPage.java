package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.ProjectSpecificationMethods;

public class AlcoholTypesPage extends ProjectSpecificationMethods{
	public AlcoholTypesPage (WebDriver driver)
	{
		AlcoholTypesPage.driver = driver;
	}
	
	public GinPage productclick()
	{
		driver.findElement(By.xpath("//div[text()='Gin']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Continue')]")).click();
		return new GinPage(driver);
		
	}

}

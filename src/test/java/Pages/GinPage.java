package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 

import Base.ProjectSpecificationMethods;

public class GinPage extends ProjectSpecificationMethods {
	public GinPage (WebDriver driver)
	{
		GinPage.driver = driver;
	}
	
	public void ginpagevalidation()
	{
		String expectedtitle = driver.findElement(By.xpath("//div[text()=\"Showing results for 'Gin'\"]")).getText();
		String actualtitle = "Showing results for 'Gin'";
		if(expectedtitle==actualtitle)
		{ System.out.println("Gin page successfully opened"); }
		else 
		{ System.out.println("Gin page failed to open"); }
		return ;
	}
	public GinPage productsearchtest() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Search')]")).sendKeys("aviation");
		Thread.sleep(100);
		String actualtext = driver.findElement(By.xpath("//h2[text()='Aviation']")).getText();
		String expectedtext = "Aviation";
         if(actualtext==expectedtext)
         {System.out.println("Displays the CORRECT product");}
         else
         {System.out.println("Displays the WRONG product");}
		return this;
	}
	public ProductPage test()
	{
		driver.findElement(By.xpath("//h2[text()='Aviation']")).click();
		
		return new ProductPage(driver);
		
	}
}

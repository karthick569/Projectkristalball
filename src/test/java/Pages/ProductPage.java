package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.ProjectSpecificationMethods;

public class ProductPage extends ProjectSpecificationMethods{

	public ProductPage (WebDriver driver)
	{
		ProductPage.driver = driver;
	}
	
	public FeedbackPage feedback()
	{
		Actions mouse = new Actions (driver);
		WebElement feedback = driver.findElement(By.xpath("//p[contains(text(),'Feedback')]"));
		mouse.moveToElement(feedback).click(feedback).perform();
		return new FeedbackPage(driver);
	}
}

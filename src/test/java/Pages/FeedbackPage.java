package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.ProjectSpecificationMethods;

public class FeedbackPage extends ProjectSpecificationMethods{

	public FeedbackPage (WebDriver driver)
	{
		FeedbackPage.driver = driver;
	}

	 public void feedbacktest() throws InterruptedException
	 {
		 String actualtext = driver.findElement(By.xpath("//h6[text()='Feedback']")).getText();
		 String expectedtext = "Feedback";
		 if(actualtext==expectedtext)
		 {   System.out.println("Feedback page is successfully opened");  }
		 else
		 {   System.out.println("Feedback page is successfully opened");  }
			 
		WebElement name = driver.findElement(By.xpath("//input[@maxlength='30']"));
		name.click();
		name.sendKeys("Santhish");
		
		WebElement email = driver.findElement(By.xpath("//input[@maxlength='50']"));
		email.click();
		email.sendKeys("santhish90@gmail.com");
		
		WebElement emoji = driver.findElement(By.xpath("//div[@tabindex='0'][1]"));
		emoji.click();
		
		WebElement comment = driver.findElement(By.xpath("//textarea[@maxlength='400']"));
		comment.click();
		comment.sendKeys("It is nice to drink"); 
		
		driver.findElement(By.xpath("//div[@role='button']")).click();
		 Alert alert = driver.switchTo().alert();
		 String actualalert = alert.getText();
		 System.out.println(actualalert);
		
	 }
	 public void missedvaluefeedbacktest()
	 {
		 driver.findElement(By.xpath("//div[@role='button']")).click();
		 Alert alert = driver.switchTo().alert();
		 String actualalert = alert.getText();
		 String expectedalert ="Please give your comments";
		 if(actualalert==expectedalert)
		 {
			 System.out.println("It prevents feedbaack submission with missed values");
		 }
		 else
		 {
			 System.out.println("It not prevents feedbaack submission with missed values");
		 }
	 }
	
}

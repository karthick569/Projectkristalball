package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Pages.GinPage;

public class TC_001_VerifyProductSearchTest extends ProjectSpecificationMethods 
{
	@BeforeTest
	public void setup()
	{
		testName ="VerifyProductSearchTest";
		testDescription = "Testing that it displays correct product";
		testAuthor = "Karthick";
		testCategory = "Accessibility Testing";
	}

	@Test
	public void VerifyProductSearchTest() throws InterruptedException
	{
		GinPage obj = new GinPage(driver);
        
		obj.ginpagevalidation();
		obj.productsearchtest();
		
		
	}
}

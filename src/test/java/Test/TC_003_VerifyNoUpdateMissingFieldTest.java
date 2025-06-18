package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Pages.FeedbackPage;

public class TC_003_VerifyNoUpdateMissingFieldTest extends ProjectSpecificationMethods {

	@BeforeTest
	public void setup()
	{
		testName ="VerifyNoUpdateMissingFieldTest";
		testDescription = "Testing that app prevents submitting feedback with missed values";
		testAuthor = "Karthick";
		testCategory = "Accessibility Testing";
	}

	@Test
	public void VerifyNoUpdateMissingFieldTest()
	{
		FeedbackPage obj = new FeedbackPage(driver);
		obj.missedvaluefeedbacktest();

	}

}

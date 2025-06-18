package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Pages.FeedbackPage;

public class TC_002_VerifySuccessfullFeedbackUpdateTest extends ProjectSpecificationMethods {
 
	@BeforeTest
	public void setup()
		{
			testName ="VerifySuccessfullFeedbackUpdateTest";
			testDescription = "Testing that user can successfully update the feedback";
			testAuthor = "Karthick";
			testCategory = "Accessibility Testing";
		}
	
 	@Test
		public  void VerifySuccessfullFeedbackUpdateTest() throws InterruptedException
		{
			FeedbackPage obj = new FeedbackPage(driver);
			obj.feedbacktest();
     	}

}

package Base;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utils.UtilityClass;

public class ProjectSpecificationMethods extends UtilityClass {

	
    public void LaunchAndLoadUrl()
    {
  	  BrowserLaunch();
    }
	
    
    public void BrowserClose()
    {
  	  BrowserClose();
    }
    
   
	public void ReportInitialization()
	{
		String path = "C:\\Users\\hey\\eclipse-workspace\\Projectkristalball\\Report";
		ExtentSparkReporter reporterobj = new ExtentSparkReporter(path);
		reporterobj.config().setReportName("KristalballTestReport");
		
		  extent = new ExtentReports();
  		extent.attachReporter(reporterobj);
		
	}
  
    
	public void testdetails()
	{
		test = extent.createTest(testName, testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);
	}
  
    
    
    public void reportClose ()
    {
    	extent.flush();
    }
    
}

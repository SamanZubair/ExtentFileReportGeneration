package Pages;

import Lib.Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

import java.io.File;

public class BaseClass {

   // public ExtentTest test;
    public ExtentReports report;
    @BeforeSuite
    public void startTestSuite()
    {
   //     report = new ExtentReports((System.getProperty("user.dir") + "/Reports/"+ Utility.getCurrentDateTime() +".html"));
   //     test = report.startTest("ExtentDemo");
    }

    @BeforeClass
    public void startTest()
    {
        System.out.println("Test Started");
        report = new ExtentReports((System.getProperty("user.dir") + "/Reports/"+ Utility.getCurrentDateTime() +".html"));

    }

   // @AfterClass
  //  public void endTest()
   // {
   //     System.out.println("Test Started");
  //  }

    @AfterClass
    public void tearDownTestSuite()
    {
       // report.endTest(test);
        report.flush();
    }

}

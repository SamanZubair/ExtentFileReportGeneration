import Lib.Utility;
import Pages.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;

public class PageTest01 extends BaseClass {

    @BeforeMethod
    public void setUp(){
    }

    @Test(priority = 1 )
    public  void enterDestinationDetailsTest()  {
        ExtentTest t1 = report.startTest("filexyz");
        t1.log(LogStatus.PASS, "Navigated to the specified URL");
        Assert.assertTrue(true);
        report.endTest(t1);
    }

    @Test(priority = 2)
    public  void titleTest() {
        ExtentTest t2 = report.startTest("filexyz22222");
        String actualTitle = "Hello world";
        //   System.out.println(actualTitle);
        t2.log(LogStatus.FAIL, "Navigated to the specified URL---------------------------------");
        String expectedTitle = "Book Cheap Flights, Air Tickets, Hotels, Bus &amp; Holiday Package at Goibibo";
        Assert.assertEquals("Condition true", actualTitle, expectedTitle);
        report.endTest(t2);
    }

    @AfterClass
    public void tearDown(){

    }



    @BeforeClass
    public void work() {

    }

}

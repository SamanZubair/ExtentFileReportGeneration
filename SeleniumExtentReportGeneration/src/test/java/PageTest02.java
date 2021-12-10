import Pages.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest02 extends BaseClass {
    @BeforeMethod
    public void setUp(){
        System.out.println("QUALITESTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
    }

    @Test(priority = 1)
    public  void enterDestinationDetailsTest() {
      // report.start
       // extentTest.startTest();
        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    public  void titleTest() {
        String actualTitle = "Hello world";
        //   System.out.println(actualTitle);
        String expectedTitle = "Hello world";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Test Started");
    }
}

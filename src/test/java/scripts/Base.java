package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.CarvanaHomePage;
import pages.SearchCarsPage;
import utilities.Driver;

public class Base {

    WebDriver driver;
    SoftAssert softAssert;
    CarvanaHomePage carvanaHomePage;
    SearchCarsPage searchCarsPage;



    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
        softAssert = new SoftAssert();
        carvanaHomePage = new CarvanaHomePage();
        searchCarsPage = new SearchCarsPage();

    }

    @AfterMethod
    public void teardown(){
        softAssert.assertAll();
        Driver.quitDriver();
    }
}
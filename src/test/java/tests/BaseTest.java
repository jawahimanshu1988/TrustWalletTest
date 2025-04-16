package tests;

import io.appium.java_client.AppiumDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverUtils;

public class BaseTest {
    protected AppiumDriver driver;

    @BeforeMethod
    public void setUp() {
        DriverUtils.initializeDriver();
        driver = DriverUtils.getDriver();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        DriverUtils.quitDriver();
    }

}

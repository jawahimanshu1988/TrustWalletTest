package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtils;

import java.time.Duration;

public class BasePage {

    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = DriverUtils.getDriver();
    }

    public void waitForElementAndClick(By by) {
        try
        {
            new WebDriverWait(this.driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(by));
            driver.findElement(by).click();
        } catch (NoSuchElementException | StaleElementReferenceException exception){
            System.out.println("Exception:" + exception.getMessage());
        }
    }

    public boolean isElementDisplayed(By by){
        boolean result = false;
        try
        {
            new WebDriverWait(this.driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(by));
            result = this.driver.findElement(by).isDisplayed();
        } catch (NoSuchElementException exception){
            System.out.println("Exception:" + exception.getMessage());
        }

        return result;
    }

    public boolean validateElementText(By by, String expectedText){
        boolean result = false;
        try
        {
            new WebDriverWait(this.driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(by));
            result = this.driver.findElement(by).getText().equalsIgnoreCase(expectedText);
        } catch (NoSuchElementException exception){
            System.out.println("Exception:" + exception.getMessage());
        }

        return result;
    }

    public boolean validateElementProperty(By by, String propertyName,boolean expectedValue){
        boolean result = false;
        try
        {
            new WebDriverWait(this.driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(by));
            result = this.driver.findElement(by).getAttribute(propertyName).equals(expectedValue);
        } catch (NoSuchElementException exception){
            System.out.println("Exception:" + exception.getMessage());
        }

        return result;
    }

    public boolean validateElementProperty(By by, String propertyName,String expectedValue){
        boolean result = false;
        try
        {
            new WebDriverWait(this.driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(by));
            result = this.driver.findElement(by).getAttribute(propertyName).equalsIgnoreCase(expectedValue);
        } catch (NoSuchElementException exception){
            System.out.println("Exception:" + exception.getMessage());
        }

        return result;
    }

}

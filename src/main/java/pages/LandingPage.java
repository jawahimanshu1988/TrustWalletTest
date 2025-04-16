package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasePage {

    public LandingPage(AppiumDriver driver) {
        super(driver); // Initialize the BasePage class
    }

    // Locators for landing page elements
    @FindBy
    private By createWalletButton = By.id("CreateNewWalletButton");

    public void clickCreateWalletButton(){
        System.out.println("Click Wallet Button");
        waitForElementAndClick(createWalletButton);
    }

}

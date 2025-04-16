package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasscodePage extends BasePage {

    public PasscodePage(AppiumDriver driver) {
        super(driver);
    }

    @FindBy
    private By enableButton = By.xpath("//android.widget.TextView[@text='Enable']");
    @FindBy
    private By allowNotificationButton = By.id("com.android.permissioncontroller:id/permission_allow_button");
    @FindBy
    private By secretPhaseCreateButton = By.id("secretPhraseCreateButton");
    @FindBy
    private By swiftCreateButton = By.id("swiftCreateButton");
    @FindBy
    private By option1 = By.xpath("//android.widget.TextView[@text='Once Swift wallet is created, passkey info (fingerprint, face recognition) will auto-sync on your Google account.']");
    @FindBy
    private By option2 = By.xpath("//android.widget.TextView[@text='Passkeys allow you to recover the wallet in future, if your device is lost or replaced.']");
    @FindBy
    private By option3 = By.id("///android.widget.TextView[@text='IMPORTANT: If passkey is deleted, you will lose access to the wallet and all funds.']");
    @FindBy
    private By continueButton = By.id("//android.widget.TextView[@text='Continue']");

    public void enterPasscode(String passcode){
        System.out.println("Enter Passcode");
        char[] charArrayPasscode = passcode.toCharArray();
        for (char charPasscode : charArrayPasscode) {
            By by = By.xpath("//android.widget.TextView[@text='"+charPasscode+"']");
            waitForElementAndClick(by);
        }
    }

    public void clickEnableButton(){
        System.out.println("Click enable Button");
        waitForElementAndClick(enableButton);
    }

    public void clickAllowNotification(){
        System.out.println("Click Allow Notification Button");
        waitForElementAndClick(allowNotificationButton);
    }

    public void clickSecretPhaseCreateButton(){
        System.out.println("Click Secret phase create Button");
        waitForElementAndClick(secretPhaseCreateButton);
    }

    public void clickSwiftCreateButton(){
        System.out.println("Click Swift create Button");
        waitForElementAndClick(swiftCreateButton);
    }

    public void selectOptionsToContinue(){
        System.out.println("Click Pass Keys Options");
        waitForElementAndClick(option1);
        waitForElementAndClick(option2);
        waitForElementAndClick(option3);
    }

    public void clickContinueButton(){
        System.out.println("Click Continue Button");
        waitForElementAndClick(continueButton);
    }

}

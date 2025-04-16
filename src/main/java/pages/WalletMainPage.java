package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class WalletMainPage extends BasePage {

    public WalletMainPage(AppiumDriver driver) {
        super(driver); // Initialize the BasePage class
    }

    // Locators for Wallet Main page elements
    @FindBy
    private By cryptoSection = By.id("Crypto");
    @FindBy
    private By nfTsSection = By.id("NFTs");
    @FindBy
    private By assetsLayoutSettingsIcon = By.id("assetsLayoutSettingsIcon");

    @FindBy
    private By emptyWalletText = By.xpath("//android.widget.TextView[@text='Your wallet is empty.']");
    @FindBy
    private By buyCryptoButton = By.xpath("//android.widget.TextView[@text='Buy Crypto']");
    @FindBy
    private By depositCryptoButton = By.xpath("//android.widget.TextView[@text='Deposit Crypto']");
    @FindBy
    private By manageCryptoButton = By.xpath("//android.widget.TextView[@text='Manage crypto']");

    @FindBy
    private By topBarHistoryIcon = By.id("topBarHistoryIcon");
    @FindBy
    private By topBarQrIcon = By.id("topBarQrIcon");
    @FindBy
    private By topBarSearchIcon = By.id("topBarSearchIcon");
    @FindBy
    private By topBarWalletName = By.id("topBarWalletName");
    @FindBy
    private By itemIcon = By.id("itemIcon");

    @FindBy
    private By mainBalanceText = By.id("mainBalance");
    @FindBy
    private By mainBalanceChange24hText = By.id("mainBalanceChange24h");

    @FindBy
    private By hotAssetsSectionTitleText = By.id("hotAssetsSectionTitle");

    @FindBy
    private By homeNavigationButton = By.id("HomeNavigationButton");
    @FindBy
    private By trendingTokenNavigationButton = By.id("TrendingTokenNavigationButton");
    @FindBy
    private By swapNavigationButton = By.id("SwapNavigationButton");
    @FindBy
    private By earnNavigationButton = By.id("EarnNavigationButton");
    @FindBy
    private By discoverNavigationButton = By.id("DiscoverNavigationButton");

    @FindBy
    private By homeSendbutton = By.id("HomeSendButton");
    @FindBy
    private By homeReceivebutton = By.id("HomeReceiveButton");
    @FindBy
    private By homeBuybutton = By.id("HomeBuyButton");
    @FindBy
    private By homeSellbutton = By.id("HomeSellButton");

    public boolean validateCryptoSectionIsDisplayed(){
        return isElementDisplayed(cryptoSection);
    }

    public boolean validateCryptoSectionText(){
        return validateElementText(cryptoSection, "Crypto");
    }

    public boolean validateCryptoSectionDefaultSelection(){
        return validateElementProperty(cryptoSection,"focusable", true);
    }

    public boolean validateNFTsSectionIsDisplayed(){
        return isElementDisplayed(nfTsSection);
    }

    public boolean validateNFTsSectionText(){
        return validateElementText(nfTsSection, "NFTs");
    }

    public boolean validateNFTsSectionDefaultSelection(){
        return validateElementProperty(nfTsSection,"focusable", false);
    }

    public boolean validateAssetsLayoutSettingsIconIsDisplayed(){
        return isElementDisplayed(assetsLayoutSettingsIcon);
    }

    public boolean validateEmptyWalletTextIsDisplayed(){
        return isElementDisplayed(emptyWalletText);
    }

    public boolean validateBuyCryptoButtonIsDisplayed(){
        return isElementDisplayed(buyCryptoButton);
    }

    public boolean validateDepositCryptoButtonIsDisplayed(){
        return isElementDisplayed(depositCryptoButton);
    }

    public boolean validateManageCryptoButtonIsDisplayed(){
        return isElementDisplayed(manageCryptoButton);
    }

    public boolean validateTopBarHistoryIconIsDisplayed(){
        return isElementDisplayed(topBarHistoryIcon);
    }

    public boolean validateTopBarQrIconIsDisplayed(){
        return isElementDisplayed(topBarQrIcon);
    }

    public boolean validateItemIconIsDisplayed(){
        return isElementDisplayed(itemIcon);
    }

    public boolean validateTopBarSearchIconIsDisplayed(){
        return isElementDisplayed(topBarSearchIcon);
    }

    public boolean validateTopBarWalletNameText(){
        return validateElementText(topBarWalletName, "Main Wallet 1");
    }

    public boolean validateMainBalanceText(){
        return validateElementText(mainBalanceText, "$0.00");
    }

    public boolean validateMainBalanceChange24hText(){
        return validateElementText(mainBalanceChange24hText, "$0.00 (0%)");
    }

    public boolean validateHomeSendButtonIsDisplayed(){
        return isElementDisplayed(homeSendbutton);
    }

    public boolean validateHomeSendButtonText(){
        return validateElementText(homeSendbutton, "Send");
    }

    public boolean validateHomeReceiveButtonIsDisplayed(){
        return isElementDisplayed(homeReceivebutton);
    }

    public boolean validateHomeReceiveButtonText(){
        return validateElementText(homeReceivebutton, "Receive");
    }

    public boolean validateHomeBuyButtonIsDisplayed(){
        return isElementDisplayed(homeBuybutton);
    }

    public boolean validateHomeBuyButtonText(){
        return validateElementText(homeBuybutton, "Buy");
    }

    public boolean validateHomeSellButtonIsDisplayed(){
        return isElementDisplayed(homeSellbutton);
    }

    public boolean validateHomeSellButtonText(){
        return validateElementText(homeSellbutton, "Sell");
    }

    public boolean validateHotAssetsSectionTitleText(){
        return validateElementText(hotAssetsSectionTitleText, "Trending");
    }

    public boolean validateHomeNavigationButtonIsDisplayed(){
        return isElementDisplayed(homeNavigationButton);
    }

    public boolean validateHomeNavigationButtonText(){
        return validateElementText(homeNavigationButton, "Home");
    }

    public boolean validateTrendingTokenNavigationButtonIsDisplayed(){
        return isElementDisplayed(trendingTokenNavigationButton);
    }

    public boolean validateTrendingTokenNavigationButtonText(){
        return validateElementText(trendingTokenNavigationButton, "Trending");
    }

    public boolean validateSwapNavigationButtonIsDisplayed(){
        return isElementDisplayed(swapNavigationButton);
    }

    public boolean validateSwapNavigationButtonText(){
        return validateElementText(swapNavigationButton, "Swap");
    }

    public boolean validateEarnNavigationButtonIsDisplayed(){
        return isElementDisplayed(earnNavigationButton);
    }

    public boolean validateEarnNavigationButtonText(){
        return validateElementText(earnNavigationButton, "Earn");
    }

    public boolean validateDiscoverNavigationButtonIsDisplayed(){
        return isElementDisplayed(discoverNavigationButton);
    }

    public boolean validateDiscoverNavigationButtonText(){
        return validateElementText(discoverNavigationButton, "Discover");
    }

}

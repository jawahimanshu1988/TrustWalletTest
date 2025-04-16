package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LandingPage;
import pages.PasscodePage;
import pages.WalletMainPage;


public class SampleTest extends BaseTest {

    @Test(description = "Create Wallet with Secret Phase")
    public void createWalletWithSecretPhaseTest() {
        LandingPage landingPage = new LandingPage(driver);
        PasscodePage passcodePage = new PasscodePage(driver);
        WalletMainPage walletMainPage = new WalletMainPage(driver);
        SoftAssert softAssertion = new SoftAssert();
        landingPage.clickCreateWalletButton();
        passcodePage.enterPasscode("123456");
        passcodePage.enterPasscode("123456");
        passcodePage.clickEnableButton();
        passcodePage.clickAllowNotification();
        passcodePage.clickSecretPhaseCreateButton();
        Assert.assertTrue(walletMainPage.validateCryptoSectionIsDisplayed(), "Crpto Section is not displayed");
        softAssertion.assertTrue(walletMainPage.validateCryptoSectionText(), "Crpto Section Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateCryptoSectionDefaultSelection(), "Crpto default Selection is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateNFTsSectionIsDisplayed(), "NFTs Section is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateNFTsSectionText(), "NFTs Section Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateNFTsSectionDefaultSelection(), "NFTs default Selection is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateAssetsLayoutSettingsIconIsDisplayed(), "Assets Layout Settings Icon is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateEmptyWalletTextIsDisplayed(), "Empty Wallet text is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateBuyCryptoButtonIsDisplayed(), "Buy Crypto Button is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateDepositCryptoButtonIsDisplayed(), "Deposit Crypto Button is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateManageCryptoButtonIsDisplayed(), "Manage Crypto Button is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateTopBarHistoryIconIsDisplayed(), "Top Bar History Icon is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateTopBarQrIconIsDisplayed(), "Top Bar Qr Icon is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateItemIconIsDisplayed(), "Item Icon is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateTopBarSearchIconIsDisplayed(), "Top Bar Search Icon is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateTopBarWalletNameText(), "Top Bar Wallet Name Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateMainBalanceText(), "Main Balance Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateMainBalanceChange24hText(), "Main Balance Chane 24H Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateHomeSendButtonIsDisplayed(), "Home Send Button is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateHomeSendButtonText(), "Home Send Button Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateHomeReceiveButtonIsDisplayed(), "Receive Button is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateHomeReceiveButtonText(), "Receive Button Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateHomeBuyButtonIsDisplayed(), "Home Buy Button is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateHomeBuyButtonText(), "Home Buy Button Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateHomeSellButtonIsDisplayed(), "Home Buy Button is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateHomeSellButtonText(), "Home Buy Button Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateHotAssetsSectionTitleText(), "Hot Assets Section Title Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateHomeNavigationButtonIsDisplayed(), "Home Navigation Button is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateHomeNavigationButtonText(), "Home Navigation Button Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateTrendingTokenNavigationButtonIsDisplayed(), "Trending Token Navigation Button is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateTrendingTokenNavigationButtonText(), "Trending Token Navigation Button Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateSwapNavigationButtonIsDisplayed(), "Swap Navigation Button is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateSwapNavigationButtonText(), "Swap Navigation Button Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateSwapNavigationButtonIsDisplayed(), "Swap Navigation Button is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateSwapNavigationButtonText(), "Swap Navigation Button Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateEarnNavigationButtonIsDisplayed(), "Earn Navigation Button is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateEarnNavigationButtonText(), "Earn Navigation Button Text is not displayed as expected");
//        softAssertion.assertTrue(walletMainPage.validateDiscoverNavigationButtonIsDisplayed(), "Discover Navigation Button is not displayed");
//        softAssertion.assertTrue(walletMainPage.validateDiscoverNavigationButtonText(), "Discover Navigation Button Text is not displayed as expected");
    }

    @Test(description = "Create Wallet with Swift")
    public void createWalletWithSwiftTest() {
        LandingPage landingPage = new LandingPage(driver);
        PasscodePage passcodePage = new PasscodePage(driver);
        WalletMainPage walletMainPage = new WalletMainPage(driver);
        SoftAssert softAssertion = new SoftAssert();
        landingPage.clickCreateWalletButton();
        passcodePage.enterPasscode("123456");
        passcodePage.enterPasscode("123456");
        passcodePage.clickEnableButton();
        passcodePage.clickAllowNotification();
        passcodePage.clickSwiftCreateButton();
        passcodePage.selectOptionsToContinue();
        passcodePage.clickContinueButton();
    }

}
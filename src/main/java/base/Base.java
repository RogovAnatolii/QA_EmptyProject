package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import listeners.TestListeners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import pages.home.HomePage;
import pages.home.HomePageTestSteps;
import pages.menu.MenuTestSteps;
import pages.message.MessageTestSteps;
import pages.preLogin.PreLoginPage;
import pages.preLogin.PreLoginTestSteps;
import testConfiguration.TestConfiguration;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created by AnatolyRogov on 16.06.17.
 */
@Listeners(TestListeners.class)
public class Base {

    public String URL;

    public PreLoginTestSteps PRE_LOGIN_TEST_STEPS = new PreLoginTestSteps();
    public HomePageTestSteps HOME_TEST_STEPS = new HomePageTestSteps();
    public MenuTestSteps MENU_TEST_STEPS = new MenuTestSteps();
    public MessageTestSteps MESSAGE_TEST_STEPS = new MessageTestSteps();


    @BeforeMethod(alwaysRun = true)
    public void SettingsConfiguration(){
        TestConfiguration testConfiguration = new TestConfiguration();
        Configuration.remote = testConfiguration.getHUB_URL();
        Configuration.browser = testConfiguration.getBROWSER();
        this.URL = testConfiguration.getURL();
    }

    @BeforeSuite
    public void beforeSuite() throws Exception{
        Configuration.timeout = 46000;
        Configuration.collectionsTimeout = 67000;
        Configuration.screenshots = false;
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = false;
    }


}

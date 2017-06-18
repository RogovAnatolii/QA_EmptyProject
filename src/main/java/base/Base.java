package base;

import com.codeborne.selenide.Configuration;
import listeners.TestListeners;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import testConfiguration.TestConfiguration;

/**
 * Created by AnatolyRogov on 16.06.17.
 */
@Listeners(TestListeners.class)
public class Base {

    public String URL;


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
        Configuration.holdBrowserOpen = true;
    }


}

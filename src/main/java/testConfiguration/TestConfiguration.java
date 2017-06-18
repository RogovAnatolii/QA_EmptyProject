package testConfiguration;

/**
 * Created by AnatolyRogov on 18.06.17.
 */
public class TestConfiguration {

    private String HUB_URL;
    private String BROWSER;
    private String URL;

    public TestConfiguration() {
        if(System.getProperty("env.Hub_URL") == null) {
            HUB_URL = "http://192.168.0.21:5513/wd/hub";
        } else {
            HUB_URL = System.getProperty("env.Hub_URL");
        }

        if(System.getProperty("env.Browser") == null) {
            BROWSER = "chrome";
        } else {
            BROWSER = System.getProperty("env.Browser");
        }

        if(System.getProperty("env.Url") == null) {
            URL = "http://open.ru";
        }else {
            URL = System.getProperty("env.Url");
        }
    }

    public String getHUB_URL() {
        return HUB_URL;
    }

    public String getBROWSER() {
        return BROWSER;
    }

    public String getURL() {
        return URL;
    }
}
package pages.preLogin;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by AnatolyRogov on 21.06.17.
 */
public class PreLoginPage {

    public SelenideElement inLogin() { return $(By.xpath("//div[@id='index_login']//input[@id='index_email']")); }
    public SelenideElement inPass() { return $(By.xpath("//div[@id='index_login']//input[@id='index_pass']")); }
    public SelenideElement btnLogin() { return $(By.xpath("//div[@id='index_login']//button[@id='index_login_button']")); }

}

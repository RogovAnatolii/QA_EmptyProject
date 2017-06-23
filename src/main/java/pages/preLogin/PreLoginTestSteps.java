package pages.preLogin;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created by AnatolyRogov on 21.06.17.
 */
public class PreLoginTestSteps extends PreLoginPage {

    @Step("Открыть браузер")
    public void openSite(String url) {
        Selenide.open(url);
        getWebDriver().manage().window().maximize();
    }

    @Step("Ввести логин")
    public void enterLogin(String login) {
        inLogin().setValue(login);
    }

    @Step("Ввести пароль")
    public void enterPass(String pass) {
        inPass().setValue(pass);
    }

    @Step("Нажать кнопку \"Войти\"")
    public void pressToLogin() {
        btnLogin().click();
    }

}

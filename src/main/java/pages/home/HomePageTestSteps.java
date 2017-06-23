package pages.home;

import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


/**
 * Created by AnatolyRogov on 19.06.17.
 */
public class HomePageTestSteps extends HomePage {

    @Step("Проверяем имя пользователя")
    public void checkUserName(String name) {
        Assert.assertEquals(userName().getText(), name, "Имена не совпадают");
    }

    @Step("Проверить что мы оказались на главной странице")
    public void checkTheHomePage(String url) {
        try {
            String a = getWebDriver().getCurrentUrl();
            Assert.assertEquals(url, getWebDriver().getCurrentUrl());
            Thread.sleep(3000);
        } catch (Throwable e) {
            throw new IllegalStateException("Url'ы не совпадают" + e);
        }
    }

}

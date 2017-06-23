package testClasses.vkTests.login;

import base.Base;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import superUsers.SuperUser;
import testNames.CaseNames;
import testNames.TestNames;

import java.io.FileNotFoundException;

/**
 * Created by AnatolyRogov on 21.06.17.
 */
@Features("Тестирование сайта")
public class Autorization extends Base {

    @Stories("vk.com")
    @Test
    @TestNames(CaseNames.CN_000)
    public void login() throws FileNotFoundException, InterruptedException {
        SuperUser user = new SuperUser("I'm");
        PRE_LOGIN_TEST_STEPS.openSite(URL);
        PRE_LOGIN_TEST_STEPS.enterLogin(user.login);
        PRE_LOGIN_TEST_STEPS.enterPass(user.password);
        PRE_LOGIN_TEST_STEPS.pressToLogin();
        HOME_TEST_STEPS.checkUserName(user.name);
        HOME_TEST_STEPS.checkTheHomePage(URL + "/feed");
    }
}

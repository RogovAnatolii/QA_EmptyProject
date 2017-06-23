package testClasses.vkTests.login;

import base.Base;
import ru.yandex.qatools.allure.annotations.Step;
import superUsers.SuperUser;

import java.io.FileNotFoundException;

/**
 * Created by AnatolyRogov on 22.06.17.
 */
public class BaseAutorization extends Base {

    @Step("Логин пользователем")
    public void loginWithRole(String role) throws FileNotFoundException {
        SuperUser user = new SuperUser(role);
        PRE_LOGIN_TEST_STEPS.openSite(URL);
        PRE_LOGIN_TEST_STEPS.enterLogin(user.login);
        PRE_LOGIN_TEST_STEPS.enterPass(user.password);
        PRE_LOGIN_TEST_STEPS.pressToLogin();
        HOME_TEST_STEPS.checkUserName(user.name);
        HOME_TEST_STEPS.checkTheHomePage(URL + "/feed");
    }
}

package testClasses.vkTests.message;

import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import testClasses.vkTests.login.BaseAutorization;
import testNames.CaseNames;
import testNames.TestNames;

import java.io.FileNotFoundException;

import static testNames.CaseNames.*;

/**
 * Created by AnatolyRogov on 22.06.17.
 */
@Features("Тестирование сайта")
public class SendMessage extends BaseAutorization {

    @Stories("vk.com")
    @Test
    @TestNames(CN_001)
    public void checkSendMessage() throws FileNotFoundException, InterruptedException {
        loginWithRole("I'm");
        String message = "Всем мир, я тестирую!";
        MENU_TEST_STEPS.goTo("Сообщения");
        MESSAGE_TEST_STEPS.findChatWith("auto");
        MESSAGE_TEST_STEPS.sendMessage(message);
        MESSAGE_TEST_STEPS.refreshPage();
        MESSAGE_TEST_STEPS.checkThatMessageSend(message);
    }

    @Stories("vk.com")
    @Test
    @TestNames(CN_002)
    public void checkSendMessageNegative() throws FileNotFoundException, InterruptedException {
        loginWithRole("I'm");
        String message = "Кофе это фрукт:)";
        MENU_TEST_STEPS.goTo("Сообщения");
        MESSAGE_TEST_STEPS.findChatWith("auto");
        MESSAGE_TEST_STEPS.sendMessage(message);
        MESSAGE_TEST_STEPS.refreshPage();
        MESSAGE_TEST_STEPS.checkThatMessageSend(message + ":)");
    }
}

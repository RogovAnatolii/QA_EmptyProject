package pages.message;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created by AnatolyRogov on 22.06.17.
 */
public class MessageTestSteps extends MessagePage {

    @Step("Найти в сообщениях чат с {0}")
    public void findChatWith(String who) throws InterruptedException {
        searchBox().setValue(who);
        Thread.sleep(10000);
        searchBox().pressEnter();
    }

    @Step("Отправить сообщение")
    public void sendMessage(String text) throws InterruptedException {
        inputChat().setValue(text);
        Thread.sleep(3000);
        inputChat().pressEnter();
    }

    @Step("Обновить страницу")
    public void refreshPage() throws InterruptedException {
        Selenide.refresh();
        Thread.sleep(2000);
    }

    @Step("Проверить что сообщение отправилось")
    public void checkThatMessageSend(String message) {
        SelenideElement suiteMessage = suiteMessage().last();
        String lastUIMessage = suiteMessage.getText();
        Assert.assertEquals(message, lastUIMessage, "Отправленное сообщение, не соответствует отображаемому");
    }
}
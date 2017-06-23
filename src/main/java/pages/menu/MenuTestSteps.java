package pages.menu;

import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by AnatolyRogov on 22.06.17.
 */
public class MenuTestSteps extends MenuPage {
    @Step("Перейти в \"{0}\"")
    public void goTo(String place) {
        switch (place) {
            case "Моя страница":
                myPage().click();
                break;
            case "Новости":
                news().click();
                break;
            case "Сообщения":
                message().click();
                break;
            case "Друзья":
                friends().click();
                break;
            case "Группы":
                groups().click();
                break;
            case "Фотографии":
                photos().click();
                break;
            case "Музыка":
                music().click();
                break;
            case "Видео":
                video().click();
                break;
            case "Игры":
                games().click();
                break;
        }
    }
}

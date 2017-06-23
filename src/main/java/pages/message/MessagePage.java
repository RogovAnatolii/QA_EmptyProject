package pages.message;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by AnatolyRogov on 22.06.17.
 */
public class MessagePage {

    public SelenideElement searchBox() {
        return $(By.xpath("//div[@class='ui_search_input_block']//input[@id='im_dialogs_search']"));
    }

    public SelenideElement inputChat() { return $(By.xpath("//div[@id='im_editable0']")); }

    public ElementsCollection suiteMessage() { return $$(By.xpath("//div[@class='im_msg_text']")); }

}

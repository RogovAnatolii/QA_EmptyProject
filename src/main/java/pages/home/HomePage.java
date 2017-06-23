package pages.home;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by AnatolyRogov on 19.06.17.
 */
public class HomePage {

    public SelenideElement userName() { return $(By.xpath("//div[@class='top_profile_name']")); }




}

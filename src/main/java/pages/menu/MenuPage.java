package pages.menu;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by AnatolyRogov on 22.06.17.
 */
public class MenuPage {

    public SelenideElement myPage() {
        return $(By.xpath("//div[@id='side_bar_inner']//li[@id='l_pr']//a[@class='left_row']"));
    }

    public SelenideElement news() {
        return $(By.xpath("//div[@id='side_bar_inner']//li[@id='l_nwsf']//a[@class='left_row']"));
    }

    public SelenideElement message() {
        return $(By.xpath("//div[@id='side_bar_inner']//li[@id='l_msg']//a[@class='left_row']"));
    }

    public SelenideElement friends() {
        return $(By.xpath("//div[@id='side_bar_inner']//li[@id='l_fr']//a[@class='left_row']"));
    }

    public SelenideElement groups() {
        return $(By.xpath("//div[@id='side_bar_inner']//li[@id='l_gr']//a[@class='left_row']"));
    }

    public SelenideElement photos() {
        return $(By.xpath("//div[@id='side_bar_inner']//li[@id='l_ph']//a[@class='left_row']"));
    }

    public SelenideElement music() {
        return $(By.xpath("//div[@id='side_bar_inner']//li[@id='l_aud']//a[@class='left_row']"));
    }

    public SelenideElement video() {
        return $(By.xpath("//div[@id='side_bar_inner']//li[@id='l_vid']//a[@class='left_row']"));
    }

    public SelenideElement games() {
        return $(By.xpath("//div[@id='side_bar_inner']//li[@id='l_ap']//a[@class='left_row']"));
    }

}

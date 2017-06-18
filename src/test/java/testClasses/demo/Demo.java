package testClasses.demo;

import base.Base;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import testNames.TestNames;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static testNames.CaseNames.CN_000;

/**
 * Created by AnatolyRogov on 16.06.17.
 */

@Features("Название функционала")
public class Demo extends Base{

    @Stories("Название сюжета")
    @Test
    @TestNames(CN_000)
    public void DemoTest1(){
        Selenide.open(URL);
        getWebDriver().manage().window().maximize();
        System.out.println("nl");
    }



}

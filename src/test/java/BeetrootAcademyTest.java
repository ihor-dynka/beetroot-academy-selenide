import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BeetrootAcademyTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.screenshots = true;
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.reportsFolder = "screenshots"; //package for screenshots
    }

    @Test
    public void testContactMe() {
        open("https://www.google.com");
        $(Selectors.byName("q")).setValue("beetroot academy ivano-frankivsk").pressEnter();

        $(By.xpath("//a[@href='https://beetroot.academy/frankivsk/']"))
                .click();

        $(By.xpath("//*[@class='selectedCity_info']//h2"))
                .shouldBe(Condition.visible, Condition.text("Івано-Франківськ"));
        Selenide.screenshot("city");
    }
}

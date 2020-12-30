import com.codeborne.selenide.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BeetrootAcademyTest {

    private SelenideElement element;

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

        $(By.linkText("Міста")).hover();
        $(By.linkText("Київ")).click();
    }
}

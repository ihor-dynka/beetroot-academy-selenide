import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BeetrootHomePage {
    public BeetrootHomePage userShouldBeRedirectedToHomePage(String city) {
        $(By.xpath("//*[@class='selectedCity_info']//h2"))
                .shouldBe(Condition.visible, Condition.text(city));
        return this;
    }

    public void selectCity(String city) {
        Selenide.screenshot(city);
        $(By.linkText("Міста")).hover();
        $(By.linkText(city)).click();
    }
}

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultsPage {
    public BeetrootHomePage select(final String value) {
        $(By.xpath("//a[@href='" + value + "']"))
                .click();
        return new BeetrootHomePage();
    }
}

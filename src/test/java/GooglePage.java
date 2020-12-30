import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class GooglePage {

    public GooglePage open() {
        Selenide.open("https://www.google.com");
        return this;
    }

    public SearchResultsPage search(String text) {
        $(Selectors.byName("q")).setValue(text).pressEnter();
        return new SearchResultsPage();
    }
}

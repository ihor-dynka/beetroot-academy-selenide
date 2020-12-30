import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BeetrootAcademyTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.screenshots = true;
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.headless = false;
        Configuration.reportsFolder = "screenshots"; //package for screenshots
    }


    @ParameterizedTest
    @ValueSource(strings = {"Київ", "Житомир", "Івано-Франківськ"})
    public void testContactMe(String city) {
        new GooglePage()
                .open()
                .search("beetroot academy ivano-frankivsk")
                .select("https://beetroot.academy/frankivsk/")
                .userShouldBeRedirectedToHomePage("Івано-Франківськ")
                .selectCity(city);
    }
}

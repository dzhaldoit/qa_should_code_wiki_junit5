import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ShouldIssuesSearchTest {

    @BeforeAll
    static void setUP() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com/";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void shouldBeCodeJUnit5() {
        open("selenide/selenide");
        $("#wiki-tab").click();
        $$(".internal").findBy(text("Soft assertions")).click();


        $("#wiki-wrapper").shouldHave(text("Using JUnit5 extend test class"));
    }

}

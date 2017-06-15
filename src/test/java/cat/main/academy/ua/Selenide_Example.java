package cat.main.academy.ua;
        import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Selenide_Example {
    public WebDriver driver;


   // @Before
    public void start () {
       driver = new ChromeDriver();

    }
    @Test
    public void testSelenide(){

        System.setProperty("selenide.browser", "Chrome");
        open("http://www.google.com.ua");
        $(By.name("q")).setValue("main academy").pressEnter();
    }


}


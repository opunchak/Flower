package cat.main.academy.ua;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 450G1 on 08.06.2017.
 */
public class VirtualBox {



    WebDriver driver = new RemoteWebDriver(new URL("http://10.11.1.187:4444/wd/hub"), DesiredCapabilities.chrome());

    public VirtualBox() throws MalformedURLException {
    }
    @Test
    public void OpenVirtulaBox () {
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("хром успешно запущен");

    }
}

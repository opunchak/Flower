package cat.main.academy.ua;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by 450G1 on 30.05.2017.
 */
public class TestAdminPage extends BaseAdminPage {
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void start() {
        login();
    }

    public void login() {}


    @Test
    public void TestOpenPage() {
        check_appearance();
        check_catalog();
        check_countries();
        check_currencies();
        check_customers();
        check_geo_zones();
        check_languages();
        check_modules();
        check_orders();
        check_pages();
        check_reports();
        check_settings();
        check_slides();
        check_tax();
        check_translations();
        check_users();
        check_vqmods();
    }
    @After
    public void quitDriver() {
        driver.quit();
    }

}

//driver.findElement(By.linkText("app=appearance&doc=template")).click();
//driver.findElement(By.className("Appearance")).click();
//driver.findElement(By.xpath("//div/div/div[4]/ul/li[1]/a/span[1][@class='//div/div/div[4]/ul/li[1]/a/span[1]']")).click();
/*
        Assert.assertTrue(!driver.findElements(By.xpath("//div/div/div[4]/ul/li[1]/a[@classname='Appearance']")).isEmpty());
        !WebElement page = driver.findElement(By.className("page"));
        !driver.findElement(By.id("box-widgets"));
        driver.findElement(By.className("center-block img-responsive"));
        driver.findElement(By.partialLinkText("catalog"));
        */
//driver.findElement(By.xpath("//*[@id=\"app-\"]/a/span[2]")).click();
//driver.findElement(By.id("sidebar")).findElement(By.xpath("//div/div/div[4]/ul/li[1]/a")).click();

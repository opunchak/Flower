package cat.main.academy.ua;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by 450G1 on 25.05.2017.
 */
public class Ducks {
   public WebDriver driver;
   public WebDriverWait wait;

   @Before
   public void start () {
      driver = new ChromeDriver();
      wait = new WebDriverWait(driver, 20);
   }

   @Test
   public void TestOPenPage () {
      driver.get("http://localhost/litecart/public_html/admin/");
      driver.findElement(By.name("username")).sendKeys("admin");
      driver.findElement(By.name("password")).sendKeys("admin");
      driver.findElement(By.xpath("//div[2]/div/form/div[2]/button")).click();
      //driver.get("http://localhost/litecart/public_html/en/");
       driver.findElement(By.xpath("(////div/div/div[2]/a[1]/i[contains(@class, 'circle-left')])")).click();
   }

   /*@After
   public void quitDriver() {
      driver.quit();*/
   }



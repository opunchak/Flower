package cat.main.academy.ua;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

 public abstract class BaseLoginPage {
    public WebDriver driver;
    public WebDriverWait wait;

    protected void check_click_new_account() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("http://localhost/litecart/public_html/en/");
        driver.findElement(By.cssSelector(".text-center>a")).click();
    }

    protected void check_fill_first_name() {
        check_fill_first_name("Olga");
    }

    protected void check_fill_first_name(String firstname) {
        //Fill Firstname field
        //driver.findElement(xpath("//*[@id='box-create-account']/form/div[2]/div[1]/input")).sendKeys("Olga");
        driver.findElement(By.cssSelector("[name='firstname']")).sendKeys(firstname);
    }

    protected void check_fill_lastname() {
        check_fill_lastname("Punchak");
    }

    protected void check_fill_lastname(String lastname) {
        //Fill Lastname field
        //driver.findElement(xpath("//*[@id='box-create-account']/form/div[2]/div[2]/input")).sendKeys("Punchak");
        driver.findElement(cssSelector("[name='lastname']")).sendKeys(lastname);
    }

    protected void check_fill_address1(String address1) {
        //Fill Address1 field
        //driver.findElement(xpath("//*[@id='box-create-account']/form/div[3]/div[1]/input")).sendKeys("HomeSweetHome");
        driver.findElement(cssSelector("[name='address1']")).sendKeys(address1);
    }

    protected void check_select_country() {
        //Select country
        Select objSelect = new Select(driver.findElement(cssSelector("[name='country_code']")));
        objSelect.selectByIndex(226);
    }

    protected void check_fill_email(String homeEmail) {
        //Fill email
        driver.findElement(xpath("//*[@id='box-create-account']/form/div[6]/div[1]/div/input")).sendKeys(homeEmail);
    }

    protected void check_fill_desired_password() {
        check_fill_desired_password("Password");
    }

    protected void check_fill_desired_password(String password) {
        //Fill Desired Password
        driver.findElement(xpath("//*[@id='box-create-account']/form/div[7]/div[1]/div/input")).sendKeys(password);
    }

    protected void check_fill_confirmed_password() {
        check_fill_confirmed_password("Password");
    }

    protected void check_fill_confirmed_password(String password) {
        //Fill Confirmed Password
        driver.findElement(cssSelector("[name='confirmed_password']")).sendKeys(password);
    }

    protected void check_confirm_sign_in() {
        check_confirm_sign_in("olyasa@meta.ua");
    }

    protected void check_confirm_sign_in(String homeEmail) {
        check_confirm_sign_in(homeEmail, "Password");
    }

    protected void check_confirm_sign_in(String homeEmail, String password) {
        //Confirm in Sign in
        driver.findElement(cssSelector("[placeholder='Email Address']")).sendKeys(homeEmail);
        driver.findElement(cssSelector("[placeholder='Password']")).sendKeys(password);
    }

    protected void check_confirm_by_click_Create_button() {
        // Create account clicking by Create account button
        driver.findElement(cssSelector("[name='create_account']")).click();
    }
    protected void check_fill_address1() {
        check_fill_address1("HomeSweetHome");
    }

    protected void check_fill_email() {
        check_fill_email("olyasa@meta.ua");
    }

}

package cat.main.academy.ua;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public abstract class BaseStorePage {
    public WebDriver driver;
    public WebDriverWait wait;

    protected void checkCloseRecentlyViewed() throws InterruptedException {
        //Close recently viewed item
        Thread.sleep(2000);
        driver.findElement(xpath("//div[2]/div/button")).click();
    }

    protected void checkCloseJustImage() {
        //Close just image
        driver.findElement(xpath("//div[3]/div/button")).click();
    }

    protected void checkViewOnlyImage() {
        //View only image
        driver.findElement(cssSelector("[class='img-responsive']")).click();
    }

    protected void checkSelectRecentlyItem() {
        //Select recently viewed on Home Page and Observe item with description
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cssSelector("[class='img-thumbnail']")));
        driver.findElement(cssSelector("[class='img-thumbnail']")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cssSelector("[class='img-responsive']")));
    }

    protected void checkGoHomePage() {
        //Go to the Home page
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cssSelector("a[href*=public_html]")));
        driver.findElement(cssSelector("a[href*=public_html]")).click();
    }

    protected void checkConfirmOrder() {
        //Confirm order clicking on button
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cssSelector("[name='confirm_order']")));
        driver.findElement(cssSelector("[name='confirm_order']")).click();
    }

    protected void checkFillValidPostcode() {
        FillPostcode("02068");
    }

    protected void FillPostcode(String postcode) {
        //Fill valid postcode
        driver.findElement(cssSelector("[name='postcode']")).sendKeys(postcode);
    }

    protected void checkClearInvalidPostcode() {
        //Clear invalid postcode
        driver.findElement(cssSelector("[name='postcode']")).clear();
    }

    protected void checkInvalidPpostcode() {
        FillPostcode("EC1A 1BB");
    }

    protected void check_confirm_changes() {
        //Confirm changes
        driver.findElement(cssSelector("[name='save_customer_details']")).click();
    }

    protected void check_fill_required_phone() {
        check_fill_required_phone("+380977503612");
    }

    protected void check_fill_required_phone(String mobilePhone) {
        //Fill required field phone
        driver.findElement(cssSelector("[name='phone']")).sendKeys(mobilePhone);
    }

    protected void check_fill_required_city() {
        check_fill_required_city("Kiev");
    }

    protected void check_fill_required_city(String city) {
        //Fill required field City
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cssSelector("[name='city']")));
        driver.findElement(cssSelector("[name='city']")).sendKeys(city);
    }

    protected void check_sign_in_for_buying(String homeEmail) {
        check_sign_in_for_buying(homeEmail, "Password");
    }

    protected void check_sign_in_for_buying(String homeEmail, String password) {
        // Sign in for buying the product from Shopping Cart
        driver.findElement(cssSelector("a[href*=Fcheckout]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cssSelector("[placeholder='Email Address']")));
        driver.findElement(cssSelector("[placeholder='Email Address']")).sendKeys(homeEmail);
        driver.findElement(cssSelector("[placeholder='Password']")).sendKeys(password);
        driver.findElement(cssSelector("[name='login']")).click();
    }

    protected void check_redirection_to_the_shopping_cart() throws InterruptedException {
        // redirection to the Shopping Cart page
        //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cssSelector("a[href*=Fcheckout")));
        //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(xpath("//*[@id='box-checkout-customer']/div[1]/a")));
        Thread.sleep(2000);
    }

    protected void check_go_to_cart() {
        // go to Cart
        driver.findElement(cssSelector("a[href*=checkout]")).click();
    }

    protected void check_add_to_cart() throws InterruptedException {
        // add to Cart
        driver.findElement(xpath(".//*[@id='box-product']//button")).click();
        driver.findElement(cssSelector("[class='featherlight-close-icon featherlight-close']")).click();
        Thread.sleep(2000);
        //wait.until(ExpectedConditions.presenceOfElementLocated(cssSelector("[class='quantity']"))).getCssValue("innerText").startsWith("1");
        //wait.until(ExpectedConditions.presenceOfElementLocated(cssSelector("[class='quantity']"))).getCssValue("innerText").contains("1");
        //wait.until(ExpectedConditions.presenceOfElementLocated(cssSelector("[class='formatted_value']"))).getCssValue("innerText").contains("18");
    }

    protected void check_seleck_2nd_option() {
        //select 2nd Small option from dropdown list
        WebElement object = driver.findElement(xpath("//*[@id='box-product']//select"));
        object.click();
        driver.findElement(xpath("//*[@id='box-product']//select/option[2]")).click();
    }

    protected void check_wait() {
        // wait until element rd001 is found
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cssSelector(".sku")));
    }

    protected void check_find_duck() {
        //find yellow duck on Home page
        driver.findElement(xpath(".//*[@id='box-campaign-products']//a")).click();
    }

    protected void check_go_to_store_page() {
        //go to the Store page
        driver.get("http://localhost/litecart/public_html/en/");
    }

    protected void check_open_store_page() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    protected void check_sign_in_for_buying() {
        check_sign_in_for_buying("olyasa@meta.ua");
    }
}




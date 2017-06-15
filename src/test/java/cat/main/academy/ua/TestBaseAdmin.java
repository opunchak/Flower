package cat.main.academy.ua;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class TestBaseAdmin {
    public WebDriver driver;
    public WebDriverWait wait;


    public void login() {
        login("admin");
    }

    public void login(String admin) {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("http://localhost/litecart/public_html/admin/");
        driver.findElement(By.name("username")).sendKeys(admin);
        driver.findElement(By.name("password")).sendKeys(admin);
        driver.findElement(By.xpath("//div[2]/div/form/div[2]/button")).click();
    }


    public void check_appearance() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        driver.findElement(By.cssSelector("a[href*=template]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=template]")).isEmpty());
        driver.findElement(By.id("doc-template")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-template")).isEmpty());
        driver.findElement(By.id("doc-logotype")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-template")).isEmpty());
    }

    public void check_catalog() {
        driver.findElement(By.cssSelector("a[href*=catalog]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=catalog]")).isEmpty());
        driver.findElement(By.id("doc-catalog")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-catalog")).isEmpty());
        driver.findElement(By.id("doc-product_groups")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-product_groups")).isEmpty());
        driver.findElement(By.id("doc-option_groups")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-option_groups")).isEmpty());
        driver.findElement(By.id("doc-manufacturers")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-manufacturers")).isEmpty());
        driver.findElement(By.id("doc-suppliers")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-suppliers")).isEmpty());
        driver.findElement(By.id("doc-delivery_statuses")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-delivery_statuses")).isEmpty());
        driver.findElement(By.id("doc-sold_out_statuses")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-sold_out_statuses")).isEmpty());
        driver.findElement(By.id("doc-quantity_units")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-quantity_units")).isEmpty());
        driver.findElement(By.id("doc-csv")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-csv")).isEmpty());
    }

    public void check_countries() {
        driver.findElement(By.cssSelector("a[href*=countries]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=countries]")).isEmpty());
    }
    public void check_currencies() {
        driver.findElement(By.cssSelector("a[href*=currencies]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=currencies]")).isEmpty());
    }
    public void check_customers() {
        driver.findElement(By.cssSelector("a[href*=customers]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=customers]")).isEmpty());
        driver.findElement(By.id("doc-customers")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-customers")).isEmpty());
        driver.findElement(By.id("doc-csv")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-csv")).isEmpty());
        driver.findElement(By.id("doc-newsletter")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-newsletter")).isEmpty());
    }

    public void check_geo_zones() {
        driver.findElement(By.cssSelector("a[href*=geo_zones]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=geo_zones]")).isEmpty());
    }

    public void check_languages() {
        driver.findElement(By.cssSelector("a[href*=languages]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=languages]")).isEmpty());
        driver.findElement(By.id("doc-languages")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-languages")).isEmpty());
        driver.findElement(By.id("doc-storage_encoding")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-storage_encoding")).isEmpty());
    }

    public void check_modules() {
        driver.findElement(By.cssSelector("a[href*=jobs]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=jobs]")).isEmpty());
        driver.findElement(By.id("doc-customer")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-customer")).isEmpty());
        driver.findElement(By.id("doc-shipping")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-shipping")).isEmpty());
        driver.findElement(By.id("doc-payment")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-payment")).isEmpty());
        driver.findElement(By.id("doc-order")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-order")).isEmpty());
        driver.findElement(By.id("doc-order_total")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-order_total")).isEmpty());
        driver.findElement(By.id("doc-jobs")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-jobs")).isEmpty());

    }

    public void check_orders(){
        driver.findElement(By.cssSelector("a[href*=orders]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=orders]")).isEmpty());
        driver.findElement(By.id("doc-orders")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-orders")).isEmpty());
        driver.findElement(By.id("doc-order_statuses")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-order_statuses")).isEmpty());
    }

    public void check_pages(){
        driver.findElement(By.cssSelector("a[href*=pages]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=pages]")).isEmpty());
        driver.findElement(By.id("doc-pages")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-pages")).isEmpty());
        driver.findElement(By.id("doc-csv")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-csv")).isEmpty());
    }

    public void check_reports(){
        driver.findElement(By.cssSelector("a[href*=monthly_sales]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=monthly_sales]")).isEmpty());
        driver.findElement(By.id("doc-monthly_sales")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-monthly_sales")).isEmpty());
        driver.findElement(By.id("doc-most_sold_products")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-most_sold_products")).isEmpty());
        driver.findElement(By.id("doc-most_shopping_customers")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-most_shopping_customers")).isEmpty());
    }

    public void check_settings(){
        driver.findElement(By.cssSelector("a[href*=store_info]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=store_info]")).isEmpty());
        driver.findElement(By.id("doc-store_info")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-store_info")).isEmpty());
        driver.findElement(By.id("doc-defaults")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-defaults")).isEmpty());
        driver.findElement(By.id("doc-general")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-general")).isEmpty());
        driver.findElement(By.id("doc-listings")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-listings")).isEmpty());
        driver.findElement(By.id("doc-images")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-images")).isEmpty());
        driver.findElement(By.id("doc-checkout")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-checkout")).isEmpty());
        driver.findElement(By.id("doc-advanced")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-advanced")).isEmpty());
        driver.findElement(By.id("doc-security")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-security")).isEmpty());
    }

    public void check_slides(){
        driver.findElement(By.cssSelector("a[href*=slides]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=slides]")).isEmpty());
    }
    public void check_tax(){
        driver.findElement(By.cssSelector("a[href*=tax_rates]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=tax_rates]")).isEmpty());
        driver.findElement(By.id("doc-tax_rates")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-tax_rates")).isEmpty());
        driver.findElement(By.id("doc-tax_classes")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-tax_classes")).isEmpty());
    }
    public void check_translations(){
        driver.findElement(By.cssSelector("a[href*=search]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=search]")).isEmpty());
        driver.findElement(By.id("doc-search")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-search")).isEmpty());
        driver.findElement(By.id("doc-scan")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-scan")).isEmpty());
        driver.findElement(By.id("doc-csv")).click();
        Assert.assertTrue(!driver.findElements(By.id("doc-csv")).isEmpty());
    }

    public void check_users(){
        driver.findElement(By.cssSelector("a[href*=users]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=users]")).isEmpty());
    }
    public void check_vqmods(){
        driver.findElement(By.cssSelector("a[href*=vqmods]")).click();
        Assert.assertTrue(!driver.findElements(By.cssSelector("a[href*=vqmods]")).isEmpty());
    }

    @After
    public void quitDriver() {
        driver.quit();

    }
}



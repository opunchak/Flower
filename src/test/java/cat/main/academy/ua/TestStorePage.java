package cat.main.academy.ua;

import org.junit.After;
import org.junit.Test;

public class TestStorePage extends BaseStorePage {

    @Test
    public void OpenStorePage() throws InterruptedException {
        check_open_store_page();
        check_go_to_store_page();
        check_find_duck();
        check_wait();

        // click view full page
        //driver.findElement(xpath(".//*[@id='view-full-page']/a")).click();

        check_seleck_2nd_option();
        check_add_to_cart();
        check_go_to_cart();
        check_redirection_to_the_shopping_cart();
        check_sign_in_for_buying();
        check_fill_required_city();
        check_confirm_changes();
        check_fill_required_phone();
        check_confirm_changes();
        checkInvalidPpostcode();
        checkClearInvalidPostcode();
        checkFillValidPostcode();
        check_confirm_changes();
        checkConfirmOrder();
        checkGoHomePage();
        checkSelectRecentlyItem();
        checkViewOnlyImage();
        checkCloseJustImage();
        checkCloseRecentlyViewed();
    }
    @After
    public void quitDriver() {
        driver.quit();
    }
}

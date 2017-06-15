package cat.main.academy.ua;

import org.junit.After;
import org.junit.Test;

public class TestLoginPage extends BaseLoginPage {

    @Test
    public void newUserLogin() {
        check_click_new_account();
        check_fill_first_name();
        check_fill_lastname();
        check_fill_address1();
        check_select_country();
        check_fill_email();
        check_fill_desired_password();
        check_fill_confirmed_password();
        check_confirm_sign_in();
        check_confirm_by_click_Create_button();
    }
    @After
    public void quitDriver() {
        driver.quit();}


}





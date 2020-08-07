package cz.brcls.seznam.selenium.tests;

import cz.brcls.seznam.selenium.test.SeznamUtils;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends SeznamTest{

    @Test
    public void loginWithValidCredentials(){
        driver.get(SeznamUtils.BASE_URL);
        loginPage.loginUser(USER, PASS);
        Assert.assertTrue(globalUtils.waitForElementXPath("//div[@class='content']//li[@class='wide unread']").isDisplayed());
    }

    @Test
    public void loginWithInvalidCredentials(){
        driver.get(SeznamUtils.BASE_URL);
        loginPage.loginUser(USER, WRONG_PASS);
//        Assert.assertTrue(globalUtils.waitForElementXPath("//form[@class='login']//p[@class='error']//i[contains(text(), 'Chybne zadané heslo alebo užívateľské meno']").isDisplayed());
        Assert.assertTrue(globalUtils.waitForElementXPath("//form[@class='login']//p[@class='error']//i").isDisplayed());
    }
}

package cz.brcls.seznam.selenium.test.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends GlobalUtils {

    public LoginPage(ChromeDriver driver) {
        super(driver);
    }

    public void loginUser(String user, String pass){
        if (!driver.getCurrentUrl().equals(BASE_URL)){
            driver.get(BASE_URL);
        }

        WebElement username = waitForElementName("username");
        username.sendKeys(user);
        WebElement password =waitForElementName("password");
        password.sendKeys(pass);
        WebElement loginButton = waitForElementXPath("//div[@class='content-unlogged']//button[contains(text(), 'Přejít do Emailu')]");
        loginButton.click();
    }
}

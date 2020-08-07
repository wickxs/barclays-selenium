package cz.brcls.seznam.selenium.tests;

import cz.brcls.seznam.selenium.test.objects.GlobalUtils;
import cz.brcls.seznam.selenium.test.objects.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class SeznamTest {
    public static final String USER = "testEmail121234";
    public static final String PASS = "TestHeslo1234";
    public static final String WRONG_PASS = "Testheslo123";

    public ChromeDriver driver;
    public GlobalUtils globalUtils;
    public LoginPage loginPage;

    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/win/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        globalUtils = new GlobalUtils(driver);
        loginPage = new LoginPage(driver);
    }

    @After
    public void tearDown() {
        driver.close();
    }
}

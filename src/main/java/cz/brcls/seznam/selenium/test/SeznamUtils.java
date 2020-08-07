package cz.brcls.seznam.selenium.test;

import org.openqa.selenium.chrome.ChromeDriver;

public abstract class SeznamUtils {
    public ChromeDriver driver;
    public static final String BASE_URL = "https://www.seznam.cz/";

    public SeznamUtils(ChromeDriver driver) {
        this.driver = driver;
    }
}

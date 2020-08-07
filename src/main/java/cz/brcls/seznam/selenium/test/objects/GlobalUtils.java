package cz.brcls.seznam.selenium.test.objects;

import cz.brcls.seznam.selenium.test.SeznamUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalUtils extends SeznamUtils {

    public GlobalUtils(ChromeDriver driver) {
        super(driver);
    }

    public WebElement waitForElementXPath(String xPath){
        return  new WebDriverWait(driver, 3)
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(xPath)));
    }

    public WebElement waitForElementName(String name){
        return  new WebDriverWait(driver, 3)
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.name(name)));
    }

    public WebElement waitForElementClassName(String className){
        return  new WebDriverWait(driver, 3)
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.className(className)));
    }
}

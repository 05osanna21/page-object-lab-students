package project.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.components.TopBar;
import project.components.TopMenu;

@Getter
public abstract class BasePage {

    private TopMenu topMenu;

    public BasePage(){
        this.topMenu = new TopMenu(driver);
    }
    private TopBar topbar;

    public BasePage(){
        this.topbar = new TopBar(driver);
    }

    //protected WebDriver variable (only classes in same folder (pages) will get driver)
    protected static WebDriver driver;

    //set driver for base page
    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    //method for get driver from any page
    public static WebDriver getDriver() {
        return driver;
    }

    protected WebElement find(By locator) {
        return getDriver().findElement(locator);
    }
    protected WebElement waitUntilVisible(By locator, int seconds){
        return new WebDriverWait(getDriver(),seconds)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}

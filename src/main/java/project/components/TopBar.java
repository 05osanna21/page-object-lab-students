package project.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import project.components.enums.Components;

import javax.swing.*;

public class TopBar {
    private static WebDriver webDriver;

    public TopBar(WebDriver driver) {
        webDriver = driver;
    }

    private By component = By.xpath("//li//a[text()='Components']");
    private By monitor = By.xpath("//a[text()='Monitors (2)']");

    public TopBar hoverOnComponents(){
        Actions action = new Actions(webDriver);
        action.moveToElement(webDriver.findElement(monitor)).build().perform();
        return this;
    }

    public TopBar selectComponen(Components topMenuItem) {
        Actions action = new Actions(webDriver);
        switch (topMenuItem) {
            case COMPONENTS:
                action.moveToElement(webDriver.findElement(component)).build().perform();
                break;
        }
            return this;


    }
}

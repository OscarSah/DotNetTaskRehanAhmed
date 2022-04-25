package com.gammaPortal.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class BrowsUtilities {


    public void datePickerByJs(WebDriver Driver, WebElement element, String dateValue) {
        JavascriptExecutor js = ((JavascriptExecutor) Driver);
        js.executeScript("arguments[0].setAttribute('value','" + dateValue + "');", element);
    }
}

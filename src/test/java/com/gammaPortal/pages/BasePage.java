package com.gammaPortal.pages;

import com.gammaPortal.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(id = "ParkingLot")
    public WebElement selectDropdown;

    @FindBy(xpath = "(//a/img)[1]")
    public WebElement dateFromOpt;

    @FindBy (xpath = "(//a[normalize-space()='26'])[1]")
    public WebElement JsdatePicker;

    @FindBy(id = "StartingTime")
    public WebElement startTimeFrom;

    @FindBy (id = "LeavingTime")
    public WebElement leaveTime;

    @FindBy(xpath = "(//a/img)[2]")
    public WebElement dateToOpt;


    @FindBy(css = "[name='Submit']")
    public WebElement calculate;

    @FindBy(xpath = "//*[@class='SubHead']/b")
    public WebElement actualCost;


//    public static void datePickerByJs(WebDriver Driver, WebElement element, String dateValue,String timeValue) {
//        JavascriptExecutor js = ((JavascriptExecutor) Driver);
//        js.executeScript("arguments[0].setAttribute('value','" + dateValue + "');", element);
//    }

    }



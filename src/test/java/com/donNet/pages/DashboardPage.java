package com.donNet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(id = "run-button")
    public WebElement runButton;

    @FindBy(id = "output")
    public WebElement outputText;

    @FindBy(css = "input[type='search']")
    public WebElement packageSearchBox;




}

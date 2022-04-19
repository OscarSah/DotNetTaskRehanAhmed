package com.donNet.pages;

import com.donNet.utilities.Driver;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public abstract class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

}

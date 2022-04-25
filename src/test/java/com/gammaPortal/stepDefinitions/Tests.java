package com.gammaPortal.stepDefinitions;

import com.gammaPortal.pages.BasePage;
import com.gammaPortal.utilities.BrowsUtilities;
import com.gammaPortal.utilities.ConfigurationReader;
import com.gammaPortal.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Tests {
    BasePage bpage = new BasePage();
    BrowsUtilities bu = new BrowsUtilities();



    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        Thread.sleep(5000);

    }

    @Given("the user selects the Valet parking lot")
    public void theUserSelectsTheValetParkingLot() {
        Select dropdown = new Select(bpage.selectDropdown);
        bpage.selectDropdown.click();
        dropdown.selectByVisibleText("Valet Parking");
//        Thread.sleep(2000);
//        dropdown.selectByVisibleText("Long-Term Garage Parking");
//        Thread.sleep(2000);

    }

    @When("the user select the current date as {string}")
    public void theUserSelectTheCurrentDateAs(String entryDate) throws InterruptedException {


        // Store the current window handle
        String winHandleBefore = Driver.get().getWindowHandle();


// Perform the click operation that opens new window

        bpage.dateFromOpt.click();

// Switch to new window opened
        for (String winHandle : Driver.get().getWindowHandles(){
            Driver.get().switchTo().window(winHandle);
        }

// Perform the actions on new window
        Driver.get().findElement(By.xpath("(//a[normalize-space()='" + entryDate + "'])[1]")).click();

// Close the new window, if that window no more required
        Driver.closeDriver();

// Switch back to original browser (first window)
        Driver.get().switchTo().window(winHandleBefore);

// Continue with original browser (first window)




//        //WebElement date = Driver.findElement(By.xpath("(//a/img)[1]"));
//        //String entryDate = "25/04/2022";
//
//        bu.datePickerByJs(Driver.get(), bpage.dateFromOpt, entryDate);

        Thread.sleep(5000);

    }

    @And("select time as {string}")
    public void selectTimeAs(String entryTime) throws InterruptedException {
        bpage.startTimeFrom.click();
        bpage.startTimeFrom.clear();
        bpage.startTimeFrom.sendKeys(entryTime);
        Thread.sleep(5000);
    }

    @And("selects exit date as {string} date and exit time as {string} with {int} hour's Difference")
    public void selectsExitDateAsDateAndExitTimeAsWithHourSDifference(String arg0, String arg1, int arg2) {
    }


    @Then("the calculated coast should be same as it appears in the table")
    public void theCalculatedCoastShouldBeSameAsItAppearsInTheTable() {
    }


}

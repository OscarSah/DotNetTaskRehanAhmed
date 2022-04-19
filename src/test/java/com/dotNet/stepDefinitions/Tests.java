package com.dotNet.stepDefinitions;

import com.dotNet.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Tests {

    DashboardPage dp = new DashboardPage();

    @When("the user click on the {string} Button")
    public void the_user_click_on_the_Button(String button) {
      dp.runButton.click();

    }
    @Then("the text {string} should appear on output window")
    public void the_text_should_appear_on_output_window(String expectedText) {

        String actualText = dp.outputText.getText();
        Assert.assertEquals(expectedText,actualText);

        //System.out.println("actualText = " + actualText);
    }


    @When("the name starts with the {string}")
    public void theNameStartsWithThe(String name) {

        if (name.startsWith("A-B-C-D-E")){
            //Select NuGet Packages: nUnit (3.12.0)
           //Check that nUnit package is added
            System.out.println("name = " + name);


        }else if (name.startsWith("F-G-H-I-J-K")){
            //Click “Share” button
            //Check that link starts with “https://dotnetfiddle.net/”
            System.out.println("name = " + name);

        }else if (name.startsWith("L-M-N-O")){

           // Click “<” button on “Options” panel to hide this panel
           // Check that “Options” panel is hidden

            System.out.println("name = " + name);

        }else if (name.startsWith("Q-R-S-T-U")){
            //Click “Save” button
            //Check that “Log In” window appeared

            System.out.println("name = " + name);

        }else if (name.startsWith("V-W-X-Y-Z")){
           //   Click “Getting Started” button
           // Check that “< Back to Editor” button appeared
            System.out.println("name = " + name);
        }


    }

//    @Then("the user should be able to select the package")
//    public void theUserShouldBeAbleToSelectThePackage() throws InterruptedException {
//
//        dp.packageSearchBox.click();
//        Thread.sleep(20);
//        dp.packageSearchBox.sendKeys("nUnit");



}

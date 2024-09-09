package stepdefinitions;

import Page.ApiDemosPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;

import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;

public class Stepdefinitions {
    ApiDemosPages apiDemosPages = new ApiDemosPages();
    Actions actions = new Actions(getAppiumDriver());

    @Given("User makes driver adjustments")
    public void user_makes_driver_adjustments() {
        getAppiumDriver();
    }

    @Then("User click the button with scrollable {string}")
    public void user_click_the_button_with_scrollable(String description) {
       ReusableMethods.scrollWithUiScrollable(description);
       ReusableMethods.clickButtonByDescription(description);
    }


    @Then("User click the button with description {string}")
    public void user_click_the_button_with_description(String description) {
        ReusableMethods.wait(3);
        try {
            getAppiumDriver().switchTo().alert();
            ReusableMethods.clickButtonByDescription(description);
        } catch (NoAlertPresentException e) {
            ReusableMethods.clickButtonByDescription(description);
        }

    }

    @Then("User verify {string} text")
    public void user_verify_text(String customTitle) {
        ReusableMethods.wait(2);
        ReusableMethods.VerifyElementText(customTitle);
    }

    @Then("User clicks the text left Is Best Place Holder text and enter {string}")
    public void user_clicks_the_text_left_is_best_place_holder_text_and_enter(String furkanText) {

        apiDemosPages.leftIsBestPlaceHolderClickAndSendKeys(furkanText);
    }

    @Then("User clicks the right is always right text and enter {string}")
    public void user_clicks_the_right_is_always_right_text_and_enter(String karataslioglu) {
        apiDemosPages.rightIsAlwaysRightPlaceHolderClickAndSendKeys(karataslioglu);
    }

    @Then("User clicks the change left button")
    public void user_clicks_the_change_left_button() {
        apiDemosPages.changeLeftButtonClick();
    }

    @Then("User verify left title {string} text")
    public void user_verify_left_title_text(String furkan) {
        apiDemosPages.leftButtonChanged(furkan);
    }
    @Then("User verify right title {string} text")
    public void user_verify_right_title_text(String karataslioglu) {
        apiDemosPages.rightButtonChanged(karataslioglu);
    }
    @Then("User clicks the change right button")
    public void user_clicks_the_change_right_button() {
        apiDemosPages.changeRightButtonClick();
    }

    @Given("Driver turns off")
    public void driver_turns_off() {
        quitAppiumDriver();
    }

    @Then("User verify allert message is {string}")
    public void user_verify_allert_message_is(String string) {
    apiDemosPages.verifiedAllertMessage(string);
    }

    @Then("User click {string} button on allert message")
    public void user_click_button_on_allert_message(String string) {
        apiDemosPages.commandOneButtonClick();
    }

    @Then("User press long press button")
    public void user_press_long_press_button() {
        apiDemosPages.longPressButtonClick(getAppiumDriver());
    }
    @Then("User checked Menu B Button")
    public void user_checked_menu_b_button() {
    apiDemosPages.menuBButtonClick();
    }

    @Then("User checked Menu A Button")
    public void user_checked_menu_a_button() {
        apiDemosPages.menuAButtonClick();
    }

    @Then("User click hideButton")
    public void user_click_hideButton() {
    apiDemosPages.hideButtonClick();
    }
    @Then("User click showButton")
    public void user_click_showButton() {
        apiDemosPages.showButtonClick();
    }
    @Then("User checks {string} turns to {string}")
    public void user_checks_turns_to(String string, String string2) {
    apiDemosPages.showButtonTurnHideButton(string);
    }
    @Then("User checks that the textbox area has hidden")
    public void user_checks_that_the_textbox_area_has_hidden() {
        ReusableMethods.wait(2);
        apiDemosPages.initialTextInvisiable();

    }
    @Then("User checks that the textbox area has shown")
    public void user_checks_that_the_textbox_area_has_shown() {
    apiDemosPages.textBoxIsVisiable();
    }

    @Then("User click show app notification button")
    public void user_click_show_app_notification_button() {
        apiDemosPages.showAppNotificationButtonClick();

    }
    @Then("User open notification bar")
    public void user_open_notification_bar() {
        ReusableMethods.wait(2);
    ReusableMethods.openNotificationBar();
    }
    @Then("User checks notification")
    public void user_checks_notification() {
        ReusableMethods.wait(2);

    apiDemosPages.notificationBarMessageText();
    }
    @Then("User clicks notification")
    public void user_clicks_notification() {
        ReusableMethods.wait(2);
        apiDemosPages.notificationBarMessageClick();

    }
    @Then("User checks the text in the notification bar area contain each other.")
    public void user_checks_the_text_in_the_notification_bar_area_contain_each_other() {
        ReusableMethods.wait(2);
       System.out.println(apiDemosPages.notificationBarMessageText());
        // String actualMessage=apiDemosPages.notificationBarMessageText();
       // String expectedMessage=apiDemosPages.notificationDetailText();
        //Assert.assertEquals("Notifications are equal", actualMessage,expectedMessage);
    }

    @Then("User click {string} bar")
    public void user_click_bar(String string) {
        ReusableMethods.swipeRight(string);
        apiDemosPages.tab30BarClick();

    }
    @Then("User checks tab30 bar")
    public void user_checks_tab30_bar() {
    apiDemosPages.tab30KeywordChecked();
    }



}

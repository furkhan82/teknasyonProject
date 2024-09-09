package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

public class ApiDemosPages {
    public ApiDemosPages(){
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);


    }
    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"Left is best\"]")
    private WebElement leftTitle;
    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"Right is always right\"]")
    private WebElement rightTitle;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Left is best\"]")
    private WebElement leftIsBestText;
    @AndroidFindBy (xpath = "//android.widget.EditText[@content-desc=\"Left is best\"]")
    private WebElement leftIsBestPlaceHolder;
    @AndroidFindBy (xpath = "//android.widget.EditText[@content-desc=\"Right is always right\"]")
    private WebElement rightIsAlwaysRightPlaceHolder;
    @AndroidFindBy (xpath = "//android.widget.Button[@content-desc=\"Change Left\"]")
    private WebElement changeLeftButton;
    @AndroidFindBy (xpath = "//android.widget.Button[@content-desc=\"Change Right\"]")
    private WebElement changeRightButton;
    @AndroidFindBy (xpath = "//android.widget.TextView[@resource-id=\"android:id/message\"]")
    private WebElement allertMessage;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Command one\")")
    private WebElement commandOneButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Long press me\"]")
    private WebElement longPressButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Menu A\"]")
    private WebElement menuAButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Menu B\"]")
    private WebElement menuBButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"io.appium.android.apis:id/frag1hide\"]")
    private WebElement hidenButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"io.appium.android.apis:id/frag1show\"]")
    private WebElement showButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"io.appium.android.apis:id/msg\" and @text=\"The fragment saves and restores this text.\"]")
    private WebElement initialText;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Show App Notification\"]")
    private WebElement showAppNotificationButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text\")")
    private WebElement notificationBarMessage;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"io.appium.android.apis:id/message\"]")
    private WebElement notificationDetail;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"TAB 30\"]")
    private WebElement tab30Bar;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Content for tab with tag Tab 30\"]")
    private WebElement tab30Text;





    public String notificationDetailText(){
        return notificationDetail.getText();
    }

    public void tab30KeywordChecked(){
        String text = tab30Text.getText();

        // Metin içinde belirli bir kelime var mı kontrol edin
        if (text.contains("Tab 30")) {
            System.out.println("Metin 'Tab 30' kelimesini içeriyor.");
        } else {
            System.out.println("Metin 'Tab 30' kelimesini içermiyor.");
        }
    }


    public void tab30BarClick(){
        tab30Bar.click();
    }

public String notificationBarMessageText(){

    return notificationBarMessage.getText();


}
    public void notificationBarMessageClick(){

        notificationBarMessage.click();
    }

    public void commandOneButtonClick(){
        commandOneButton.click();
    }
    public void showAppNotificationButtonClick(){
        showAppNotificationButton.click();
    }

    public void initialTextInvisiable(){
    try {
        boolean x = initialText.isDisplayed();
        System.out.println("Is TextBox invisible?: " + !x);
        }
    catch (NoSuchElementException e) {
        System.out.println("Is TextBox invisible?: true");
        }
    }

    public void showButtonClick(){
        System.out.println("After click hide button: "+hidenButton.getText());

        hidenButton.click();
    }
    public void hideButtonClick(){
        hidenButton.click();
    }
    public void showButtonTurnHideButton(String string){
        System.out.println("After click "+string+" :"+hidenButton.getText());
    }

    public void textBoxIsVisiable(){
        System.out.println("TextBox is Visiable? :"+initialText.isDisplayed());
    }


    public void menuAButtonClick(){
        System.out.println("Menu A acildigi goruldu: "+menuAButton.getText());
    }

    public void menuBButtonClick(){
        System.out.println("Menu B acildigi boruldu: "+menuBButton.getText());
    }

    public void longPressButtonClick(AppiumDriver driver){
        Actions actions = new Actions(driver);
        actions.clickAndHold(longPressButton)
                .pause(Duration.ofSeconds(3))
                .release()
                .perform();
    }

    public void leftIsBestPlaceHolderClickAndSendKeys(String furkanText){
        assertTrue(leftIsBestPlaceHolder.isDisplayed());
        leftIsBestPlaceHolder.click();
        leftIsBestPlaceHolder.clear();
        leftIsBestPlaceHolder.sendKeys(furkanText);
    }
    public void rightIsAlwaysRightPlaceHolderClickAndSendKeys(String furkanText){
        assertTrue(rightIsAlwaysRightPlaceHolder.isDisplayed());
        rightIsAlwaysRightPlaceHolder.click();
        rightIsAlwaysRightPlaceHolder.clear();
        rightIsAlwaysRightPlaceHolder.sendKeys(furkanText);
    }

    public void changeLeftButtonClick(){
        assertTrue(changeLeftButton.isDisplayed());
        changeLeftButton.click();
    }
    public void changeRightButtonClick(){
        assertTrue(changeRightButton.isDisplayed());
        changeRightButton.click();
    }

    public void leftButtonChanged(String furkan){
        assertTrue(furkan,leftTitle.isDisplayed());
    }
    public void rightButtonChanged(String karataslioglu){
        assertTrue(karataslioglu,rightTitle.isDisplayed());
    }
    public void verifiedAllertMessage(String string){
        String actualAllertMessage= allertMessage.getText();
        Assert.assertEquals("selected element equals actual allert message",string, actualAllertMessage);

    }


}

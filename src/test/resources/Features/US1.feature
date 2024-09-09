@all
Feature:US1
  Background: User opens the app
    Given User makes driver adjustments
    @1
  Scenario: User changes left and right textbox
    Then User click the button with description "App"
    Then User click the button with description "Activity"
    Then User click the button with description "Custom Title"
    Then User verify "Left is best" text
    Then User verify "Right is always right" text
    Then User clicks the text left Is Best Place Holder text and enter "furkan"
    Then User clicks the change left button
    Then User clicks the right is always right text and enter "Karataslioglu"
    Then User clicks the change right button
    Then User verify left title "furkan" text
    Then User verify right title "Karataslioglu" text
    Given Driver turns off

    @2
  Scenario: User selects any element in list dialog menu
    Then User click the button with description "App"
    Then User click the button with description "Alert Dialogs"
    Then User click the button with description "List dialog"
    Then User click "Command one" button on allert message
    Then User verify allert message is "You selected: 0 , Command one"
      Given Driver turns off
  @3
  Scenario:User long press and checked A and B menu
    Then User click the button with description "App"
    Then User click the button with description "Fragment"
    Then User click the button with description "Context Menu"
    Then User press long press button
    Then User checked Menu A Button
    Then User checked Menu B Button
    Given Driver turns off
  @4
  Scenario: Hide and Show Buttons action
    Then User click the button with description "App"
    Then User click the button with description "Fragment"
    Then User click the button with description "Hide and Show"
    Then User click hideButton
    Then User checks "hideButton" turns to "showButton"
    Then User checks that the textbox area has hidden
    Then User click showButton
    Then User checks "showButton" turns to "hideButton"
    Then User checks that the textbox area has shown
    Given Driver turns off
  @5
  Scenario:Notification bar actions
    Then User click the button with description "App"
    Then User click the button with description "Notification"
    Then User click the button with description "IncomingMessage"
    Then User click show app notification button
    Then User open notification bar
    Then User checks notification
    Then User clicks notification
    #Then User checks the text in the notification bar area contain each other.
    Given Driver turns off

  @6
  Scenario: Tab Menus
    Then User click the button with description "Views"
    Then User click the button with scrollable "Tabs"
    Then User click the button with description "5. Scrollable"
    Then User click "TAB 30" bar
    Then User checks tab30 bar
    Given Driver turns off
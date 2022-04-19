Feature:Add Event Functionalities


  Scenario: Test 1
    When the user click on the "Run" Button
    Then the text "Hello World" should appear on output window

  @wip
  Scenario Outline: Test 2
    When the name starts with the "<name>"
    Then the user should be able to select the package

    Examples:

      | name     |
      | Andy     |
      | Fredrick |
      | Peter    |
      | Steave   |
      | Zain     |


Feature:Parking Calculator

  Background:
    Given the user is on the home page

  @wip
  Scenario Outline: Test 1
    Given the user selects the Valet parking lot
    When the user select the current date as "<entryDate>"
    And select time as "<entryTime>"
    And selects exit date as "<exitDate>" date and exit time as "<exitTime>" with 24 hour's Difference
    Then the calculated coast should be same as it appears in the table

    Examples:
      | entryDate  | entryTime | exitDate   | exitTime |
      | 04/20/2022 | 09:00     | 04/25/2022 | 09:00    |


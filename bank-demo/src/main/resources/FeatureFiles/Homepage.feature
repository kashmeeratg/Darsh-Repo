#Author: Kashmeera
Feature: Customer creation and Login

  @tag1
  Scenario Outline: Customer Page validation with an exsisting cutomer
    Given User is on homepage
    When User enters <username> and <password>
    And User clicks on Login button
    Then validate the cutomer page is displayed.
    Then close the browser

    Examples: 
      | username  | password    |
      | arun      | password    |
      | arun      | password    |
      | kashmeera | password123 |
      | arun      | password    |


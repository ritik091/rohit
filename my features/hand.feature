Feature: Testme Validations

  Background: TestMeApp APP LNCH
    Given User Launches App

  Scenario Outline: Login for TestMeApp
    Given User enters username "<user>"
    Then User enters password "<pass>"
        Then User clicks on Login
    Then User clicks on AllCategories
    Then User clicks on Electronics
    Then User clicks on Headphone
    Then User clicks on Add to cart
    Then User clicks on cart
    Then User clicks on cart
    Then User clicks on Remove and close the App

    Examples: 
      | Username | Password |
      | Amit     |      123 |
      | ragav    |      345 |
      | rohit    |      135 |

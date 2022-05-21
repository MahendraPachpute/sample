Feature: test functionality on OrangeHRM

  Scenario: test login functionality
    Given user is on OrangeHrm
    When user enters valid credentials
    Then user in on homepage

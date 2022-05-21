Feature: facebook page test functionality

  Scenario: login to facebook
    Given user is on facebook
    Then login valid credentials
    And user is on homepage

Feature: Login functionality

  Scenario: User logs in with valid credentials
    Given user launches the application
    When user logs in with username "user1" and password "pass1"
    Then user should see the dashboard
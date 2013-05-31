Feature: Say hello feature

  Scenario: The app will show a default greeting
    Then I should see "Greet"
    And I should see "Prepare to be greeted..."

  Scenario: As a user the app will greet me
    When I press "Greet"
    Then I see "Hello, how are you?"

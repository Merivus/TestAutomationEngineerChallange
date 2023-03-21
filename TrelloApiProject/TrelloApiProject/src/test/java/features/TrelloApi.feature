Feature: Trello.comApiTestAutomationScenarios

  Scenario: I create a new organization
    Given I create a new organization
    Then I should see new organization is created
    Then I update an organization
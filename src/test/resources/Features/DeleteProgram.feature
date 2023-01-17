Feature: Feature to delete a Program by Id

  Scenario: Delete Program by Id
    Given The end point of API with base URL
    When Program ID is entered
    And Click on Delete or Send button
    Then Return the success response code and delete the program

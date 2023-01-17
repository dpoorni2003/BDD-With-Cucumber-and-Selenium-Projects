Feature: Feature to delete a Batch by Id

  Scenario: Delete Batch by Id
    Given The end point of API with base URL for Batch
    When Batch ID is entered
    And Click on Delete or Send button for Batch
    Then Return the success response code and delete the batch

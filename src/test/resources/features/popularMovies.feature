Feature: Popular Movies Validation

  Scenario: Popular Movie Navigation
    Given I am on the HomePage
    When I click on the firstMovie Item from popular movie list
    Then I shall see Movie details of that first movie

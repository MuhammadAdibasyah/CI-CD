@books
Feature: As a user I want to check book in bookstore So that i visit to bookstore

  Scenario: GET - As admin I have be able to see existing book
    Given I set GET api endpoints
    When  I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail book existing



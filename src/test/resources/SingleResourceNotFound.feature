Feature: Single resource not found
  Scenario: Get list of users
    Given url https://reqres.in/api/unknown/23
    When the user requests single resource
    And the user uses  GET method
    Then status is 404 and matches with response type "application/json; charset=utf-8"
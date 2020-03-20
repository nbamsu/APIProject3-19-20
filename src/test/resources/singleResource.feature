Feature: single resource
  Background: open the page
    Given url
    Scenario:
      When method "GET"
      Then Status "code"
      And verify match response
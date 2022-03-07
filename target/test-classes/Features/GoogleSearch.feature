Feature: google search
  Scenario: validate google search is working
    Given google.com is browsed
    When google enters a text
    Then user is navigated to search results
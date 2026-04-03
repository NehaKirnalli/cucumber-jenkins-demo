Feature: Google Search

  Scenario: Search test
    Given user is on Google page
    When user searches for "ChatGPT"
    Then results should be displayed
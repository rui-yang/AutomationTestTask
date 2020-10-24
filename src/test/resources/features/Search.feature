Feature: Search an article
  As a tester, I’d like to confirm data on an Article without relying on a manual search.

  Scenario: Search an article from wikipedia
    Given I am on Google Homepage
    When I navigate to wikipedia page
    Then I should see the search box
    When I search "Giga Berlin"
    And I select the suggested result
    Then I should see the coordinates of the location
    And I should see logistics content
    And I should see site concerns content

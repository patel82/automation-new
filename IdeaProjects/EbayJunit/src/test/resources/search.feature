@A-Search
Feature: Search
  As an end user
  I want to search a product
  So that i can view or buy a product of my choice

  @allenv @smoke @cp-301
  Scenario: do search
    Given   User is on homepage
    When    User do a search a product "Mobile Phones"
    Then    User should see a respective products
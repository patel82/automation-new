@A-Basket
Feature: Basket
  As an end user
  I want to add a product into basket
  So that i can view selected product of my choice into basket

  @allenv @smoke @US-201
  Scenario: add product into basket
    Given   User is on homepage
    When    User do a search a product "vegetables"
    And     User select one product
    Then    User add that product to basket
    And     User go to basket
    And     User should see a selected product into basket
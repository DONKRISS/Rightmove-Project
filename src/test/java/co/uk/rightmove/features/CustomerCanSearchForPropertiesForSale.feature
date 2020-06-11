Feature: Search property for sale
  As a customer
  I want the ability to search for any property of my choice
  So that i can chose one to buy

  Scenario Outline: Customer can Search for any property to buy
    Given i navigate to Rightmove homepage
    And i enter "<Location>" into search field
    And i click for sale button
    When i select "<Miles>" from Search radius
    And i select "<MinPrice>" from Price range
    And i select "<MaxPrice>" from Price range
    And i select "<NoOfBedroomMin>" from No.of bedrooms
    And i select "<NoOfBedroomMax>" from No.of bedrooms
    And i select "<any>" from Property type
    And i select "<PropertyType>" from Added to site
    And i click on Find properties
    Then the search for "<Location>" is displayed

    Examples:
      |Location   | Miles          | MinPrice  | MaxPrice | NoOfBedroomMax | NoOfBedroomMin  | PropertyType|
      |Sunderland | This area only | No min    | No max   |  No max        |  No min         | Any         |
      |Sunderland | This area only | No min    | £20000000   |  No max     |  No min         | Any         |
      |Sunderland | This area only | £50000   | No max   |  No max          |  No min         | Any         |
      |Sunderland | This area only | £50000   | £20000000   |  No max       |  No min         | Any         |
      |Sunderland | 4               | No min    | No max   |  No max       |  No min         | Any         |
      |Sunderland | This area only | No min    | No max   |  5             |  No min         | Any         |
      |Sunderland | This area only | No min    | No max   |  No max        |  Studio         | Any         |
      |Sunderland | This area only | 50000   | £20000000   |  No max       |  No min         | House       |
      |SR4 6BS    | This area only | 50000   | £20000000   |  No max       |  No min         | Any         |
      |Sunderland interchange  | This area only | £50000   | £20000000   |  No max       |  No min         | Any   |
      |SR4       | This area only | £50000   | £20000000   |  No max       |  No min         | Any         |





Feature: Search property for sale
  As a customer
  I want the ability to search for any property of my choice
  So that i can chose one to buy

  Scenario Outline: Customer can Search for any property
    Given i navigate to Rightmove homepage
    And i enter "<Location>" into search field
    And i click for rent button
    When i select "<SearchRadius>" from Search radius for sale
    And i select "<MinPrice>" from minPrice range for sale
    And i select "<MaxPrice>" from maxPrice range for sale
    And i select "<NoOfBedroomMin>" from No.of bedrooms for sale
    And i select "<NoOfBedroomMax>" from No.of bedrooms for sale
   And i select "<PropertyType>" from Property type for sale
    And i select "<WhenAddedToSite>" from Added to site
    And i click on Find properties
    Then the search for "<Location>" is displayed for sale

    Examples:
      |Location   | SearchRadius        | MinPrice         | MaxPrice          | NoOfBedroomMax     | NoOfBedroomMin           | PropertyType|   WhenAddedToSite
     |Sunderland  | Within 3 miles       | 60,000           | 140,000          |  3                   |  5                       | Houses        |Last 3 days
#    |Sunderland | This area only | No min    | £20,000,000   |  No max         |  No min              | Any                                      |             |
#     |Sunderland | This area only | 50,000   | No max   |  No max                             |  No min                       | Any        |
#      |Sunderland | This area only | 50,000   | 20,000,000   |  No max                        |  No min                     | Any        |
#      |Sunderland | Within 5 miles              | No min    | No max   |  No max               |  No min                    | Any         |
#      |Sunderland | This area only | No min    | No max   |  5                                 |  No min                        | Any         |
#      |Sunderland | Within 1/4 miles | No min    | No max   |  No max                            |  Studio                        | Any         |
#      |Sunderland | This area only | 50,000   | 20,000,000   |  No max                          |  No min                      | House       |
#      |SR4 6BS    | Within 30 miles | 50,000   | 20,000,000   |  No max                          |  No min                      | Any         |
#      |Sunderland interchange  | This area only | 50,000   | 20,000,000   |  No max              |  No min        | Any   |
#      |SR4       | This area only | 50,000   | 20,000,000   |  No max                             |  No min                         | Any         |

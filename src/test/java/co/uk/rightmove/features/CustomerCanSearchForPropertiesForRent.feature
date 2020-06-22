#Feature: House For Rent
#As a customer
#I want the ability to search for any property of my choice
#So that i can chose one to Rent
#
#  Scenario Outline: Customer can Search for any property
#    Given i navigate to Rightmove homepage
#    And i enter "<Location>" into search field
#    And i click for rent button
#    When i select "<Miles>" from Search radius for rent
#    And i select "<MinPrice>" from Price range for rent
#    And i select "<MaxPrice>" from Price range for rent
#    And i select "<NoOfBedroomMin>" from No.of bedrooms for rent
#    And i select "<NoOfBedroomMax>" from No.of bedrooms for rent
#    And i select "<any>" from Property type for rent
#    And i select "<PropertyType>" from Added to site
#    And i click on Find properties
#    Then the search for "<Location>" is displayed for rent
#
#    Examples:
#      |Location   | Miles          | MinPrice  | MaxPrice | NoOfBedroomMax | NoOfBedroomMin  | PropertyType|
#      |Sunderland | This area only | No min    | No max   |  No max        |  No min         | Any         |
#      |Sunderland | This area only | No min    | £40000 PCM   |  No max     |  No min         | Any         |
#      |Sunderland | This area only | £100 PCM   | No max   |  No max          |  No min         | Any         |
#      |Sunderland | This area only | £100 PCM |£40000 PCM  |  No max       |  No min         | Any         |
#      |Sunderland | 2            | No min    | No max   |  No max       |  No min         | Any         |
#      |Sunderland | This area only | No min    | No max   | 3           |  No min         | Any         |
#      |Sunderland | This area only | No min    | No max   |  No max        |  Studio         | Any         |
#      |Sunderland | This area only |  £100 PCM  |£40000 PCM  |  No max       |  No min         | House       |
#      |SR4 6BS    | This area only |£100 PCM|£40000 PCM |  No max       |  No min         | Any         |
#      |Sunderland interchange  | This area only | £100 PCM |£40000 PCM |  No max       |  No min         | Any   |
#      |SR4       | This area only | £100 PCM |£40000 PCM  |  No max       |  No min         | Any         |

Feature: Find Agent
  As a customer
  I want the ability to search for any property Agent
  So that i can chose one to contact

  Scenario Outline: Customer can Search for estate Agents
    Given i navigate to Rightmove homepage
    And i click on Find Agent
    And i select Find estate Agent from the dropdown
    When i enter "<Location>" into search field
    And i select "<Miles>" from Search radius
    And i enter "<AgentName>" on the search Bar for estate Agents
    And i select "<AgentType >" Agent types for estate Agents
    And i click start search button for estate Agents
    Then List of estate agents should be displayed for estate Agents


Examples:
      |Location   | Miles          | AgentType             | AgentName|
      |Sunderland | 3              | Sales and Lettings    |any       |
      |Sunderland | This area only | Sales                 |          |
      |Sunderland | This area only | Lettings              |          |

  Scenario Outline: Customer can Search for property valuation
    Given i navigate to Rightmove homepage
    And i click on Find Agent
    And i select property valuation from the dropdown
    When i enter "<Postcode>" into search field
    And i click next button
    And i select property address from the dropdown for property valuation
    And  i input "<FirstName>"into the first name field for property valuation
    And i input "<LastName>"into the Last name field for property valuation
    And i input "<Email>"into the Email field for property valuation
    And i input "<TelephoneNumber>"into the telephone number field for property valuation
    And i input "<YourMessage>"into the Message field for property valuation
    Then i click on request valuation button for property valuation
    And a message sent confirmation page is displayed for property valuation


    Examples:
      |Postcode   | FirstName          | LastName             | Email| TelephoneNumber|YourMessage                         |
      |sr4 6bs    |Jemes               | young   |jamesyoung@gmail.com|07558844724    |i want to know the value of my house|

  Scenario Outline: Customer cannot Search for property valuation
    Given i navigate to Rightmove homepage
    And i click on Find Agent
    And i select property valuation from the dropdown
    When i enter "<Postcode>" into search field
    And i click next button
    And i select property address from the dropdown
    And  i input "<FirstName>"into the first name field
    And i input "<LastName>"into the Last name field
    And i dont input "<Email>"into the Email field
    And i dont input "<TelephoneNumber>"into the telephone number field
    And i input "<YourMessage>"into the Message field
    Then i click on request valuation button
    And an error message  as "<Message>" is displayed


    Examples:
      |Postcode   | FirstName          | LastName             | Email| TelephoneNumber|Message                         |
      |sr4 6bs    |Jemes               | young   |jamesyoung         |07558844724    |Please enter a valid email |
      |sr4 6bs    |Jemes               | young   |jamesyoung@gmail.com        |         |Please enter a valid email |




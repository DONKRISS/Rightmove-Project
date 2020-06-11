Feature: Sign in
  As a customer
  I want the ability to sign into my account
  so that i can manage my account

  Scenario Outline: User can sign ino account
    Given i navigate to Rightmove homepage
    And i click on sign in button
    When i enter an email as "<Email>" into the email field
    And i enter a password as "<Password>" into the password field
    And i click on sign in button
    Then my account page should be opened
    And a personal welcome message as "<Message>" is displayed

    Examples:
    |Email                          |Password                          |Message|
    |hotasfire@fire.com             |soloadmin                          |Welcome Mr james|


  Scenario Outline: User can not sign ino account
    Given i navigate to Rightmove homepage
    And i click on sign in button
    When i enter an email as "<Email>" into the email field
    And i enter a password as "<Password>" into the password field
    And i click on sign in button
    Then my account page should not be opened
    And an error message  as "<Message>" is displayed

    Examples:
      |Email                           |Password           |Message
      |hhotasfire@fire.com             |soloadmin         |We cannot find an account with the email address and/or password that you have used.
      |hotasfire@fire.com              |oloadmin           |We cannot find an account with the email address and/or password that you have used.
      |hhotasfire@fire.com             |soloadmin         |We cannot find an account with the email address and/or password that you have used.
      |                                |                   |We cannot find an account with the email address and/or password that you have used.
      |hhotasfire@fire.com             |soloadmin         |We cannot find an account with the email address and/or password that you have used.
      |hhotasfire@fire.com             |solo              |Please use a password with at least 6 characters.
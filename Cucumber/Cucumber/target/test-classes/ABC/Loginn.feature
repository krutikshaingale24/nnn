Feature: Login to saucedemo


  Rule: Verify login
    Scenario : Verify User not login with invalid credentials
      Given Open saucedemo application
      When Enter valid username
      When Enter a invalid password
      And click on OK
      Then Verify Error message
      And Close window


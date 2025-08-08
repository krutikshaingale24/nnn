Feature: Login to saucedemo


  Rule: Verify login
#    Scenario : Verify User not login with invalid credentials
#      Given Open saucedemo application
#      When Enter valid username
#      When Enter a invalid password
#      And click on OK
#      Then Verify Error message
#      And Close window

    Scenario Outline: Verify Swag Lab text on saucedemo login page
      Given Open saucedemo application
      When Enter valid username "<username>"
      When Enter valid password "<password>"
      And click on OK
      Then Verify Swag Lab text on saucedemo login page
  And Close window
      Examples:
        | username | password |
        | standard_user          | secret_sauce |
        | locked_out_user     | secret_sauce |
        | performance_glitch_user | secret_sauce |

@smoke
Scenario: Verify Cart logo
  Given Open saucedemo application
      When Enter valid username
      When Enter a valid password
      And click on OK
      Then Verify cart logo message






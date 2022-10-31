Feature: Register

  Scenario: User Registration
    Given Launch browser
    And Open URL
    When User click on Register
    And User Enter details info
    And User click on submit button
    Then User get thank you message
    And Close the browser
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

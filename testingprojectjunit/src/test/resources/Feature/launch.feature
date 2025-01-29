#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Pageload
  Scenario: Opening flight booking webpage
    Given The flight booking webpage opened
    And Login promt has been
    When pushnotification prompt has been dismissed
    And Login prompt has been dismissed
    Then The trip modes are accessible

  @Search
  Scenario Outline: Search Flight booking
    Given The webpage is loaded with expected title
    And I want to select source as <Source>
    And I want to select destination <Destination>
    When The date selected as 25/01/2025
    Then I verify the <status> in step

    Examples: 
      | Source     | Destination | status  |
      | Coimbatore | Chennai     | success |
      | Coimbatore | Dubai       | Fail    |

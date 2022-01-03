Feature: To validate the registration funcationallity of BharathMatrimony

  Scenario Outline: To fill the registration part
    Given The user should be in BharathMatrimony Registation page "<url>" and "<browser>"
    When The user has to fill Requried Credential
    And The user has to click Register free
    And The user hast to fill basic details
    And The user has to click first Continue button
    And The user hast to fill Religion details
    And The user has to click second Continue button
    And The user hast to fill personal details
    And The user has to click third Continue button
    And The user hast to fill Professional details
    And The user has to click forth Continue button
    And The user hast to write comments
    And The user has to click fifth Continue button
    And The user has to complete mobile verification
    Then The user navigate to nextpage

    Examples: 
      | url                             | browser |
      | https://www.bharatmatrimony.com | Edge  |

Feature: Post Method 
    Scenario: Check when no ProgramName is  given
    Given User set POST API endpoint
    When User left the program name  field blank ,valid program description,valid online status
    Then User should Receive a error message 

    Scenario: Check when Program Description is Blank
    Given User set POST API endpoint
    When User enter a valid programname, blank program description,valid online status
    Then User should receive a status 200 message
    Scenario: Check when Online field is left Blank
    Given User set POST API endpoint
    When User enters valid program name,valid program description,Blank online status field
    Then User should receive a status message
    Scenario: Check when Online field is entered with numbers
    Given User set POST API endpoint
    When User enters a record with programid, programName, programDescription and number in Online field
    Then User receives status message

    

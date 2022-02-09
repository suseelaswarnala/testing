Feature: Put Method for User
  
  Scenario: Check if we can update the existing programId
    Given User set PUT API endpoint 
    When User add an existing programid  with new programName,new programDescription and new online status 
    Then User should receive a valid status code in response 
   Scenario: check if we can update the non existing programId
    Given User set PUT API endpoint
    When User enters an none existing program Id,valid program name,valid program description,valid online status
    Then User should receive Status should be 400 Bad Request
    Scenario: check if we can update with ProgramId as null
    Given User set PUT API endpoint
    When User enters  null programID,valid program name,valid program description,valid online status
    Then User recieves status 400 Bad Request
    Scenario: Check if we update using programId as alphanumeric
    Given User set PUT API endpoint
    When User specifies an existing programid as alphanumeric  with new programName,new programDescription and new online field
    Then User receives 405 Method not allowed message
    Scenario: Check when we update the Program Description
    Given User set PUT API endpoint
    When User enters an  existing program Id,valid new program name,valid program description,valid online status
    Then User should receive a status 200 OK message
    Scenario: Check when ProgramDescription is number or alphanumeric
    Given User set PUT API endpoint
    When User enter an existing program Id,valid  program name,alphanumeric  program description,valid online status
    Then User should receive a valid status 200 code in response
    

  

    

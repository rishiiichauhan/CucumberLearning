Feature: Student Registration
  
  As a anonymous user
  I want to sign up
  So that I can login successfully

  @Urgent
  Scenario Outline: Register as a student by filling the details in practice form
    Given User is on the registration page "https://demoqa.com/automation-practice-form"
    And User enter the First name as "Rajesh" and Last name as "Chauhan"
    When User enter the Email address as "rajesh@gmail.com"
    And User select the gender as "Male"
    And User enter the mobile number as "8591982293"
    And User select the date of birth
    And User select the Subject as "<Subject>"
    And User select the hobbies as "<Hobbies>"
    And User upload the image
    And User enter the address as "<Address>"
    And User select state as "NCR" and city as "Delhi"
    And User click on the Submit button
    Then User should be able to register
    Then User enters different values "123" and "test" and "2.5" and "8768368263862" and "TestABC"

    Examples: 
      | Subject | Hobbies | Address    |
      | Science | Music   | TDI Mohali |

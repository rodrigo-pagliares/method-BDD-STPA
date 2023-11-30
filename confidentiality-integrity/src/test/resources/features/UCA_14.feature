Feature: UCA-14
  Scenario: Authenticator not provided request role when username is valid and password is valid
    Given username is valid and password is valid
    When Authenticator not provided request role
    Then Authenticator must provided request role when username is valid and password is valid
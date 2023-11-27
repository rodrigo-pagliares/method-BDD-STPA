Feature: UCA-14
  Scenario: Authenticator not provided fetch role when username is valid and password is valid
    Given username is valid and password is valid
    When Authenticator not provided fetch role
    Then Authenticator must provided fetch role when username is valid and password is valid
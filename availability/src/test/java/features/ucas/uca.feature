Feature: Authorizer

  Background:
    * url 'http://localhost:8080/'
    * configure readTimeout = 1000
    * configure connectTimeout = 1000

  Scenario: : Authorizer provides fetch role too early When username is provided and password is provided
    Given path 'login'
    And form field username = 'user@email.com'
    And form field password = 'password@123'
    When path 'home-user'
    And method get
    Then status 401


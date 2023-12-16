Feature: POST Test Swagger

  Background:
    Given url baseURL
    Given header Accept = 'application/json'
    And print "---ini tugas post test Swagger---"
    * def body = {"id":123,"username": "bisma","firstName": "string","lastName": "string","email": "string","password": "string","phone": "string","userStatus": 0 }

  Scenario: Post user
      When path "/user"
      And request body
      And method post
      Then status 200
      And print response

  Scenario: get user by username
    When path "/user/bisma"
    When method get
    And status 200
    Then print response

  Scenario: delete user by username
    When path "/user/bisma"
    When method delete
    And status 200
    Then print response
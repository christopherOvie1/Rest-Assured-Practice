Feature:    Github A Test


  Scenario Outline:   user validates Github API response

    Given  user sets the API request on the <url>
    And user authenricates the API request with <token>
    When user  makes the request to get list of all repositories
    Then user should be able to validate the response status code as <code>

    Examples:
    |url|token|code|
    |   |     |    |


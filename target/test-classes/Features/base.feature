Feature: Examples
  Optional description of the features


  @tests
  Scenario: test of signIn and check title
    Given open web My store
    And read objet myStore.json
    When check title My Store
    And click on element signin
    When element to write entity_Email_address_sigIn
    And element write password emailPassword
    And click on element butSignIn
    Then assert my title of profile title MY ACCOUNT
    And quit driver
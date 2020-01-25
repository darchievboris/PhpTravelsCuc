@adminPage
  Feature: admin page Testing
    @titleTest
    Scenario: Verify title of admin page
      Given User opens admin login page
      When User logsin with admin account
      Then Verifies title is Dashboard
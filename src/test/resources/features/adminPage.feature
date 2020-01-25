@adminPage
  Feature: admin page Testing
    @titleTest
    Scenario: Verify title of admin page
      Given User opens admin login page
      When User is authorized
      Then Verifies title is Dashbord
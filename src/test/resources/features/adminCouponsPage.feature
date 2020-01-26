@adminCouponPage
  Feature: Admin coupon page test
    Scenario: Verify new coupon is created
      Given User opens admin login page
      When User logsin with admin account
      And User navigate to Coupons page
      And Creates a new coupon
      Then Verifies coupon is created
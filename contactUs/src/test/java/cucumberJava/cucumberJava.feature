Feature: contact us page.
Scenario: Enter user details in contact us page.

Given user open the browser
When user searches for SecurePay
And clicks through to the SecurePay website
And user navigates to the contact us page
And user enters contact details 
Then data should be subbmitted successfully
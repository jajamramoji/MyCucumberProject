Feature: search and place order for vegtables

@seleniumtest
Scenario: Search for items and validate results
Given User is on Greencart Landing page
When User searched for Cucumber vegtable
Then "Cucumber" result are displayed

@seleniumtest
Scenario Outline: Search for items and then move to checkout page
Given User is on Greencart Landing page
When User searched for <Name> vegtable
And Added items to cart
And User proceeded to Checkout page for purchase
Then verify selected <Name> items are displayed in check out page

Examples:
|Name	|
|Brinjal|
|Beetroot|


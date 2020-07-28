Feature: Flight booking

@Chrome
Scenario: search and book flight in goibibo

Given user is on yatra landing page
When user searching from "Hyderabad (HYD)" to "Delhi (DEL)"
And user click the traveling date
And user click on search button
And user able to see all the available flights and select the desired flight
And user enter personal details Firstname "ramoji" Middlename as "rao" Lastname as "Jajam"
And user enter Email as "ramojiraoj3@gmail.com" and Mobilenumber as "9908637390 "
Then user click on procced to Payments for book flight ticket


@Safari
Scenario Outline: search and book flight in goibibo

Given user is on yatra landing page
When user searching source as "<Source>" destination as "<Destination>"
And user click the traveling date
And user click on search button
And user able to see all the available flights and select the desired flight
And user enter personal details firstname as "<Firstname>"  middlename as "<Middlename>" lastname as "<Lastname>"
And user enter Email as "<Email>" and Mobilenum as "<mobilenum> "
Then user click on procced to Payments for book flight ticket

Examples:
| Source | Destination | Firstname | Middlename | Lastname | Email | mobilenum |
|Hyderabad (HYD)| Delhi (DEL)|ramoji | rao | Jajam | ramojiraoj3@gmail.com | 9908637390 |

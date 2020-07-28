Feature: Application Login

@Regtest
Scenario: How page default login
Given User is on NetBanking landing page
When User login into application with "kalyan" username and password "98745"
Then Home page is populated
And Cards displayed are "true"

@mobiletest
Scenario: How page default login
Given User is on NetBanking landing page
When User login into application with "ramoji" username and password "123456"
Then Home page is populated
And Cards displayed are "false"

@Webtest
Scenario: How page default login
Given User is on NetBanking landing page
When User sign up follwoing details
| ramoji | Jajam | ramoji@gmail.com | NRT | 998578414 | 
Then Home page is populated
And Cards displayed are "false"

@Regtest
Scenario Outline: How page default login
Given User is on NetBanking landing page
When User login in to application with <Username> and password <password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|Username |password |
|user1    | pass1   |
|user2    | pass2   |
|user3    | pass3   |
|user4    | pass4   |






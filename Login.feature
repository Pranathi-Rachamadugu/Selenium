@Login
Feature: Login Functionality

Background:
Given  If user is on home page
@Sanity
Scenario Outline: Verify user is able to login with valid credentials
When Click on login link
And Enter username as "<Username>" and password as "<Password>" 
Then verify logout link
Examples:
	|Username | Password |
	|demo     | 1234     |
	|demo5    | 1235     |

@Regression @Sanity
Scenario: Verify user is able to generate QR code
When   Click on Login link
And    Enter username as 'demo' and password as '1234'
And    Click on Receive QR-code payment link
And    Enter amount as "12"
And    Click on next button
Then   Verify QR code and URL
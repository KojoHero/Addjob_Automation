@TP-7
Feature: User should view the login page and be able to login

	@TEST_TP-4
	Scenario: User should view the login page and be able to login
		When user enters the platform 
					And user selects add job
					And user completes all fields
					When user clicks post
					Then user should receive a notification of success

@COMMUNITY-713
@REQ_COMMUNITY-6
Feature: Job portal

	#Tests As a business, I should be able to post a job to the job portal 
	#
	#Acceptance Criteria
	#
	## A business which wants to post a job must have a registered/approved account
	## User must be logged-in
	## User clicks on the Add a Job button from Job Portal on the navigation panel and one-page loads with the following fields
	### Job Category (industry)
	### Job Type (Full/part-time, contract, daily job, etc)
	### Job Location
	### Job Title
	### Job description (Responsibilities & Requirements)
	### Salary range (two fields: From, To)
	### Job Ad Expiry Date
	#
	#4. User click on the Save button and it is recorded in the database
	@TEST_COMMUNITY-744 @REQ_COMMUNITY-21 @TESTSET_COMMUNITY-708
	Scenario: Verify that an organisation user can add a job
		When user enters the platform 
			And user selects add job
			And user completes all fields
			When user clicks post
			Then user should receive a notification of success

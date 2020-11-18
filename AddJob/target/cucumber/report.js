$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Add_Job/AddJob/src/test/java/AddJob/add_Job.feature");
formatter.feature({
  "line": 3,
  "name": "Job portal",
  "description": "",
  "id": "job-portal",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@COMMUNITY-713"
    },
    {
      "line": 2,
      "name": "@REQ_COMMUNITY-6"
    }
  ]
});
formatter.before({
  "duration": 5887129000,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#Tests As a business, I should be able to post a job to the job portal"
    },
    {
      "line": 6,
      "value": "#"
    },
    {
      "line": 7,
      "value": "#Acceptance Criteria"
    },
    {
      "line": 8,
      "value": "#"
    },
    {
      "line": 9,
      "value": "## A business which wants to post a job must have a registered/approved account"
    },
    {
      "line": 10,
      "value": "## User must be logged-in"
    },
    {
      "line": 11,
      "value": "## User clicks on the Add a Job button from Job Portal on the navigation panel and one-page loads with the following fields"
    },
    {
      "line": 12,
      "value": "### Job Category (industry)"
    },
    {
      "line": 13,
      "value": "### Job Type (Full/part-time, contract, daily job, etc)"
    },
    {
      "line": 14,
      "value": "### Job Location"
    },
    {
      "line": 15,
      "value": "### Job Title"
    },
    {
      "line": 16,
      "value": "### Job description (Responsibilities \u0026 Requirements)"
    },
    {
      "line": 17,
      "value": "### Salary range (two fields: From, To)"
    },
    {
      "line": 18,
      "value": "### Job Ad Expiry Date"
    },
    {
      "line": 19,
      "value": "#"
    },
    {
      "line": 20,
      "value": "#4. User click on the Save button and it is recorded in the database"
    }
  ],
  "line": 22,
  "name": "Verify that an organisation user can add a job",
  "description": "",
  "id": "job-portal;verify-that-an-organisation-user-can-add-a-job",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@TEST_COMMUNITY-744"
    },
    {
      "line": 21,
      "name": "@REQ_COMMUNITY-21"
    },
    {
      "line": 21,
      "name": "@TESTSET_COMMUNITY-708"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "user enters the platform",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user selects add job",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user completes all fields",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user clicks post",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user should receive a notification of success",
  "keyword": "Then "
});
formatter.match({
  "location": "Addjobs_steps.user_enters_the_platform()"
});
formatter.result({
  "duration": 12055709600,
  "status": "passed"
});
formatter.match({
  "location": "Addjobs_steps.user_selects_add_job()"
});
formatter.result({
  "duration": 8121437500,
  "status": "passed"
});
formatter.match({
  "location": "Addjobs_steps.user_completes_all_fields()"
});
formatter.result({
  "duration": 5232180700,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: Lagos Twn\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6APU30H\u0027, ip: \u0027192.168.3.51\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:147)\r\n\tat steps.Addjobs_steps.user_completes_all_fields(Addjobs_steps.java:63)\r\n\tat ✽.And user completes all fields(F:/Add_Job/AddJob/src/test/java/AddJob/add_Job.feature:25)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Addjobs_steps.user_clicks_post()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Addjobs_steps.user_should_receive_a_notification_of_success()"
});
formatter.result({
  "status": "skipped"
});
});
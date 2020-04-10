$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("webtableTest.feature");
formatter.feature({
  "line": 1,
  "name": "Webtable Automation",
  "description": "As a Eng I need to automate a Web table in different",
  "id": "webtable-automation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successfull Add Opreation on Web table",
  "description": "",
  "id": "webtable-automation;successfull-add-opreation-on-web-table",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I land on webtable page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I start add operation",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I complete the add user form",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I expect to see the user in webtable",
  "keyword": "Then "
});
formatter.match({
  "location": "WebtableTestSteps.i_land_on_webtable_page()"
});
formatter.result({
  "duration": 7335001913,
  "status": "passed"
});
formatter.match({
  "location": "WebtableTestSteps.i_start_add_operation()"
});
formatter.result({
  "duration": 330723968,
  "status": "passed"
});
formatter.match({
  "location": "WebtableTestSteps.i_complete_the_add_user_form()"
});
formatter.result({
  "duration": 2983996117,
  "status": "passed"
});
formatter.match({
  "location": "WebtableTestSteps.i_expect_to_see_the_user_in_webtable()"
});
formatter.result({
  "duration": 79163489496,
  "status": "passed"
});
});
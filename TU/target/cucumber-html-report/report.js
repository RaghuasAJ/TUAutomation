$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 13,
  "name": "Register with valid credentials",
  "description": "",
  "id": "login;register-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@raghu"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am in Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on Register Link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should see Register Page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select Register Button on register page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter valid details",
  "rows": [
    {
      "cells": [
        "Title",
        "mr"
      ],
      "line": 19
    },
    {
      "cells": [
        "EmailId",
        "chandanrauniyar2002@gmail.com"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select complete registration button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I should see welcom page with successful registration",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_in_home_page()"
});
formatter.result({
  "duration": 20177386119,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
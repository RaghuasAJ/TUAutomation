package com.cucumberrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "./src/test/resources/features",
        glue = {"com.stepdefination"},
        tags={"@raghu"},
        plugin= {"html:target/cucumber-html-report","json:target/cucumbeer.json"}
  )
public class TestRunner {

}

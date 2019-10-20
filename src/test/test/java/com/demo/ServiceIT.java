package com.demo;

import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = {"@DEV", "@SOMEPROCESSOR1"},
		plugin = { "pretty",  "html:target/cucumber-reports","json:target/cucumber.json"},
		glue = {"com.consol.citrus.cucumber.step.designer"},
		snippets = SnippetType.CAMELCASE
)
public class ServiceIT {

}
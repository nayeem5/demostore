package com.planetnexus.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Features",
		glue="com.planetnexus.stepdefs",
	tags="@Nelogin"
		)

public class TestRunnerNG extends AbstractTestNGCucumberTests{}

		
		
		
	

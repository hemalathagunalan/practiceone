package com.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(glue="com.stepDefinition",features="src/test/resources/Feature/launch.feature",plugin={"pretty"})
public class TestRunner
{
	
}

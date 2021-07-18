package com.discoveryPortal.e2eTests;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"src/specs/features"},
			//glue = {"src/test/java/com/discoveryPortal/e2eTests/authentification/stepDefinitions"},
			plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/DiscoveryPortal.html"},
			snippets = SnippetType.CAMELCASE,
			//tags = {("@embarquement, @valider-embarquement")},
			tags = {("@embarquement")},
			monochrome = true
			)
public class TestRunner{
		@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File ("src/test/resources/configs/extent-config.xml"));
		}
}

package com.stepDefinition;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Driver.runcucks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testingprojectjunit.dashboardobject;

public class pageload {
	public static WebDriver driver=runcucks.getDriver();
	dashboardobject dashbrd=new dashboardobject(driver);
@Test

@Given("The flight booking webpage opened")
public void the_flight_booking_webpage_opened() {
	 System.out.println("came for driver");
//    driver.get("https://www.goibibo.com/");
//    System.out.println("came");
    
    
    driver.get("https://www.google.com");
    dashbrd.Search("Selenium Automation");
}

//git push --set-upstream main browsersetup

@Given("Login promt has been opened")
public void login_promt_has_been() {
	if(dashbrd.is_displayed())
		System.out.println("Pageloaded successfully");
}

@When("pushnotification prompt has been dismissed")
public void pushnotification_prompt_has_been_dismissed() {
	if(dashbrd.pushpromt_button_click())
		System.out.println("prompt dismissed successfully");
		System.out.println("issue with dismissed");
}

@When("Login prompt has been dismissed")
public void login_prompt_has_been_dismissed() {
	if(dashbrd.Login_button_click())
		System.out.println("login prompt dismissed successfully");
}

@Then("The trip modes are accessible")
public void the_trip_modes_are_accessible() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The webpage is loaded with expected title")
public void the_webpage_is_loaded_with_expected_title() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I want to select source as {string}")
public void i_want_to_select_source_as(String source) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

//@Given("I want to select destination {String}")
//public void i_want_to_select_destination(String destination)
@Given("I want to select destination {string}")
public void i_want_to_select_destination(String destination){
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The date selected as {int}\\/{int}\\/{int}")
public void The_date_selected_as(Integer int1, Integer int2, Integer int3) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I want to select destination Dubai")
public void i_want_to_select_destination_dubai() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



	
	
	
	
	
	

}

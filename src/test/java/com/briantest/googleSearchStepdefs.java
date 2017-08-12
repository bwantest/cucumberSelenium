package com.briantest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by brianwan on 12/08/2017.
 */
public class googleSearchStepdefs {
    Elements elements;

    public googleSearchStepdefs(){
        elements = new Elements();
    }

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
        elements.isOnHomePage();
    }
    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String searchString) throws Throwable {
        elements.searchText(searchString);
    }

    @Then("^I found results$")
    public void i_found_results() throws Throwable {
        elements.isResultFound();
    }
}

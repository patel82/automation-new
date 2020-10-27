package com.mavenit.training2.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.core.Is.is;

public class SearchStepsDef {

    private HomePage homepage = new HomePage();
    private String searchItem;


    @When("^User do a search a product \"([^\"]*)\"$")
    public void user_do_a_search_a_product(String Item) {
        searchItem=Item;
        homepage.doSearch(Item);
    }

    @Then("^User should see a respective products$")
    public void user_should_see_a_respective_products() {
       String actualUrl = homepage.currentUrl();
        assertThat(actualUrl, endsWith("0"));
    }

}

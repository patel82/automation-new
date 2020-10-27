package com.mavenit.training2.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.ProductDesPage;
import page_objects.ResultsPage;
import page_objects.TrolleyPage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.core.Is.is;

public class BasketStepsDef {

    private ResultsPage resultspage = new ResultsPage();
    String expected;
    private ProductDesPage productdespage = new ProductDesPage();
    private TrolleyPage trolleyPage = new TrolleyPage();

    @When("^User select one product$")
    public void user_select_one_product(){
      expected  = resultspage.selectAnyProduct();
    }

    @Then("^User add that product to basket$")
    public void user_add_that_product_to_basket(){
        productdespage.addToTrolley();
    }

    @Then("^User go to basket$")
    public void user_go_to_basket() {
        productdespage.goToTrolley();
    }

    @Then("^User should see a selected product into basket$")
    public void user_should_see_a_selected_product_into_basket() {
       List<String> trollyItem = trolleyPage.getProductsInTrolley();
       assertThat(trollyItem, hasItem(expected));
    }
}

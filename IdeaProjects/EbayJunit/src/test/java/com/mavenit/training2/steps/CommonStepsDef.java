package com.mavenit.training2.steps;

import cucumber.api.java.en.Given;
import page_objects.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CommonStepsDef {

    private HomePage homepage = new HomePage();

    @Given("^User is on homepage$")
    public void user_is_on_homepage() {
        String actual = homepage.currentUrl();
        assertThat(actual,is("https://www.ebay.co.uk/"));
    }
}

package com.mavenit.training2;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import driver.DriverManager;
import org.junit.runner.RunWith;

public class Hooks extends DriverManager {

    private DriverManager driverManager = new DriverManager();

    @Before
    public void setUp() {
        driverManager.openBrowser();
    }

    @After
    public void tearDown() {
        driverManager.closeBrowser();
    }


}

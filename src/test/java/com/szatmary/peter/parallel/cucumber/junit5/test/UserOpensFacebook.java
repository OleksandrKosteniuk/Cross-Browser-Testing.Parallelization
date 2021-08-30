package com.szatmary.peter.parallel.cucumber.junit5.test;

import driver.DriverManager;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.FacebookPage;
import pages.KorrespondentPage;

import static org.assertj.core.api.Assertions.assertThat;

public class UserOpensFacebook {

    //Pages creation
    private FacebookPage facebookPage = new FacebookPage();

    @When("User opens the Facebook page")
    public void openFacebookPage() {
        DriverManager.getDriver().get(facebookPage.getFacebookPageUrl());
    }
}

package com.szatmary.peter.parallel.cucumber.junit5.test;

import driver.DriverManager;
import io.cucumber.java.en.When;
import pages.KorrespondentPage;

import static org.assertj.core.api.Assertions.assertThat;

public class UserOpensKorrespondent {
    //Pages creation
    private KorrespondentPage korrespondentPage = new KorrespondentPage();

    @When("User opens the Korrespondent page")
    public void openFacebookPage() {
        DriverManager.getDriver().get(korrespondentPage.getKorrespondentPageUrl());
        }
}

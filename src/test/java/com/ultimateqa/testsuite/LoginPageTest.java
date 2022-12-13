package com.ultimateqa.testsuite;

import com.ultimateqa.pages.HomePage;
import com.ultimateqa.pages.LoginPage;
import com.ultimateqa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToLoginPageSuccessfully() {
       homePage.clickOnSignLink();
        Assert.assertEquals(loginPage.getWelcomeText(), "Welcome Back!", "Welcome Text not found/ Not navigated to SignIn Page");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheErrorMessage() {
        homePage.clickOnSignLink();
        loginPage.enterEmail("Ritzs@gmail.com");
        loginPage.enterPassword("Ritz123");
        loginPage.clickOnSignInButton();
        Assert.assertEquals(loginPage.getErrorMessage(), "Invalid email or password.", "Error message not found");
    }
}

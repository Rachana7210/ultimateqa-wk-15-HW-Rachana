package com.ultimateqa.pages;

import com.ultimateqa.utility.Utility;;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome Back!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "user[email]")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "user[password]")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement signInButton;
    @CacheLookup
    @FindBy(xpath = "//li[@class='form-error__list-item']")
    WebElement errorMessage;

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterEmail(String email) {
        Reporter.log("Entered email " + email + " in email field " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("Entered password " + password + " in password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignInButton() {
        Reporter.log("Clicked on signIn " + signInButton.toString());
        clickOnElement(signInButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

}

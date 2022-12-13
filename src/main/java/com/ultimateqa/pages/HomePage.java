package com.ultimateqa.pages;

import com.ultimateqa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signInLink;

    public void clickOnSignLink(){
        clickOnElement(signInLink);
    }
}

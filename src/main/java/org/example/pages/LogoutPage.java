package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Page object for user logout functionality.
 */
public class LogoutPage {
    private final WebDriver driver;

    private final By homeHeader = By.cssSelector(
        "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > h2"
    );
    private final By signInOrSignUpLink = By.cssSelector(
        "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a"
    );
    private final By emailInput = By.cssSelector(
        "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=email]:nth-child(2)"
    );
    private final By passwordInput = By.cssSelector(
        "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=password]:nth-child(3)"
    );
    private final By loginButton = By.cssSelector(
        "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button"
    );
    private final By userNameBar = By.cssSelector(
        "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a > b"
    );
    private final By logoutLink = By.cssSelector(
        "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a"
    );

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Verify that the home page is displayed (logout context).
     */
    public boolean isHomePageVisible() {
        return driver.findElement(homeHeader).isDisplayed();
    }

    /**
     * Navigate to the login form via Sign In / Sign Up link.
     */
    public void clickSignInOrSignUp() {
        WebElement link = driver.findElement(signInOrSignUpLink);
        driver.navigate().to(link.getAttribute("href"));
    }

    /**
     * Enter user email into the login form.
     */
    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    /**
     * Enter user password into the login form.
     */
    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    /**
     * Click the login button to submit credentials.
     */
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    /**
     * Check if the username bar is displayed after login.
     */
    public boolean isUserLoggedIn() {
        return driver.findElement(userNameBar).isDisplayed();
    }

    /**
     * Click the logout link to log the user out.
     */
    public void clickLogout() {
        WebElement link = driver.findElement(logoutLink);
        driver.navigate().to(link.getAttribute("href"));
    }
}

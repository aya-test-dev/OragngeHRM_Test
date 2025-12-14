package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomeSubscriptionPage {

    WebDriver driver;

    public HomeSubscriptionPage(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.cssSelector("#header > div > div > div > div:nth-child(2) > div > ul > li:nth-child(1) > a");


    By verifySubscription = By.cssSelector("#footer > div:nth-child(1) > div > div > div:nth-child(2) > div > h2");
    By emailVerication = By.cssSelector("#susbscribe_email");
    By submitButtonVerication = By.cssSelector("#subscribe");

    public void HomeCheck() {
        System.out.println(driver.findElement(homeCheck).isDisplayed());
    }

    public void verifySubscriptionFun(){
        System.out.println(driver.findElement(verifySubscription).isDisplayed());
    }

    public void setEmailVerication(String email){
        driver.findElement(emailVerication).sendKeys(email);
    }

    public void clickOnSubmitButtonVerication(){
        driver.findElement(submitButtonVerication).click();

        System.out.println(driver.findElement(By.cssSelector("#success-subscribe > div")).isDisplayed());

//        driver.findElement(submitButtonVerication).click();
    }
}

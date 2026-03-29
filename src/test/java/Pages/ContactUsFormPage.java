package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class ContactUsFormPage {

    WebDriver driver;

    public ContactUsFormPage(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > h2");

    By contactUsFormButton = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(8) > a");

    By getInTouchVisible = By.cssSelector("#contact-page > div.row > div.col-sm-8 > div > h2");

    By nameContact = By.cssSelector("#contact-us-form > div:nth-child(2) > input");
    By emailContact = By.cssSelector("#contact-us-form > div:nth-child(3) > input");
    By subjectContact = By.cssSelector("#contact-us-form > div:nth-child(4) > input");
    By messageContact = By.cssSelector("#message");
    By fileContact = By.cssSelector("#contact-us-form > div:nth-child(6) > input");

    By submitButton = By.cssSelector("#contact-us-form > div:nth-child(7) > input");

    By successMessageContact = By.cssSelector("#contact-page > div.row > div.col-sm-8 > div > div.status.alert.alert-success");

    By homeButton = By.cssSelector("#form-section > a");

    public void HomeCheck() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeCheck));
        System.out.println(driver.findElement(homeCheck).isDisplayed());
    }

    public void contactUsFormButtonFun() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(contactUsFormButton));
        WebElement textField = driver.findElement(contactUsFormButton);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    public void checkGetInTouchVisible(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(getInTouchVisible));
        System.out.println(driver.findElement(getInTouchVisible).isDisplayed());
    }

    public void setNameContact(String name) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameContact));
        driver.findElement(nameContact).sendKeys(name);
    }

    public void setEmailContact(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailContact));
        driver.findElement(emailContact).sendKeys(email);
    }

    public void setSubjectContact(String subject) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(subjectContact));
        driver.findElement(subjectContact).sendKeys(subject);
    }

    public void setMessageContact(String message) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(messageContact));
        driver.findElement(messageContact).sendKeys(message);
    }

    public void setFileContact(String filePath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(fileContact));
        driver.findElement(fileContact).sendKeys(filePath);
    }

    public void clickSubmitButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(submitButton).click();
    }

    public void alertFun(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void verifySuccessMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageContact));
        System.out.println(driver.findElement(successMessageContact).isDisplayed());
    }

    public void goHomeButtonFun() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(homeButton));
        WebElement textField = driver.findElement(homeButton);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }
}

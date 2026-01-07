package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsFormPage {

    WebDriver driver;

    public ContactUsFormPage(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.xpath("//body/section[3]/div/div/div[contains(@class,'col-sm-9') and contains(@class,'padding-right')]/div[contains(@class,'features_items')]/h2");

    By contactUsFormButton = By.xpath("//*[@id='header']/div/div/div/div[contains(@class,'col-sm-8')]/div/ul/li[8]/a");

    By getInTouchVisible = By.xpath("//*[@id='contact-page']/div[contains(@class,'row')]/div[contains(@class,'col-sm-8')]/div/h2");

    By nameContact = By.xpath("//*[@id='contact-us-form']/div[2]/input");
    By emailContact = By.xpath("//*[@id='contact-us-form']/div[3]/input");
    By subjectContact = By.xpath("//*[@id='contact-us-form']/div[4]/input");
    By messageContact = By.xpath("//*[@id='message']");
    By fileContact = By.xpath("//*[@id='contact-us-form']/div[6]/input");

    By submitButton = By.xpath("//*[@id='contact-us-form']/div[7]/input");

    By successMessageContact = By.xpath("//*[@id='contact-page']/div[contains(@class,'row')]/div[contains(@class,'col-sm-8')]/div/div[contains(@class,'status') and contains(@class,'alert') and contains(@class,'alert-success')]");

    By homeButton = By.xpath("//*[@id='form-section']/a");

    public void HomeCheck() {
        System.out.println(driver.findElement(homeCheck).isDisplayed());
    }

    public void contactUsFormButtonFun() {
        WebElement textField = driver.findElement(contactUsFormButton);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    public void checkGetInTouchVisible(){
        System.out.println(driver.findElement(getInTouchVisible).isDisplayed());
    }

    public void setNameContact(String name) {
        driver.findElement(nameContact).sendKeys(name);
    }

    public void setEmailContact(String email) {
        driver.findElement(emailContact).sendKeys(email);
    }

    public void setSubjectContact(String subject) {
        driver.findElement(subjectContact).sendKeys(subject);
    }

    public void setMessageContact(String message) {
        driver.findElement(messageContact).sendKeys(message);
    }

    public void setFileContact(String filePath) {
        driver.findElement(fileContact).sendKeys(filePath);
    }

    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }

    public void alertFun(){
        driver.switchTo().alert().accept();
    }

    public void verifySuccessMessage(){
        System.out.println(driver.findElement(successMessageContact).isDisplayed());
    }

    public void goHomeButtonFun() {
        WebElement textField = driver.findElement(homeButton);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }
}

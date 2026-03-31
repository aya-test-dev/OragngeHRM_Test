package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductWithCart {
    WebDriver driver;

    public ProductWithCart(WebDriver driver) {
        this.driver = driver;
    }

    By homeCheck = By.cssSelector("#header > div > div > div > div:nth-child(2) > div > ul > li:nth-child(1) > a");

    By productsButton = By.cssSelector("#header > div > div > div > div:nth-child(2) > div > ul > li:nth-child(2) > a");

    By selectFirstProduct = By.cssSelector("body > section:nth-child(2) > div > div > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(1) > img");
    By selectSecondProduct = By.cssSelector("body > section:nth-child(2) > div > div > div:nth-child(2) > div > div:nth-child(3) > div > div:nth-child(1) > div:nth-child(1) > img");

    By hoverOnFirstProduct = By.cssSelector("body > section:nth-child(2) > div > div > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(2) > div");
    By hoverOnSecondProduct = By.cssSelector("body > section:nth-child(2) > div > div > div:nth-child(2) > div > div:nth-child(3) > div > div:nth-child(1) > div:nth-child(2) > div");

    By continoueShopping = By.cssSelector("body > section:nth-child(2) > div > div > div:nth-child(2) > div > div:nth-child(1) > div > div > div:nth-child(3) > button");

    By viewCartLink = By.cssSelector("a[href=\"/view_cart\"]:nth-of-type(2)");

    By firstProductAddedToCart = By.cssSelector("#product-1 > td.cart_description > p");
    By secondProductAddedToCart = By.cssSelector("#product-2 > td.cart_description > h4 > a");

    By firstProductPriceInCartPage = By.cssSelector("#product-1 > td.cart_price > p");
    By firstProductQuantityInCartPage = By.cssSelector("#product-1 > td.cart_quantity > button");
    By firstProductTotalPriceInCartPage = By.cssSelector("#product-1 > td.cart_total > p");

    By seconedProductPriceInCartPage = By.cssSelector("#product-2 > td.cart_price > p");
    By seconedProductQuantityInCartPage = By.cssSelector("#product-2 > td.cart_quantity > button");
    By seconedProductTotalPriceInCartPage = By.cssSelector("#product-2 > td.cart_total > p");

    By hoverProductFromHome = By.cssSelector("img[src=\"/get_product_picture/2\"]");
    By clickAddToCartHome = By.cssSelector("a[data-product-id=\"2\"]:nth-of-type(2)");

    By verifyCartPage = By.cssSelector("td.image");
    By deleteProductFromCart = By.cssSelector("a.cart_quantity_delete");

    By verifyCartEmpty = By.cssSelector("#empty_cart");

    public void HomeCheck() {
        System.out.println(driver.findElement(homeCheck).isDisplayed());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");

    }

    public void goToProductsPage() {
        WebElement textField = driver.findElement(productsButton);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    public void clickOnAddToCartFirstProduct(){
        WebElement elementToHover = driver.findElement(selectFirstProduct);

        // Find the element to click (can be the same or revealed after hover)
        WebElement elementToClick = driver.findElement(By.cssSelector("body > section:nth-child(2) > div > div > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(2) > div > a"));

        // Create Actions instance
        Actions actions = new Actions(driver);

        // Perform hover and click
        actions.moveToElement(elementToHover).perform();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(hoverOnFirstProduct));
        elementToClick.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void clickOnAddToCartSeconedProduct(){
        WebElement elementToHover = driver.findElement(selectSecondProduct);

        // Find the element to click (can be the same or revealed after hover)
        WebElement elementToClick = driver.findElement(hoverOnSecondProduct);

        // Create Actions instance
        Actions actions = new Actions(driver);

        // Perform hover and click
        actions.moveToElement(elementToHover).perform();
        elementToClick.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void goTocontinoueShopping(){
//        WebElement textField = driver.findElement(continoueShopping);
//        textField.click();
        //driver.switchTo().alert().accept();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the modal is visible and the button is clickable
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(continoueShopping));
        continueButton.click();
    }

    public void goToCart(){
        WebElement textField = driver.findElement(viewCartLink);
        String value2 = textField.getAttribute("href");
        driver.navigate().to(value2);
    }

    public void verifyFirstProductAddedToCart(){
        String description = driver.findElement(firstProductAddedToCart).getText();
        System.out.println(description);
    }

    public void verifySeconedProductAddedToCart(){
        String description = driver.findElement(secondProductAddedToCart).getText();
        System.out.println(description);
    }

    public void verifyDetailsOfFirstProduct(){
        String price = driver.findElement(firstProductPriceInCartPage).getText();
        System.out.println(price);
        String quantity = driver.findElement(firstProductQuantityInCartPage).getText();
        System.out.println(quantity);
        String total = driver.findElement(firstProductTotalPriceInCartPage).getText();
        System.out.println(total);
    }

    public void verifyDetailsOfSecondProduct(){
        String price = driver.findElement(seconedProductPriceInCartPage).getText();
        System.out.println(price);
        String quantity = driver.findElement(seconedProductQuantityInCartPage).getText();
        System.out.println(quantity);
        String total = driver.findElement(seconedProductTotalPriceInCartPage).getText();
        System.out.println(total);
    }

    public void chooseProductFromHome(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        WebElement elementToHover = driver.findElement(hoverProductFromHome);

        // Find the element to click (can be the same or revealed after hover)
        WebElement elementToClick = driver.findElement(clickAddToCartHome);

        // Create Actions instance
        Actions actions = new Actions(driver);

        // Perform hover and click
        actions.moveToElement(elementToHover).perform();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(clickAddToCartHome));
        elementToClick.click();
    }

    public void checkVerifyCartPage(){
        System.out.println(driver.findElement(verifyCartPage).isDisplayed());
    }

    public void checkDeleteProductFromCart(){
        driver.findElement(deleteProductFromCart).click();
    }

    public void checkVerifyCartEmpty(){
        System.out.println(driver.findElement(verifyCartEmpty).isDisplayed());
    }
}

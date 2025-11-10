package TestPages;

import Pages.ContactUsFormPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.BaseTest;
import java.net.URL;
import java.nio.file.Paths;
import org.testng.Assert;

public class ContactUsFormPageTest extends BaseTest {

    ContactUsFormPage obj;

    @Test
    public void checkContactForm() throws Exception {

        obj = new ContactUsFormPage(driver);

        obj.HomeCheck();
        obj.contactUsFormButtonFun();

        obj.checkGetInTouchVisible();

        obj.setNameContact("aya");
        obj.setEmailContact("ayaali@gmail.com");
        obj.setSubjectContact("bla bla");
        obj.setMessageContact("brjhbvejhvbejhbvjbvjhbvjhbjh");
        URL resource = getClass().getClassLoader().getResource("Ahmed-Ali final-cv.pdf");
        Assert.assertNotNull(resource, "Test resource PDF not found");
        String filePath = Paths.get(resource.toURI()).toString();
        obj.setFileContact(filePath);

        obj.clickSubmitButton();

        obj.alertFun();

        obj.verifySuccessMessage();
        obj.goHomeButtonFun();
        obj.HomeCheck();
    }


}

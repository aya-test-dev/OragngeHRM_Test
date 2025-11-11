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
        obj.setSubjectContact("Inquiry About Services");
        obj.setMessageContact("Hello, I am interested in your services. Please contact me. Thank you.");
        URL pdfResource = getClass().getClassLoader().getResource("Ahmed-Ali final-cv.pdf");
        Assert.assertNotNull(pdfResource, "PDF resource not found");
        String pdfPath = Paths.get(pdfResource.toURI()).toString();
        obj.setFileContact(pdfPath);

        obj.clickSubmitButton();

        obj.alertFun();

        obj.verifySuccessMessage();
        obj.goHomeButtonFun();
        obj.HomeCheck();
    }


}

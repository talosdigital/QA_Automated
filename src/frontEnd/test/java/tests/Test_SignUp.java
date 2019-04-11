package tests;

import functions.Fun_BrowserFactory;
import functions.Fun_SignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test_SignUp {

    public WebDriver startBrowser() throws IOException, InterruptedException{
        WebDriver driver = Fun_BrowserFactory.startBrowser("chrome", "https://royal-films.com/registro");
        System.out.println("Browser called");
        return driver;
    }

    public void waitFor(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    @Test
    public void registerAccountSuccessful() throws IOException, InterruptedException {
        WebDriver driver = startBrowser();
        Fun_SignUp fun_signUp = PageFactory.initElements(driver, Fun_SignUp.class);
        fun_signUp.insertFirstName("TestName");
        fun_signUp.insertLastName("Test LastName");
        fun_signUp.insertAddress("805 media luna");
        fun_signUp.insertEmail("test.email.2@test.com");
        fun_signUp.insertPhoneNumber("1234567890");
        fun_signUp.selectCityBogota();
        fun_signUp.insertDocument("1234567890");
        fun_signUp.insertDateOfBirth("1990-10-10");
        fun_signUp.selectGenderMale();
        fun_signUp.insertPassword("password123*");
        fun_signUp.insertConfirmPassword("password123*");
        fun_signUp.checkTermsAndConditions();
        fun_signUp.checkReceiveInfo();
        fun_signUp.clickRegisterButton();
        waitFor(5);
        System.out.println("Register Successfull passed");
        driver.close();
    }
}

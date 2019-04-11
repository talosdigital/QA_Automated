package functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Po_SignUp;

public class Fun_SignUp {

    WebDriver driver;

    public Fun_SignUp(WebDriver rDriver){
        this.driver = rDriver;
    }

    public void insertFirstName(String firstName){
        Po_SignUp po_signUp = PageFactory.initElements(driver, Po_SignUp.class);
        po_signUp.po_first_name_input.sendKeys(firstName);
    }

    public void insertLastName(String lastName){
        Po_SignUp po_signUp = PageFactory.initElements(driver, Po_SignUp.class);
        po_signUp.po_last_name_input.sendKeys(lastName);
    }

    public void insertAddress(String address){
        Po_SignUp po_signUp = PageFactory.initElements(driver, Po_SignUp.class);
        po_signUp.po_address_input.sendKeys(address);
    }

    public void insertEmail(String email){
        Po_SignUp po_signUp = PageFactory.initElements(driver, Po_SignUp.class);
        po_signUp.po_email_input.sendKeys(email);
    }

    public void insertPhoneNumber(String phone){
        Po_SignUp po_signUp = PageFactory.initElements(driver, Po_SignUp.class);
        po_signUp.po_phone_input.sendKeys(phone);
    }

    public void selectCityBogota(){
        Po_SignUp po_signUp = PageFactory.initElements(driver, Po_SignUp.class);
        po_signUp.po_city_dropdown.click();
        po_signUp.po_bogota_option.click();
    }

    public void insertDocument(String id){
        Po_SignUp po_signUp = PageFactory.initElements(driver, Po_SignUp.class);
        po_signUp.po_document_input.sendKeys(id);
    }

    public void insertDateOfBirth(String dob){
        Po_SignUp po_signUp = PageFactory.initElements(driver, Po_SignUp.class);
        po_signUp.po_dob_input.sendKeys(dob);
    }

    public void selectGenderMale(){
        Po_SignUp po_signUp = PageFactory.initElements(driver, Po_SignUp.class);
        po_signUp.po_gender_dropdown.click();
        po_signUp.po_male_gender_option.click();
    }

    public void insertPassword(String password){
        Po_SignUp po_signUp = PageFactory.initElements(driver, Po_SignUp.class);
        po_signUp.po_password_input.sendKeys(password);
    }

    public void insertConfirmPassword(String confirmPassword){
        Po_SignUp po_signUp = PageFactory.initElements(driver, Po_SignUp.class);
        po_signUp.po_confirm_password_input.sendKeys(confirmPassword);
    }

    public void checkTermsAndConditions(){
        Po_SignUp po_signUp = PageFactory.initElements(driver, Po_SignUp.class);
        po_signUp.po_terms_and_conditions_checkbox.click();
    }

    public void checkReceiveInfo(){
        Po_SignUp po_signUp = PageFactory.initElements(driver, Po_SignUp.class);
        po_signUp.po_receive_information_checkbox.click();
    }

    public void clickRegisterButton(){
        Po_SignUp po_signUp = PageFactory.initElements(driver, Po_SignUp.class);
        po_signUp.po_register_button.click();
    }
}

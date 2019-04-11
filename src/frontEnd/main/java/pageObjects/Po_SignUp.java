package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Po_SignUp {

    WebDriver driver;
    private final String first_name_input = "first_name";
    private final String last_name_input = "last_name";
    private final String address_input = "address";
    private final String email_input = "email";
    private final String phone_input = "phone";
    private final String city_dropdown = "city";
    private final String bogota_option = "//option[@value='Bogota']";
    private final String document_input = "document";
    private final String date_of_birth_input = "birthday";
    private final String gender_dropdown = "sex";
    private final String male_gender_option = "//option[@value='m']";
    private final String password_input = "password";
    private final String confirm_password_input = "retype";
    private final String terms_and_conditions_checkbox = "confirm";
    private final String receive_information_checkbox = "mobile";
    private final String register_button = "//button[@type='submit']";

    public Po_SignUp(WebDriver rDriver){
        this.driver = rDriver;
    }

    @FindBy(how = How.NAME, using = first_name_input)
    @CacheLookup
    public WebElement po_first_name_input;

    @FindBy(how = How.NAME, using = last_name_input)
    @CacheLookup
    public WebElement po_last_name_input;

    @FindBy(how = How.NAME, using = address_input)
    @CacheLookup
    public WebElement po_address_input;

    @FindBy(how = How.NAME, using = email_input)
    @CacheLookup
    public WebElement po_email_input;

    @FindBy(how = How.NAME, using = phone_input)
    @CacheLookup
    public WebElement po_phone_input;

    @FindBy(how = How.NAME, using = city_dropdown)
    @CacheLookup
    public WebElement po_city_dropdown;

    @FindBy(how = How.XPATH, using = bogota_option)
    @CacheLookup
    public WebElement po_bogota_option;

    @FindBy(how = How.NAME, using = document_input)
    @CacheLookup
    public WebElement po_document_input;

    @FindBy(how = How.NAME, using = date_of_birth_input)
    @CacheLookup
    public WebElement po_dob_input;

    @FindBy(how = How.NAME, using = gender_dropdown)
    @CacheLookup
    public WebElement po_gender_dropdown;

    @FindBy(how = How.XPATH, using = male_gender_option)
    @CacheLookup
    public WebElement po_male_gender_option;

    @FindBy(how = How.NAME, using = password_input)
    @CacheLookup
    public WebElement po_password_input;

    @FindBy(how = How.NAME, using = confirm_password_input)
    @CacheLookup
    public WebElement po_confirm_password_input;

    @FindBy(how = How.NAME, using = terms_and_conditions_checkbox)
    @CacheLookup
    public WebElement po_terms_and_conditions_checkbox;

    @FindBy(how = How.NAME, using = receive_information_checkbox)
    @CacheLookup
    public WebElement po_receive_information_checkbox;

    @FindBy(how = How.XPATH, using = register_button)
    @CacheLookup
    public WebElement po_register_button;
}

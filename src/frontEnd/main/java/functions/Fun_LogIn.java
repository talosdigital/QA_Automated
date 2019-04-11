package functions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.PO_LogIn;

public class Fun_LogIn {

    WebDriver driver;
    PO_LogIn po;

    public Fun_LogIn(WebDriver driver1){
        driver = driver1;
    }

    public String getUrl(){
        po = PageFactory.initElements(driver, PO_LogIn.class);
        return po.URL;
    }

    public void fullUser(String str){
        po = PageFactory.initElements(driver, PO_LogIn.class);
        po.user.sendKeys(str);
    }

    public void fillPassword(String str){
        po = PageFactory.initElements(driver, PO_LogIn.class);
        po.pass.sendKeys(str);
    }

    public void clickOnSubmitButton(){
        po = PageFactory.initElements(driver, PO_LogIn.class);
        po.submit.click();
    }

    public String getAlertValue(){
        po = PageFactory.initElements(driver, PO_LogIn.class);
        return po.alert.getText();
    }

    public String getAlertWrongValue(){
        po = PageFactory.initElements(driver, PO_LogIn.class);
        return po.alertWrong.getText();
    }

    public void clickInLogIn() {
        po = PageFactory.initElements(driver, PO_LogIn.class);
        po.logInLink.click();
    }

    public void clickInLogOut(){
        po = PageFactory.initElements(driver, PO_LogIn.class);
        po.logOutLink.click();
    }



}

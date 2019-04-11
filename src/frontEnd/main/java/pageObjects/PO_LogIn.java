package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_LogIn {

    public final String URL = "https://royal-films.com/ciudad";
    private final String logInLocator = "/html/body/app-root/nav/div[1]/div/ul/li[1]/a[1]";
    private final String userNameLocator = "//*[@id=\"login\"]/form[1]/div/div[2]/input[1]";
    private final String passwordLocator = "/html[1]/body[1]/app-root[1]/div[2]/app-login[1]/section[1]/form[1]/div[1]/div[2]/input[2]";
    private final String buttonLocator = "/html[1]/body[1]/app-root[1]/div[2]/app-login[1]/section[1]/form[1]/div[1]/div[2]/button[1]";
    private final String alertLocator = "/html[1]/body[1]/app-root[1]/ng2-toasty[1]/div[1]/ng2-toast[1]/div[1]/div[2]/span[2]";
    private final String alertWrongLocator = "/html[1]/body[1]/app-root[1]/ng2-toasty[1]/div[1]/ng2-toast[1]/div[1]/div[2]/span[2]";
    private final String logoutButton = "/html[1]/body[1]/app-root[1]/div[2]/app-user[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[2]";

    @FindBy(how = How.XPATH, using = logInLocator)
    public WebElement logInLink;

    @FindBy(how = How.XPATH, using = userNameLocator)
    public WebElement user;

    @FindBy(how = How.XPATH, using = passwordLocator)
    public WebElement pass;

    @FindBy(how = How.XPATH, using = buttonLocator)
    public WebElement submit;

    @FindBy(how = How.XPATH, using = alertLocator)
    public WebElement alert;

    @FindBy(how = How.XPATH, using = alertWrongLocator)
    public WebElement alertWrong;

    @FindBy(how = How.XPATH, using = logoutButton)
    public WebElement logOutLink;

}

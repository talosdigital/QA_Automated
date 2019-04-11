import functions.Fun_LogIn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_LogIn {

    WebDriver driver;
    Fun_LogIn fun;

    public Test_LogIn(){
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void logInSuccessful() throws InterruptedException {
        driver = new ChromeDriver();
        fun = PageFactory.initElements(driver, Fun_LogIn.class);
        Thread.sleep(2000);
        driver.get("https://royal-films.com/ciudad");
        Thread.sleep(2000);
        fun.clickInLogIn();
        Thread.sleep(2000);
        fun.fullUser("brayanestradaposada@gmail.com");
        fun.fillPassword("3013439323*");
        fun.clickOnSubmitButton();
        Thread.sleep(3000);
        String currentUrl  = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://royal-films.com/usuario/perfil");
        fun.clickInLogOut();
        driver.close();
    }

    @Test
    public void logInWithUserAndPasswordEmpty() throws InterruptedException {
        driver = new ChromeDriver();
        fun = PageFactory.initElements(driver, Fun_LogIn.class);
        Thread.sleep(2000);
        driver.get("https://royal-films.com/ciudad");
        Thread.sleep(2000);
        fun.clickInLogIn();
        Thread.sleep(2000);
        fun.clickOnSubmitButton();
        String alertValue = fun.getAlertValue();
        Assert.assertEquals(alertValue,"Por favor revise el formulario e intente de nuevo");
        driver.close();
    }

    @Test
    public void logInWithPasswordEmpty() throws InterruptedException {
        driver = new ChromeDriver();
        fun = PageFactory.initElements(driver, Fun_LogIn.class);
        Thread.sleep(2000);
        driver.get("https://royal-films.com/ciudad");
        Thread.sleep(2000);
        fun.clickInLogIn();
        Thread.sleep(2000);
        fun.fullUser("brayanestradaposada@gmail.com");
        fun.clickOnSubmitButton();
        String alertValue = fun.getAlertValue();
        Assert.assertEquals(alertValue,"Por favor revise el formulario e intente de nuevo");
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void logInWithUserEmpry() throws InterruptedException {
        driver = new ChromeDriver();
        fun = PageFactory.initElements(driver, Fun_LogIn.class);
        Thread.sleep(2000);
        driver.get("https://royal-films.com/ciudad");
        Thread.sleep(2000);
        fun.clickInLogIn();
        Thread.sleep(2000);
        fun.fillPassword("asdasd");
        fun.clickOnSubmitButton();
        String alertValue = fun.getAlertValue();
        Assert.assertEquals(alertValue,"Por favor revise el formulario e intente de nuevo");
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void logInWithUserAndPasswordWrong() throws InterruptedException {
        driver = new ChromeDriver();
        fun = PageFactory.initElements(driver, Fun_LogIn.class);
        Thread.sleep(2000);
        driver.get("https://royal-films.com/ciudad");
        Thread.sleep(2000);
        fun.clickInLogIn();
        Thread.sleep(2000);
        fun.fullUser("brayanestradaposada@gmail.co");
        fun.fillPassword("asdasd");
        fun.clickOnSubmitButton();
        Thread.sleep(1000);
        String alertValue = fun.getAlertWrongValue();
        Assert.assertEquals(alertValue,"Usuario y/o contraseña inválido");
        Thread.sleep(3000);
        driver.close();
    }
}

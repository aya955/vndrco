import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage {
    private  WebDriver driver;
    RegisterPage registerPage;
   public HomePage(WebDriver driver){
        this.driver=driver;
    }
    By user= By.xpath("//img[@alt='user']");
    By registerbutton =By.xpath("//a[contains(text(),'قم')] ");
    By loginbutton=By.xpath("//button[@class='primary-fill open-signin-modal']");
    By password= By.xpath("(//input[@name='password'])[2]");
    By email= By.xpath("(//input[@name='email'])[3]");
    By login = By.xpath("(//form//button[contains(text(),'تسجيل الدخول')])[2]");
    public RegisterPage ClickOnUser(){
    driver.findElement(user).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(registerbutton).click();
    return  new RegisterPage(driver);
    }
    public void ClickOnUsertologin(){
        driver.findElement(user).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.findElement(loginbutton).click();

    }
    public void EnterEmail(String e)
    {
        driver.findElement(email).sendKeys(e);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
    }
    public void enterpassword(String p){
        driver.findElement(password).sendKeys(p);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
    }
    public HomePage login(){
        driver.findElement(login).click();
        return new HomePage(driver);
    }











}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private  WebDriver driver;
    By firstname=By.xpath("//main//input[@name='first_name']");
    By lastname=By.xpath("//main//input[@name='last_name']");
    By password=By.xpath("//main//input[@name='password']");
    By repassword=By.xpath("//main//input[@name='password_confirmation']");
    By email=By.xpath("//main//input[@name='email']");
    By phone=By.xpath("//main//input[@name='phone']");
    By agree=By.xpath("//main//input[@name='termsCheck']");
    By submit=By.xpath("//main//button[@class='submit secondary-fill']");

    public RegisterPage(WebDriver driver){
        this.driver=driver;
    }
    public void findfirstname(String f){
        driver.findElement(firstname).sendKeys(f);
    }
    public void findlastname(String l){
        driver.findElement(lastname).sendKeys(l);
    }
    public void EnterEmail(String e)
    {
        driver.findElement(email).sendKeys(e);
    }
    public void enterpassword(String p){
        driver.findElement(password).sendKeys(p);
    }
    public void repassword(String rp){
        driver.findElement(repassword).sendKeys(rp);
    }
    public void phone(String rp){
        driver.findElement(phone).sendKeys(rp);
    }
    public void agreement(){
        driver.findElement(agree).click();
    }

    public VerificationPage ClickOnRegisterButton ()
    {
        driver.findElement(submit).click();
        return new VerificationPage(driver);
    }

}

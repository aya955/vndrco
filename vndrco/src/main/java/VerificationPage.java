import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationPage {
    private  WebDriver driver;
    By code= By.xpath("//form//input[@name='code']");
    By activation = By.xpath("(//form//button[@class='submit secondary-fill'])[1]");
    By registermsg =By.linkText("شكرا لتسحيلك في فندر");
    public VerificationPage(WebDriver driver){
        this.driver=driver;
    }

    public void Entercode(String c)
    {
        driver.findElement(code).sendKeys(c);
    }
    public HomePage clockonactivationButton()
    {
        driver.findElement(activation).click();
        return new HomePage(driver);

    }
    public String showregistermsg(){
        return driver.findElement(registermsg).getText();
    }

}

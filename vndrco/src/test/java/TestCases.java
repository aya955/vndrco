import com.google.common.base.Verify;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TestCases {
    private WebDriver driver;
    HomePage homepage;
    RegisterPage register;
    VerificationPage verify;
    SoftAssert softAssert = new SoftAssert();
    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
        driver.get("https://www.vndrco.com/");
        driver.manage().window().maximize();
        homepage=new HomePage(driver);
    }
    @Test(priority = 0)
    public void RegisterWithValidData() throws InterruptedException {
        register=homepage.ClickOnUser();
        register.findfirstname("esraa");
        register.findlastname("aya");
        register.EnterEmail("qwer@gmail.com");
        register.enterpassword("123456");
        register.repassword("123456");
        register.phone("01118449081");
        register.agreement();
        softAssert.assertEquals(verify.registermsg,"شكرا لتسحيلك في فندر");
        register.ClickOnRegisterButton();
        //Thread.sleep(30);

       // homepage=verify.clockonactivationButton();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));


    }
    @Test(priority = 1)
    public void loginwithvaliddata(){
        homepage.ClickOnUsertologin();
        homepage.EnterEmail("aya.a.alzeiny@gmail.com");
        homepage.enterpassword("aya328");
        homepage.login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        //softAssert.assertEquals(expect,homepage);
    }
/*@Test
public HomePage verificationTestcase()
{
    verify.Entercode("7946");

    return new HomePage(driver);

}*/



    @AfterMethod
    public void close(){
        driver.quit();
    }
}

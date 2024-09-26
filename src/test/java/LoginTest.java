import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    void TestLogin()
    {
        Login lp = new Login(driver);
        lp.setUserName("Admin");
        lp.setPassword("admin123");
        lp.submit();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @AfterClass
    void tear_down()
    {
        driver.quit();
    }
}

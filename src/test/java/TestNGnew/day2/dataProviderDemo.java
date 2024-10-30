package TestNGnew.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class dataProviderDemo {
    WebDriver driver;

    @BeforeClass
    void setup()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test(dataProvider = "dp")
    void testLogin(String email, String password)
    {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        WebElement myAccount = driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
        myAccount.click();
        WebElement logout = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']"));
        logout.click();
        Boolean status= driver.findElement(By.xpath("//h1[normalize-space()='Account Logout']")).isDisplayed();
        if (status==true)
        {

            Assert.assertTrue(true);
        }
        else
        {
            Assert.fail();
        }
    }
    @AfterClass
    void tear_down()
    {
        driver.quit();
    }

    @DataProvider(name = "dp")
    Object[][] loginData()
    {
        Object data[][] = {
                {"xyz@gmail.com", "test012"},
                {"john@gmail.com", "test@123"},
                {"abc@outlook.com","adm123"}
        };
        return data;
    }
}

package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonTest
{
WebDriver driver;

@BeforeClass
public void setup()
{
    driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
}
@Test(priority = 1)
    public void clickMenu()
{
    HomePage hpage = new HomePage(driver);
    hpage.clickMenubar();
    hpage.clickMenucptr();

}
@Test(priority = 2,dependsOnMethods = "clickMenu")
public void Laptop()
{
    LaptopsPage Lpage = new LaptopsPage(driver);
    Lpage.clickMLap();
    Lpage.clickCheck();
}
@Test(priority =3,dependsOnMethods = "Laptop")
public void cartAddition() throws InterruptedException {
    CartPage Cpage = new CartPage(driver);
    Cpage.addToCart();
    Cpage.cartClick();
    Cpage.cartValidate();

}
@AfterClass
    public void close()
{
    driver.quit();
}

}

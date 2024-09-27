package Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage
{

    WebDriver driver;
    WebDriverWait wait ;

    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    WebElement menuBar;

    @FindBy(xpath="//div[normalize-space()='Mobiles, Computers']")
    WebElement menuComputer;

    public HomePage(WebDriver driver)
    {
       this.driver = driver;
       this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       PageFactory.initElements(driver,this);

    }
    public void clickMenubar ()
    {
      wait.until(ExpectedConditions.elementToBeClickable(menuBar)).click();
    }
    public void clickMenucptr()
    {
        wait.until(ExpectedConditions.elementToBeClickable(menuComputer)).click();
    }

}

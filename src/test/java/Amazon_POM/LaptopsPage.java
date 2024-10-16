package Amazon_POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LaptopsPage
{
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//a[contains(text(),'Laptops')]")
    WebElement menuLaptop;

    @FindBy(xpath = "//label[@for='apb-browse-refinements-checkbox_7']//i[@class='a-icon a-icon-checkbox']")
    WebElement checkBoxApple;

    public LaptopsPage(WebDriver driver)
    {
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver,this);
    }
public void clickMLap()
{
//    System.out.println("test1");
    wait.until(ExpectedConditions.elementToBeClickable(menuLaptop));
//    System.out.println("test2");
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",menuLaptop);
    ((JavascriptExecutor)driver).executeScript("arguments[0].click();",menuLaptop);
}
public void clickCheck()
{
    wait.until(ExpectedConditions.elementToBeClickable(checkBoxApple)).click();
}
}

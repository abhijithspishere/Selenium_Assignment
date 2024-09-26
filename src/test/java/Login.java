import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {

    public WebDriver driver;
    public WebDriverWait wait;

    //Locators
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username_txt;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password_txt;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement submit_btn;

    //Constructor
    public Login(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }

    //Action Methods
    public void setUserName(String user)
    {
        wait.until(ExpectedConditions.elementToBeClickable(username_txt)).sendKeys(user);
    }
    public void setPassword (String pwd)
    {
        wait.until(ExpectedConditions.elementToBeClickable(password_txt)).sendKeys(pwd);
    }
    public void submit ()
    {
        wait.until(ExpectedConditions.elementToBeClickable(submit_btn)).click();
    }

}

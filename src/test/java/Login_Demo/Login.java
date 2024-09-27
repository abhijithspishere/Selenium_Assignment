package Login_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {

    WebDriver driver;

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
        PageFactory.initElements(driver,this);
    }

    //Action Methods
    public void setUserName(String user)
    {
        username_txt.sendKeys(user);
    }
    public void setPassword (String pwd)
    {
        password_txt.sendKeys(pwd);
    }
    public void submit ()
    {
        submit_btn.click();
    }

}

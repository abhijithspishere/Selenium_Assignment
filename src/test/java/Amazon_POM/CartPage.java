package Amazon_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CartPage
{
    WebDriver driver;
    WebDriverWait wait ;

    @FindBy(tagName = "button")
    List<WebElement> allButtons;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    WebElement cartElement;

    @FindBy(xpath = "//span[@class='a-dropdown-prompt']")
    WebElement cartQuantity;

    public CartPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver,this);
    }

    public void addToCart() throws InterruptedException
    {
        int cartCount = 0;
        for (WebElement eachButton : allButtons) {
            if(eachButton.getText().trim().equalsIgnoreCase("Add to Cart"))
            {
                cartCount++;
            }
            if (cartCount==1)
            {
                ((JavascriptExecutor)driver).executeScript("arguments[0].click();",eachButton);
                break;
            }
            break;
        }
        Thread.sleep(1000);
    }
    public void cartClick() throws InterruptedException {
       wait.until(ExpectedConditions.elementToBeClickable(cartElement));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",cartElement);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",cartElement);

        Thread.sleep(1000);
    }
    public void cartValidate ()
    {
        wait.until(ExpectedConditions.elementToBeClickable(cartQuantity));
        String cartString = cartQuantity.getText();
        int cartQuantityNum = Integer.parseInt(cartString);
        if (cartQuantityNum>0) {
            System.out.println("Cart Added Successfully");
        } else {
            System.out.println("Cart not added");
        }
//        System.out.println(cartValue>0?"Added to Cart Successfully ": "Error in Adding the product");
    }


}

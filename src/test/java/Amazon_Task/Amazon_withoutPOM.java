package Amazon_Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Amazon_withoutPOM
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement menuBar =
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath ("//i[@class='hm-icon nav-sprite']")));
        menuBar.click();

        WebElement menuComputer =
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='Mobiles, Computers']")));
        menuComputer.click();

        WebElement menuLaptop =
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Laptops')]")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",menuLaptop);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",menuLaptop);

        WebElement checkBoxApple =
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='apb-browse-refinements-checkbox_7']//i[@class='a-icon a-icon-checkbox']")));
        checkBoxApple.click();

        List<WebElement> allButton = driver.findElements(By.tagName("button"));
        int addToCartCount = 0;

        for(WebElement eachButton : allButton)
        {
            if (eachButton.getText().trim().equalsIgnoreCase("Add to Cart"))
            {
                addToCartCount++;
            }

            if (addToCartCount==1)
            {
                ((JavascriptExecutor)driver).executeScript("arguments[0].click();",eachButton);
                break;
            }
            break;
        }
        Thread.sleep(1000);

        WebElement cartElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='nav-cart-count']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",cartElement);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", cartElement);

        WebElement cartQuantity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='a-dropdown-prompt']")));
        int cartValue = Integer.parseInt(cartQuantity.getText());
        System.out.println(cartValue>0?"Cart Added Successfully":"Error in Adding the product");

    }
}

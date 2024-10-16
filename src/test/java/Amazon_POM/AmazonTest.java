package Amazon_POM;

import org.testng.annotations.Test;

public class AmazonTest extends AmazonBase
{

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


}

package TestNGnew.DataDrivenTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class FdCalculator {
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();
      /*  Alert myAlert = driver.switchTo().alert();
        myAlert.accept();*/

        String filepath = "src\\test\\java\\TestNGnew\\testData\\caldata.xlsx";
        int rows = ExcelUtils.getRowCount(filepath,"Sheet1");

        for (int i = 1; i <=rows ; i++) { //Here i=1 Because we don't need 1st row

            //Read data from Excel
            //We can pass column value only by each String value
            String principle = ExcelUtils.getCellData(filepath,"Sheet1",i,0);
            String rateOfInterest = ExcelUtils.getCellData(filepath,"Sheet1",i,1);
            String period1 = ExcelUtils.getCellData(filepath,"Sheet1",i,2);
            String period2 = ExcelUtils.getCellData(filepath,"Sheet1",i,3);
            String frequency = ExcelUtils.getCellData(filepath,"Sheet1",i,4);
            String expMaturity = ExcelUtils.getCellData(filepath,"Sheet1",i,5);

            //pass above data from excel to application

            driver.findElement(By.id("principal")).sendKeys(principle);
            driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateOfInterest);
            driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);

            WebElement dropDown = driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
            Select dropPer2 = new Select(dropDown);
            dropPer2.selectByVisibleText(period2);

            WebElement dropDown2 = driver.findElement(By.xpath("//select[@id='frequency']"));
            Select dropFreq = new Select(dropDown2);
            dropFreq.selectByVisibleText(frequency);

            driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();

            String actMaturity = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();

            if (Double.parseDouble(actMaturity)==Double.parseDouble(expMaturity))
            {
                System.out.println("Test Passed");
                ExcelUtils.setCellData(filepath,"Sheet1",i,7,"Passed");
                ExcelUtils.fillGreenColor(filepath,"Sheet1",i,7);

            }

            else
            {
                System.out.println("Failed");
                ExcelUtils.setCellData(filepath,"Sheet1",i,7,"Fail");
                ExcelUtils.fillRedColor(filepath,"Sheet1",i,7);


            }
            Thread.sleep(1000);
            driver.findElement(By.xpath("//img[@class='PL5']")).click();
        }
        driver.quit();
    }
}

package InternationalLotto1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by SBhudia on 24/03/2017.
 */
public class CACalifornia extends DriverManager
{

    public void caCalifornia() throws InterruptedException
    {
        // Clicking on Create Draw
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a")).click();

        // Selecting a Country from Sportcode Dropdown Menu
        WebElement sportcode = driver.findElement(By.name("sportCode"));
        Select lotto = new Select(sportcode);
        lotto.selectByValue("CA");

        Utilities utilities = new Utilities();
        utilities.addAdhocDraw();

        // Clicking on Home Page
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a")).click();
        System.out.println("You are now on Home page");

        //Selecting created draw.
        //  driver.findElement(By.className("ng-binding")).click();
        driver.findElement(By.linkText("CA California")).click();
        // driver.findElement(By.xpath("//*[@id=\"l-main\"]/pending-draws/div/table/tbody/tr[3]/td[1]/a")).click();
        System.out.println("A new Draw CREATED successfully.");

        //----------------------------------------------------------------------------------------------------------------------

        Utilities utilities1 = new Utilities();
        utilities1.offDraw1();

        //----------------------------------------------------------------------------------------------------------------------
        // Result Page :
        // 5 Standard Numbers are Selected from Section 1

        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[15]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[20]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[9]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[31]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[28]")).click();
        System.out.println("5 standard numbers selected");

        // 1 number selected from section 2
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[2]/div/div/button[8]")).click();
        System.out.println("1 standard numbers selected from section 2");

        //--------------------------------------------------------------------------------------------------------------
        Utilities utilities2 = new Utilities();
        utilities2.resultConfirmation1();
        System.out.println("Result Saved Alert message closed.");

        //--------------------------------------------------------------------------------------------------------------
        // Change Pending
        // clicking on CA California
        driver.findElement(By.linkText("CA California")).click();

        //clicking on change pending button
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[3]/button[3]")).click();

        // Switching to Alert Message and closing that mesasge, with Try Catch
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }
        System.out.println("Change Pending Alert Closed.");

        driver.findElement(By.linkText("CA California")).click();

        // Clicking on Result Button for Change Pending
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[3]/button[3]")).click();

        // 5 Standard Numbers are Selected as per the Game Rule, using single click

        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[15]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[20]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[31]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[17]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[25]")).click();
        System.out.println("5 NEW standard numbers selected");

        // 1 number selected from section 2
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[2]/div/div/button[18]")).click();
        System.out.println("1 NEW number selected from section 2");

        //--------------------------------------------------------------------------------------------------------------

        Utilities utilities3 = new Utilities();
        utilities3.resultConfirmation1();

        System.out.println("After changing numbers, RESULT SAVED Alert message closed.");
        //--------------------------------------------------------------------------------------------------------------

        // Void a draw
        // clicking on CA California
        driver.findElement(By.linkText("CA California")).click();
        Utilities utilities4 = new Utilities();
        utilities4.voidADraw1();

    }
}

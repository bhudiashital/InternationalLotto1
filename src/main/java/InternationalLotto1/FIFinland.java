package InternationalLotto1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by SBhudia on 27/03/2017.
 */
public class FIFinland extends DriverManager
{

    public void fiFinland() throws InterruptedException

    {

        // Clicking on Create Draw
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a")).click();


        // Selecting a Country from Sportcode Dropdown Menu
        WebElement sportcode = driver.findElement(By.name("sportCode"));
        Select lotto = new Select(sportcode);
        lotto.selectByValue("FI");
        Utilities utilities = new Utilities();
        utilities.addAdhocDraw();

        //-----------------------------------------------------------------------------------------------------------------



        // Clicking on Home Page
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a")).click();
        System.out.println("You are now on Home page");



        //Selecting created draw.

        driver.findElement(By.linkText("FI Finland")).click();

        System.out.println("A new Draw CREATED successfully.");

        Utilities utilities1 = new Utilities();
        utilities1.offDraw();

        //----------------------------------------------------------------------------------------------------------------------

        // Result Page :


        // 6 Standard Numbers are Selected as per the Game Rule, using single click

        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[20]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[9]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[31]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[7]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[28]")).click();
        System.out.println("6 standard numbers selected");

        //--------------------------------------------------------------------------------------------------------------

        Utilities utilities2 = new Utilities();
        utilities2.resultConfirmation();
        System.out.println("Result Saved Alert message closed.");

    //------------------------------------------------------------------------------------------------------------------

        // Change Pending
        // clicking on created draw.
        driver.findElement(By.linkText("FI Finland")).click();

        //clicking on change pending button
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[2]/button[3]")).click();

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


        driver.findElement(By.linkText("FI Finland")).click();


        // Clicking on Result Button for Change Pending
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[2]/button[3]")).click();

        // 6 Standard Numbers are Selected as per the Game Rule, using single click

        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[20]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[9]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[31]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[17]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[25]")).click();
        System.out.println("6 NEW standard numbers selected");


        //--------------------------------------------------------------------------------------------------------------

        Utilities utilities3 = new Utilities();
        utilities3.resultConfirmation();

        System.out.println("After changing numbers, RESULT SAVED Alert message closed.");
        //--------------------------------------------------------------------------------------------------------------

        // Void a draw
        // clicking on FI Finland
        driver.findElement(By.linkText("FI Finland")).click();

        Utilities utilities4 = new Utilities();
        utilities4.voidADraw();
    }
}

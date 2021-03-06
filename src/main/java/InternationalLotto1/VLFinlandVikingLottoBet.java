package InternationalLotto1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by SBhudia on 30/03/2017.
 */
public class VLFinlandVikingLottoBet extends DriverManager
{
    public void vlFinlandVikingLottoBet() throws InterruptedException
    {
        // Clicking on Create Draw
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a")).click();

        // Selecting a Country from Sportcode Dropdown Menu
        WebElement sportcode = driver.findElement(By.name("sportCode"));
        Select lotto = new Select(sportcode);
        lotto.selectByValue("VL");

        Utilities utilities0 = new Utilities();
        utilities0.addAdhocDraw();
       //-----------------------------------------------------------------------------------------------------------------
        // Clicking on Home Page
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a")).click();
        System.out.println("You are now on Home page");

        //Selecting created draw.
        driver.findElement(By.linkText("VL Finland Viking Lotto Bet")).click();

        // driver.findElement(By.xpath("//*[@id=\"l-main\"]/pending-draws/div/table/tbody/tr[3]/td[1]/a")).click();
        System.out.println("A new Draw CREATED successfully.");

        //----------------------------------------------------------------------------------------------------------------------

        Utilities utilities1 = new Utilities();
        utilities1.offDraw();
        // Result Page :
        // 6 Standard Numbers are Selected as per the Game Rule, using single click

        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[20]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[9]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[31]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[45]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[28]")).click();
        System.out.println("5 standard numbers selected");

        // Result Page : 2 Bonus number are selected using double click.
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[4]")).click();
        WebElement element = null;
        Actions action = new Actions(driver).doubleClick(element);
        action.build().perform();


        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[7]")).click();
        element = null;
        action = new Actions(driver).doubleClick(element);
        action.build().perform();
        System.out.println("2 Bonus numbers selected");

        //--------------------------------------------------------------------------------------------------------------

        Utilities utilities2 = new Utilities();
        utilities2.resultConfirmation();
        System.out.println("Result Saved Alert message closed.");

        //--------------------------------------------------------------------------------------------------------------
        // Change Pending
        // clicking on VL Finaland Lotto
        driver.findElement(By.linkText("VL Finland Viking Lotto Bet")).click();

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

        driver.findElement(By.linkText("VL Finland Viking Lotto Bet")).click();


        // Clicking on Result Button for Change Pending
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[2]/button[3]")).click();

        // 6 Standard Numbers are Selected as per the Game Rule, using single click

        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[15]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[20]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[9]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[31]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[25]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[29]")).click();
        System.out.println("6 NEW standard numbers selected");

        // Result Page : 2 Bonus numbers are selected using double click.
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[1]")).click();
        element = null;
        action = new Actions(driver).doubleClick(element);
        action.build().perform();

        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[1]/div/div/button[35]")).click();
        element = null;
        action = new Actions(driver).doubleClick(element);
        action.build().perform();

        System.out.println("2 NEW Bonus numbers selected");

        //--------------------------------------------------------------------------------------------------------------

        Utilities utilities3 = new Utilities();
        utilities3.resultConfirmation();

        //--------------------------------------------------------------------------------------------------------------
        // Void a draw
        // clicking on AB African Lotto

        driver.findElement(By.linkText("VL Finland Viking Lotto Bet")).click();
        Utilities utilities4 = new Utilities();
        utilities4.voidADraw();
    }
}

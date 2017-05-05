package InternationalLotto1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by SBhudia on 24/04/2017.
 */
public class Utilities extends DriverManager
{

    public static void addAdhocDraw() throws InterruptedException
    {


        Thread.sleep(1000);
        //Adding an Ad hoc draw

        driver.findElement(By.xpath(".//*[@id='l-main']/form/div[3]/div[1]/div/button")).click();
        System.out.println("Clicked on ADD New Ad hoc draw");

//        // Changing Date to tomorrow's
//        driver.findElement(By.xpath("//*[@id=\"adHocDate\"]")).click();
//
//        Thread.sleep(5000);

        //Entering Time
        driver.findElement(By.id("adHocTime")).sendKeys("21:00");
        System.out.println("Time entered 21:00");
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/ad-hoc-draw/div[3]/button[1]")).click();
        System.out.println("clicked on Create");

        //Clicking on Select All button

        driver.findElement(By.xpath("//*[@id=\"l-main\"]/form/div[2]/table[2]/tbody/tr[2]/td[6]/button")).click();



        // Clicking on Create Draw button.

        driver.findElement(By.xpath("//*[@id=\"l-main\"]/form/div[3]/div[2]/div/button[2]")).click();

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
        System.out.println("Create Draw Alert message closed.");

    }

    public static void addAdhocDraw1() throws InterruptedException
    {


        Thread.sleep(1000);
        //Adding an Ad hoc draw

        driver.findElement(By.xpath(".//*[@id='l-main']/form/div[3]/div[1]/div/button")).click();
        System.out.println("Clicked on ADD New Ad hoc draw");

//        // Changing Date to tomorrow's
//        driver.findElement(By.xpath("//*[@id=\"adHocDate\"]")).click();
//
       Thread.sleep(1000);

        //Entering Time
        driver.findElement(By.id("adHocTime")).sendKeys("21:00");
        System.out.println("Time entered 21:00");
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/ad-hoc-draw/div[3]/button[2]")).click();
        System.out.println("clicked on Create");

        //Clicking on Select All button

        driver.findElement(By.xpath("//*[@id=\"l-main\"]/form/div[2]/table[2]/tbody/tr[2]/td[6]/button")).click();



        // Clicking on Create Draw button.

        driver.findElement(By.xpath("//*[@id=\"l-main\"]/form/div[3]/div[2]/div/button[2]")).click();

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
        System.out.println("Create Draw Alert message closed.");

    }

    public static void offDraw()
    {

        //OffDraw

        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[2]/button[3]")).click();

        System.out.println("Off Draw Alert message closed.");

        System.out.println("New Feature 1");

        // Selecting Off Draw from Pending Draw list


        driver.findElement(By.xpath("/html/body/div[1]/div/div/off-draw/div[3]/button[1]")).click();
        System.out.println("New Feature  2");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/confirmation/div[3]/button[1]")).click();
        System.out.println("New Feature 2A");

        //   Switching to Alert Message and closing that mesasge, with Try Catch
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }
        // Clicking on Result Button
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[2]/button[3]")).click();
        System.out.println("New Feature  3");
    }


    public static void offDraw1()
    {

        //OffDraw

       // driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[2]/button[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[3]/button[3]")).click();

        System.out.println("Off Draw Alert message closed.");

        System.out.println("New Feature 1");

        // Selecting Off Draw from Pending Draw list


        driver.findElement(By.xpath("/html/body/div[1]/div/div/off-draw/div[3]/button[1]")).click();
        System.out.println("New Feature  2");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/confirmation/div[3]/button[1]")).click();
        System.out.println("New Feature 2A");

        //   Switching to Alert Message and closing that mesasge, with Try Catch
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }
        // Clicking on Result Button
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[3]/button[3]")).click();
        System.out.println("New Feature  3");
    }

    public static void resultConfirmation()
    {
        // Clicking on Save button to save the draw.
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[2]/button[3]")).click();

        //Clicking on Result confirmation
        //Giving Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/result-confirmation/div[3]/button[1]")));

        //Clicking on Button
        driver.findElement(By.xpath("/html/body/div[1]/div/div/result-confirmation/div[3]/button[1]")).click();
        System.out.println("Clicked on Result Confirmation Button. New Feature 4");

        // Switching to Alert Message and closing that mesasge, with Try Catch
        try
        {
            wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }
        System.out.println("After changing numbers, RESULT SAVED Alert message closed.");
    }
    public static void resultConfirmation1()
    {
        // Clicking on Save button to save the draw.
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[3]/button[3]")).click();

        //Clicking on Result confirmation
        //Giving Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/result-confirmation/div[3]/button[1]")));

        //Clicking on Button
        driver.findElement(By.xpath("/html/body/div[1]/div/div/result-confirmation/div[3]/button[1]")).click();
        System.out.println("Clicked on Result Confirmation Button. New Feature 4");

        // Switching to Alert Message and closing that mesasge, with Try Catch
        try
        {
            wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }
        System.out.println("After changing numbers, RESULT SAVED Alert message closed.");

    }





    public static void voidADraw() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[2]/button[2]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/confirmation/div[3]/button[1]")).click();


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

        System.out.println("Status changed to Void.");
        System.out.println("................................Test successfully completed for this Country......................................");
    }

    public static void voidADraw1() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"l-main\"]/div[3]/button[2]")).click();


        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/confirmation/div[3]/button[1]")).click();


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

        System.out.println("Status changed to Void.");
        System.out.println("................................Test successfully completed for this Country......................................");
    }
}

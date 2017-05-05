package InternationalLotto1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * INTERNATIONAL LOTTO PROJECT
 * Created by SBhudia on 10/03/2017.
 */
public class DriverManager
{




    public static WebDriver driver;



    public static void openBrowser()
    {
        //System.setProperty("webdriver.chrome.driver", "\\src\\main\\Resources\\chromedriver.exe");
        driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

        driver.manage().window().maximize();


        // Dev Environment
        //driver.get("http://dev.international-lottery.sis.tv/#!/createdraw");

        // QA Environment
        driver.get("http://qa.international-lottery.sis.tv/#!/");

        // Login to International Lottery

        driver.findElement(By.id("username")).sendKeys("sbhudia@sis.tv");
        driver.findElement(By.id("password")).sendKeys("Password!0");
        driver.findElement(By.xpath("//*[@id=\"l-login\"]/form/div[3]/button")).click();

        System.out.println("Login is successful on Login Page.");

    }

    public static void closeBrowser() throws Exception
    {

        System.out.println("------------------------All tests completed successfully.---------------------------------");
//        Thread.sleep(5000);
        //driver.close();

    }





}

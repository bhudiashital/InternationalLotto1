package InternationalLotto1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by SBhudia on 10/03/2017.
 */
public class LoginPage extends DriverManager
{



    public void linkspage()
    {

        driver.findElement(By.id("username")).sendKeys("sbhudia@sis.tv");
        driver.findElement(By.id("password")).sendKeys("Password!0");
        driver.findElement(By.xpath("//*[@id=\"l-login\"]/form/div[3]/button")).click();

        System.out.println("Login is successful on Login Page.");

    }


    }

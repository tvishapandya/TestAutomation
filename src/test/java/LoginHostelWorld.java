import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class LoginHostelWorld {

    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("truste-consent-button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5000);

        String parentWindowID = driver.getWindowHandle();
        driver.findElement(By.id("header-login")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//label[@id='btn-classic']/span")).click();

        driver.findElement(By.id("email")).sendKeys("tvishapandya02@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Test1234");
        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("avatar-circle")).click();
        Thread.sleep(5000);

        driver.findElement(By.linkText("Account")).click();
        Thread.sleep(5000);

        String url = driver.getCurrentUrl();
        System.out.println("url is:"+ url);
        Assert.assertEquals(url,"https://www.hostelworld.com/account/settings");
        Thread.sleep(5000);
        String str = driver.findElement(By.xpath("//a[@href='https://www.hostelworld.com/account']/span")).getText();
        System.out.println("STR: "+ str);
        Assert.assertEquals(str,"Bookings");
        Thread.sleep(5000);

        driver.close();
        driver.quit();
    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SearchHostelWorld {

    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("truste-consent-button")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5000);
        driver.findElement(By.id("location-text-input-field")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("current-location-text")).click();
        Thread.sleep(7000);
        WebElement element = driver.findElement(By.cssSelector("button[id='search-button']")); //facing problem
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(5000);

        String str2 = driver.findElement(By.className("featured-label")).getText();
        Assert.assertEquals(str2,"Featured Properties");

        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondTest_CSSSelector {

    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.co.uk/");
        driver.manage().window().maximize(); // To maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000)); //To wait implicitly (Will be taught later)
        //driver.findElement() //To accept the cookies (It is not showing the "accept cookies" button when url is opened manually
        Thread.sleep(5000);

       // driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_7']")).click(); //find element by Xpath
        driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_7']")).click(); //find element by CSS-Selector
        Thread.sleep(5000);

        driver.close();
    }
}

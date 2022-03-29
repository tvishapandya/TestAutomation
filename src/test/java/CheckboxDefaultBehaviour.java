import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class CheckboxDefaultBehaviour {

    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/signup");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5000);

        List<WebElement> lst= driver.findElements(By.tagName("a"));
        int n = lst.size();
        System.out.println(n);

        String str = driver.findElement(By.id("#TnC")).getAttribute("class");
        System.out.println(str);
        Assert.assertTrue(str.contains("fa-check-square"));

        driver.close();
        driver.quit();
    }
}

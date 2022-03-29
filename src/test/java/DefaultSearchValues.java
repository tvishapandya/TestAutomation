import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DefaultSearchValues {

    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("truste-consent-button")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("location-text-input-field")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("current-location-text")).click();

        String str1 = driver.findElement(By.className("trim-text")).getText();
        Assert.assertEquals(str1,"2 Guests");
        Thread.sleep(5000);

        driver.close();
        driver.quit();
    }

}

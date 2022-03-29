import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AccountRegistrationErrors {
    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/signup/");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='truste-consent-button']")).click();
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.id("submitSignupForm")).click();
        List<WebElement> lst = driver.findElements(By.cssSelector("small[class='error']"));

        int n = lst.size();
        System.out.println("size of list" + n);
        for (int i = 0; i < n; i++) System.out.println(lst.get(i).getText());

        Assert.assertEquals(lst.get(0).getText(), "Please Enter A Valid Username");
        Thread.sleep(5000);
        driver.close();
        driver.quit();

    }

}

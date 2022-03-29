import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class multiple_elements {

    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("truste-consent-button")).click();
        Thread.sleep(5000);

        List<WebElement> list1 = driver.findElements(By.className("pill-text"));
        String str1 = list1.get(0).getText();
        String str2 = list1.get(1).getText();

        System.out.println(str1 +","+ str2);
        driver.findElements(By.className("pill-text")).get(1).click();
        //Assert.assertEquals(str, "https://www.hostelworld.com/");
        driver.close();
    }

}
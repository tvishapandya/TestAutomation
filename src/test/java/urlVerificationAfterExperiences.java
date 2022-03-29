import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class urlVerificationAfterExperiences {

    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("truste-consent-button")).click();
        Thread.sleep(5000);

        driver.findElements(By.className("pill-text")).get(1).click();

        String parentWindowID = driver.getWindowHandle();
        Set<String> set1 = driver.getWindowHandles();
        Iterator iter = set1.iterator();
        while(iter.hasNext()){
            String childWindowID = iter.next().toString();

            if(!parentWindowID.equals(childWindowID)){

                driver.switchTo().window(childWindowID);
                String currentURL = driver.getCurrentUrl();
                System.out.println("current url" + currentURL);
                Assert.assertEquals(currentURL, "https://www.hostelworld.com/roamies/");
            }

        }
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }


}

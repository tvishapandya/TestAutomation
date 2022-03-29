import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class locatorDiffways {

    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/");
        Thread.sleep(5000);

        String str = driver.getCurrentUrl();
        Assert.assertEquals(str,"https://www.hostelworld.com/");

       //driver.findElement(By.id("search-button")).click(); //find element by id
        //driver.findElement(By.xpath("//*[@id='search-button']")).click(); // find element by xpath (You can also create the xpath)
        //driver.findElement(By.xpath("//button[@title='Let's go!']")).click(); //it is not working

        driver.findElement(By.xpath("//*[@data-testid='experiences-tab']")).click();
        Thread.sleep(5000);

        driver.close();
    }
}

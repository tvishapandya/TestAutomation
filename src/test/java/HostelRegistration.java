import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HostelRegistration {

    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/signup/");

        Thread.sleep(10000);
        driver.findElement(By.xpath("//button[@id='truste-consent-button']")).click();
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@name='Nickname']")).sendKeys("Firstname");
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("1234");
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("1234");
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Firstname");
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Firstname");
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Lastname");

        Select select = new Select(driver.findElement(By.id("Gender")));
        select.selectByValue("Male");
        Select select1 = new Select(driver.findElement(By.id("day")));
        select1.selectByValue("5");
        Select select2 = new Select(driver.findElement(By.id("month")));
        select2.selectByValue("7");
        Select select3 = new Select(driver.findElement(By.id("year")));
        select3.selectByValue("1980");
        Select select4 = new Select(driver.findElement(By.id("nationality")));
        select4.selectByValue("Australia");

        driver.findElement(By.xpath("//label[@for='SecurityPublic']")).click();
        driver.findElement(By.id("#TnC")).click();

        Thread.sleep(5000);

        driver.close();
        driver.quit();



    }
}

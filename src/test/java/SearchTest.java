import Pages.HomeHostelWorldPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchTest {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.hostelworld.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("truste-consent-button")).click();
    }

    @Test
    public void searchLocation() throws InterruptedException {

        HomeHostelWorldPage page1 = new HomeHostelWorldPage(driver);
        page1.clickOnSearchTextBox();
        Thread.sleep(5000);

        page1.clickOnCurrentLocation();
        String str = page1.getTextPlaceHolder();
        System.out.println("Place holder: " + str);
        Assert.assertEquals(str, "Where do you want to go?");

        String guestText = page1.getTextGuests();
        System.out.println("Guest Text: " + guestText);
        Assert.assertEquals(guestText,"2 Guests");
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}

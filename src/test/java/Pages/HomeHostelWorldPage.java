package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeHostelWorldPage {

    private WebDriver driver;

    @FindBy(id = "location-text-input-field")
        private WebElement searchTextBox;

    @FindBy(className = "current-location-text")
        private WebElement currentLocation;

    @FindBy(className = "trim-text")
        private WebElement guestValues;


    public HomeHostelWorldPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnSearchTextBox(){
        searchTextBox.click();
    }
    public String getTextPlaceHolder(){
        return searchTextBox.getAttribute("placeholder");
    }

    public void clickOnCurrentLocation(){
        currentLocation.click();
    }
    public String getTextGuests(){
        return guestValues.getText();
    }
}


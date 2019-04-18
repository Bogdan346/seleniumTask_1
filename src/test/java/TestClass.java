import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestClass {

    WebDriver driver = WebDriverSetting.getInstance();


    @Test
    public void testBBCPage() {
        driver.get("https://bbc.com");
        WebElement searchField = driver.findElement(By.id("orb-search-q"));
        System.out.println(searchField.isDisplayed());
        searchField.sendKeys("people");
        WebElement searchButton = driver.findElement(By.xpath("//*[@id='orb-search-button']"));
        System.out.println(searchButton.isEnabled());
        searchButton.click();
        driver.findElement(By.xpath("//*[@data-result-number='1']//h1//a"));
        //driver.close();
    }


}






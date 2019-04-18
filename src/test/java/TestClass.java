import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass {

    WebDriver driver = WebDriverSetting.getInstance();
    WebDriverWait wait = new WebDriverWait(driver, 5);

    @Test
    public void testBBCPage() {
        driver.get("https://bbc.com");
        WebElement searchField = driver.findElement(By.id("orb-search-q"));
        waiterDisplaed(searchField);

        searchField.sendKeys("people");

        WebElement searchButton = driver.findElement(By.xpath("//*[@id='orb-search-button']"));
        waiterDisplaed(searchButton);
        searchButton.click();
        driver.findElement(By.xpath("//*[@data-result-number='1']//h1//a")).click();
        //driver.close();
    }


    public void waiterDisplaed(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

    }
}






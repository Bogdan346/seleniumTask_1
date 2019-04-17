import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestClass {

    WebDriver driver = WebDriverSetting.getInstance();


    @Test
    public void testBBCPage() {
        driver.get("https://bbc.com");
        driver.findElement(By.xpath("//*[@id='orb-search-q']")).sendKeys("people");
        driver.findElement(By.xpath("//*[@id='orb-search-button']")).click();
        driver.findElement(By.xpath("//*[@data-result-number='1']//h1//a")).click();

    }


}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {

    @Test

    public void testFirst() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "d://projects/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = " https://www.99-bottles-of-beer.net/";
        String expectedResult = "https://www.99-bottles-of-beer.net/";


        driver.get(url);
        driver.manage().window().maximize();

        Thread.sleep(5000);
        String actualResult = driver.getCurrentUrl();
        ///Assert.assertEquals(actualResult, expectedResult);

        WebElement songWindow = driver.findElement(By.xpath("//*[@id=\'main\']/p[2]/a"));
        songWindow.click();
        Thread.sleep(5000);


        driver.close();
        driver.quit();

    }


}

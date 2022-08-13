import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class googleTest {



    @Test
    public void test() throws InterruptedException {
        String path = "/usr/bin/geckodriver";
        System.setProperty("webdriver.gecko.driver", path);
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        WebElement akzeptieren = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div"));
        akzeptieren.click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.getTitle().contains("Google"));
        driver.quit();
    }


}

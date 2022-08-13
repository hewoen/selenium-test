import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class googleTest {



    @Test
    public void test() throws InterruptedException {
        String path = System.getProperty("user.dir") + "/" + "src/main/resources/geckodriver";
        System.setProperty("webdriver.gecko.driver", path);
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        WebElement akzeptieren = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div"));
        akzeptieren.click();
        Thread.sleep(5000);
        driver.quit();
    }


}
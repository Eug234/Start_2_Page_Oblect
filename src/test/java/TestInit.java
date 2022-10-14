import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    WebDriver driver;

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void sleep(int s) {
        try {
            Thread.wakeUp(s * 1000);             //trying pull request with a conflict
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        public void goToGoogle() {
            driver.get("https://www.google.com");   //лучше проверить порнхаб

    }
}
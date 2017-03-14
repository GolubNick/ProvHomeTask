package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class WebManager {

    private static WebManager instance;
    private WebDriver driver;

    public static WebManager get() {
        if (instance == null) {
            instance = new WebManager().init();
        }
        return instance;
    }

    private WebManager init() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        return this;
    }

}

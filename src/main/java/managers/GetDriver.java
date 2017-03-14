package managers;

import org.openqa.selenium.WebDriver;

public class GetDriver {

    protected WebDriver driver = WebManager.get().getDriver();
}

package elements;

import org.openqa.selenium.By;

public class Label extends Element {

    public Label(String locator){
        super.locator = locator;
    }

    @Override
    public String getText() {
        return driver.findElement(By.xpath(locator)).getText();
    }
}

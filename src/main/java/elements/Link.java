package elements;

import org.openqa.selenium.By;

public class Link extends Element {

    public Link(String locator){
        super.locator = locator;
    }

    @Override
    public String getText() {
        return driver.findElement(By.xpath(locator)).getText();
    }

    @Override
    public void click() {
        driver.findElement(By.xpath(locator)).click();
    }
}

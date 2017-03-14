package elements;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Link extends Element {

    public Link(String locator){
        super.locator = locator;
    }

    @Override
    public String getText() {
        return $(By.xpath(locator)).getText();
    }

    @Override
    public void click() {
        $(By.xpath(locator)).click();
    }
}

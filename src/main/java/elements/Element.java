package elements;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Element implements IElement{

    String locator;


    @Override
    public boolean isVisible(){
        waitForElement();
        return $(By.xpath(locator)).exists();
    }

    @Override
    public void waitForElement(){
        $(By.xpath(locator)).waitUntil(Condition.appear, 2000l);
    }
}

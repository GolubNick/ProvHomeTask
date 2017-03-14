package elements;

import managers.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Element extends GetDriver implements IElement{

    String locator;


    @Override
    public boolean isVisible(){
        try{
            return driver.findElement(By.xpath(locator)).isDisplayed();
        } catch (NoSuchElementException e){
            return false;
        }
    }
}

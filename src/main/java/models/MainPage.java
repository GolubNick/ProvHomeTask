package models;

import elements.Link;
import elements.Page;

public class MainPage extends PageObject{

    private static MainPage instance;

    private Link chapter1;

    public static MainPage get(){
        if (instance == null){
            instance = new MainPage().init();
        }
        return instance;
    }

    private MainPage init(){
        super.pageLocator = new Page("//*[@class = 'mainbody']");
        chapter1 = new Link("//a[@href = '/chapter1']");
        return this;
    }

    public String getChapter1Text(){
        return chapter1.getText();
    }

    public void clickChapter1(){
        chapter1.click();
    }

    public boolean isChapter1Visible(){
        return chapter1.isVisible();
    }

}

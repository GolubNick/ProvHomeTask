package models;

import elements.Label;
import elements.Link;
import elements.Page;

public class Chapter1Page extends PageObject{

    private static Chapter1Page instance;

    private Link homePage;
    private Label assertText;

    public static Chapter1Page get(){
        if (instance == null){
            instance = new Chapter1Page().init();
        }
        return instance;
    }

    protected Chapter1Page init(){
        super.pageLocator = new Page("//*[@class = 'mainbody']");
        homePage = new Link("//a[@href = '/']");
        assertText = new Label("//*[@id='divontheleft']");
        return this;
    }

    public void clickHomePage(){
        homePage.click();
    }

    public String getAssertText(){
        return assertText.getText();
    }

    public boolean isHomePageVisible(){
        return homePage.isVisible();
    }

    public boolean isAssertTextVisible(){
        return assertText.isVisible();
    }
}
